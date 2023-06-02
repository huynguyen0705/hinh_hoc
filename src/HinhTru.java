public class HinhTru extends HinhTron{
    private double ChieuCao;

    public double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(double chieuCao) {
        ChieuCao = chieuCao;
    }

    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        setChieuCao(chieuCao);
    }
    public double tinhTheTich(){
        double thetich = 0;
        double PI = 3.14;
        return thetich = PI * getBanKinh() * getBanKinh() * getChieuCao();
    }
}
