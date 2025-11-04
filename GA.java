
package sanpham;

public class GA extends THUCAN {
    public GA(String Ma, String Ten, double Gia, int SoLuong, double GiamGia)
    {
        super(Ma,Ten,Gia,SoLuong,GiamGia);
    }
    
    @Override
    public double TinhTien(){
        return Gia-GiamGia*Gia;
    }
}
