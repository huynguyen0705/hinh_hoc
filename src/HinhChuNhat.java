public class HinhChuNhat extends HinhHoc{
    private double ChieuDai;
    private double ChieuRong;

    public double getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(double chieuDai) {
        ChieuDai = chieuDai;
    }

    public double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(double chieuRong) {
        ChieuRong = chieuRong;
    }
    public HinhChuNhat(double chieuDai, double chieuRong){
        setChieuDai(chieuDai);
        setChieuRong(chieuRong);
    }
    public double tinhChuVi(){
        double chuvi = 0;
        return chuvi = (getChieuDai() + getChieuRong()) * 2;
    }
    public double tinhDienTich(){
        double dientich = 0;
        return dientich = getChieuDai() * getChieuRong();
    }
}
