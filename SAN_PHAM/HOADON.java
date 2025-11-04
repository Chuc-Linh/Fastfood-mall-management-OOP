package sanpham;

import java.util.ArrayList;

public class HOADON {
    private ArrayList<SANPHAM> danhSach;
    
    public HOADON() {
        danhSach = new ArrayList<>();
    }
    
    public void themSanPham(SANPHAM sp) {
        danhSach.add(sp);
    }
    
    public double tinhTongTien() {
        double tong = 0;
        for (SANPHAM sp : danhSach) {
            tong += sp.TinhTien();
        }
        return tong;
    }
    
    public void xuatHoaDon() {
        for (SANPHAM sp : danhSach) {
            System.out.println(sp.Ten + " - " + sp.TinhTien() + " VND");
        }
        System.out.println("Tong cong: " + tinhTongTien() + " VND");
    }
}
