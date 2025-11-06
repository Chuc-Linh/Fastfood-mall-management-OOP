package Nguoi;
import Interface.Itaikhoan;

public class quanly extends nguoi {

    private String tenTK;
    private String matKhau;
    protected String maNV;
    protected String chucvu;
    protected int songaynghi;

    public quanly(String maDG, String ngaysinh, String GT, String maNV, String chucvu, int songaynghi) {
        super(maDG, ngaysinh, GT);
        this.maNV = maNV;
        this.chucvu = chucvu;
        this.songaynghi = songaynghi;
    }

    public float tinhLuong() {
        return 1000000;
    }

    public void xuat() {
        super.xuat();
    }
}
