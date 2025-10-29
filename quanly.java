import Interface.Itaikhoan;

public class quanly extends nhanvien implements Itaikhoan {

    private String tenTK;
    private String matKhau;

    public quanly(String maDG, String ngaysinh, String GT, String maNV, String chucvu, int songaynghi) {
        super(maDG, ngaysinh, GT, maNV, chucvu, songaynghi);
    }

    @Override
    public String getTenTK() {
        return tenTK;
    }

    @Override
    public String getMatKhau() {
        return matKhau;
    }

}
