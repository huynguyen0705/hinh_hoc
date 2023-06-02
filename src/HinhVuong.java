public class HinhVuong extends HinhHoc{
    private double CanhHinhVuong;

    public double getCanhHinhVuong() {
        return CanhHinhVuong;
    }

    public void setCanhHinhVuong(double canhHinhVuong) {
        CanhHinhVuong = canhHinhVuong;
    }
    public HinhVuong(double canhHinhVuong){
        setCanhHinhVuong(canhHinhVuong);
    }
    public double tinhChuVi(){
        double chuvi = 0;
        return chuvi = getCanhHinhVuong() * 4;
    }
    public double tinhDienTich(){
        double dientich = 0;
        return dientich = getCanhHinhVuong() * getCanhHinhVuong();
    }
}
