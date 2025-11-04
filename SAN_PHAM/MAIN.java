package sanpham;

public class MAIN{
    public static void main(String[] args) {
        // Tao san pham rieng
        THUCAN com1 = new COM("C01", "Com tam", 30000, 1, 0.1, "Thit");
        THUCAN my1 = new MY("M01", "Mi xao", 25000, 1, 0.05, "Mi goi");
        NUOC nuoc1 = new NUOC("N01", "Coca", 15000, 1, 0.1, "L");

        // Tao combo gom thuc an + nuoc
        COMBO combo1 = new COMBO("CB01", "Combo Com + Nuoc", 0, 1, 0.1, com1, nuoc1);

        // Tao hoa don
        HOADON hd = new HOADON();
        hd.themSanPham(combo1);
        hd.themSanPham(my1); // them mon le
        
        hd.xuatHoaDon();

        // Tinh tien theo hinh thuc thanh toan
        double tong = hd.tinhTongTien();

        THANHTOAN tt1 = new OFFLINE(tong);
        System.out.println("Thanh toan truc tiep: " + tt1.ThanhToan() + " VND");

        THANHTOAN tt2 = new ONLINE(tong,0.05);
        System.out.println("Thanh toan online: " + tt2.ThanhToan() + " VND");
    }
}
