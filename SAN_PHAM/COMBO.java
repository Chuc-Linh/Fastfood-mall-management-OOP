
package sanpham;
public class COMBO extends SANPHAM {
    private THUCAN monAn;
    private NUOC nuocUong;

    public COMBO(String Ma, String Ten, double Gia, int SoLuong, double GiamGia,
                 THUCAN monAn, NUOC nuocUong) {
        super(Ma, Ten, Gia, SoLuong, GiamGia);
        this.monAn = monAn;
        this.nuocUong = nuocUong;
    }

    @Override
    public double TinhTien() {
        double tong = monAn.TinhTien() + nuocUong.TinhTien();
        return tong - tong * GiamGia; 
    }
    
     public void xuatThongTin() {
        System.out.println("===== COMBO =====");
        System.out.println("Mã combo: " + Ma);
        System.out.println("Tên combo: " + Ten);
        System.out.println("Món ăn: " + monAn.Ten + " (" + monAn.TinhTien() + " VND)");
        System.out.println("Nước uống: " + nuocUong.Ten + " (" + nuocUong.TinhTien() + " VND)");
        System.out.println("Giảm giá combo: " + (GiamGia * 100) + "%");
        System.out.println("=> Tổng tiền combo: " + TinhTien() + " VND");
        System.out.println("=================\n");
    }
}

