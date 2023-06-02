public class HinhTron extends HinhHoc{
    private double BanKinh;

    public double getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(double banKinh) {
        BanKinh = banKinh;
    }
    public HinhTron(double banKinh){
        setBanKinh(banKinh);
    }
    public double tinhChuVi(){
        double chuvi = 0;
        double PI = 3.14;
        chuvi = 2 * getBanKinh() * PI;
        return chuvi;
    }
    public double tinhDienTich(){
        double dientich = 0;
        double PI = 3.14;
        dientich = PI * getBanKinh() * getBanKinh();
        return dientich;
    }
}
