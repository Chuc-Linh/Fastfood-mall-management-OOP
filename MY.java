
package sanpham;

public class MY extends THUCAN {
    private String LoaiMy;
    public MY(String Ma, String Ten, double Gia, int SoLuong, double GiamGia, String LoaiMy)
    {
        super(Ma,Ten,Gia,SoLuong,GiamGia);
        this.LoaiMy=LoaiMy;
    }
    
    @Override
    public double TinhTien(){
        return Gia-GiamGia*Gia;
    }
}
