package Nguoi;

import Interface.Itaikhoan;

public class taiKhoan implements Itaikhoan {
    private String tenTK;
    private String matKhau;
    private int SLM;

    public taiKhoan(String tenTK, String matKhau) {
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
        if (this.tenTK.equals(tenTK) && this.matKhau.equals(matKhau)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Sai tên tài khoản hoặc mật khẩu!");
        }
    }

    @Override
    public void dangxuat() {
        System.out.println("Đã đăng xuất tài khoản " + tenTK);
    }

    public int getSLM() { return SLM;}

    public void muaHang() {
        SLM++;
        System.out.println("Đã mua hàng, tổng số lần mua: " + SLM);
    }

}
