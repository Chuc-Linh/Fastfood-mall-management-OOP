
package sanpham;
public abstract class THUCAN extends SANPHAM {
    public THUCAN(String Ma, String Ten, double Gia, int SoLuong, double GiamGia)
    {
        super(Ma,Ten,Gia,SoLuong,GiamGia);
    }
    
    @Override
    public abstract double TinhTien();
}
