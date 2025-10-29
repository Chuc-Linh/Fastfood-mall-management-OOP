import Interface.Itaikhoan;

public class khachhang extends nguoi implements Itaikhoan {
    private String maKH;
    private String tenKH;

    private String tenTK;
    private String matKhau;

    public khachhang(String maDG, String ngaysinh,String GT, String maKH, String tenKH) {
        super(maDG, ngaysinh, GT);
        this.maKH = maKH;
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    @Override
    public String getTenTK() {
        return tenTK;
    }

    @Override
    public String getMatKhau() {
        return matKhau;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma KH: " + maKH);
        System.out.println("Ten KH: " + tenKH);
    }
}
