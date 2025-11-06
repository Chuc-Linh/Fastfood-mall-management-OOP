package Nguoi;

import Interface.Itaikhoan;
import sanpham.HOADON;

public class taiKhoan extends nguoi implements Itaikhoan {
    private String tenTK;
    private String matKhau;
    private int SLM;

    public taiKhoan(String tenTK, String matKhau, String maDG, String ngaysinh, String GT) {
        super(maDG, ngaysinh, GT);
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.SLM = 0;
    }

    public String getTenTK() {
        return tenTK;
    }

    public String getMK() {
        return matKhau;
    }

    @Override
    public void dangnhap(String tk, String mk) {
        if (this.tenTK.equals(tk) && this.matKhau.equals(mk)) {
            System.out.println("Đăng nhập thành công!\n");
        } else {
            System.out.println("Sai tên tài khoản hoặc mật khẩu!");
        }
    }

    @Override
    public void dangxuat() {
        System.out.println("Đã đăng xuất tài khoản " + tenTK.toUpperCase() + "\n");
    }

    public int getSLM() { return SLM;}

    public void muaHang() {
        SLM++;
    }

    public void xuat() {
        super.xuat();
        System.out.println("Đã mua hàng, tổng số lần mua: " + SLM);
    }

}
