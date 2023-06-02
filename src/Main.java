import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhHoc hinhHoc = new HinhHoc();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Tính chu vi và diện tích (hình tròn, hình vuông, hình chữ nhật)");
            System.out.println("2. Tính thể tích hình trụ");
            System.out.println("Vui lòng nhập lựa chọn: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 2){
                System.out.println("Nhập không hợp lệ");
            }
            switch (input){
                case 1:
                    System.out.println("1. Hình tròn");
                    System.out.println("2. Hình vuông");
                    System.out.println("3. Hình Chữ Nhật");
                    int input1 = scanner.nextInt();
                    if (input1 < 1 || input1 > 3){
                        System.out.println("Nhập không hợp lệ");
                    }
                    switch (input1){
                        case 1:
                            System.out.println("Nhập bán kính: ");
                            Scanner scanner1 = new  Scanner(System.in);
                            double banKinh = scanner1.nextDouble();
                            HinhTron hinhTron = new HinhTron(banKinh);
                            System.out.println("Chu vi hình tròn: " + hinhTron.tinhChuVi());
                            System.out.println("Diện tích hình tròn: " + hinhTron.tinhDienTich());
                            break;
                        case 2:
                            System.out.println("Nhập cạnh: ");
                            Scanner scanner2 = new  Scanner(System.in);
                            double canhHinhVuong = scanner2.nextDouble();
                            HinhVuong hinhVuong = new HinhVuong(canhHinhVuong);
                            System.out.println("Chu vi hình vuông: " + hinhVuong.tinhChuVi());
                            System.out.println("Diện tích hình vuông: " + hinhVuong.tinhDienTich());
                            break;
                        case 3:
                            System.out.println("Nhập chiều dài: ");
                            Scanner scanner3 = new  Scanner(System.in);
                            double chieuDai  = scanner3.nextDouble();
                            System.out.println("Nhập chiều rộng: ");
                            Scanner scanner4 = new  Scanner(System.in);
                            double chieuRong = scanner4.nextDouble();
                            HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);
                            System.out.println("Chu vi hình chữ nhật: " + hinhChuNhat.tinhChuVi());
                            System.out.println("Diện tích hình chữ nhật: " +hinhChuNhat.tinhDienTich());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tính thể tích hình trụ");
                    System.out.println("Nhập bán kính: ");
                    Scanner scanner5 = new  Scanner(System.in);
                    double banKinh = scanner5.nextDouble();
                    System.out.println("Nhập chiều cao: ");
                    Scanner scanner6 = new  Scanner(System.in);
                    double chieuCao = scanner6.nextDouble();
                    HinhTru hinhTru = new HinhTru(banKinh, chieuCao);
                    System.out.println("Thể tích hình trụ là: " + hinhTru.tinhTheTich());
                    break;
            }
        }
    }
}