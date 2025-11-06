import Nguoi.*;
import sanpham.*;

public class main {
    public static void main(String[] args) {
        khachhang kh = new khachhang("DG002", "02/02/1992","nu", "KH001", "Nguyen Thi A");
//        khachhang kh2 = new khachhang("DG004", "02/02/1998","na", "KH002", "Nguyen Van B");

        taiKhoan tk = new taiKhoan("long", "123", "DG001", "02-02-2003", "m");
        tk.dangnhap("long", "123");
        tk.xuat();
        tk.dangxuat();

        THUCAN com1 = new COM("C01", "Com tam", 30000, 1, 0.1, "Thit");
        THUCAN my1 = new MY("M01", "Mi xao", 25000, 1, 0.05, "Mi goi");
        NUOC nuoc1 = new NUOC("N01", "Coca", 15000, 1, 0.1, "L");
        COMBO combo1 = new COMBO("CB01", "Combo Com + Nuoc", 0, 1, 0.1, com1, nuoc1);

        // Tao hoa don
        HOADON hd = new HOADON(tk);
        hd.themSanPham(combo1);
        hd.xuatHoaDon();

        tk.dangnhap("long", "123");
        tk.xuat();
        tk.dangxuat();

    }
}
