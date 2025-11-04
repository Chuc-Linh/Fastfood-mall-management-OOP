
package sanpham;
public class NUOC extends SANPHAM {
    protected String Size;
    public NUOC(String Ma, String Ten, double Gia, int SoLuong, double GiamGia, String Size)
    {
        super(Ma,Ten,Gia,SoLuong,GiamGia);
        if(!Size.equals("XL")&&!Size.equals("L")&&!Size.equals("M"))
            this.Size="M";
        else
            this.Size=Size;
    }
    
    @Override
    public double TinhTien(){
        if(Size.equals("M"))
            return Gia-GiamGia*Gia;
        if(Size.equals("L"))
            return (Gia-GiamGia*Gia)*(1.4);
        else
            return (Gia-GiamGia*Gia)*(1.7);
    }
}
