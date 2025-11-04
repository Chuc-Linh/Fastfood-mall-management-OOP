
package sanpham;

abstract public class SANPHAM {
    protected String Ma;
    protected String Ten;
    protected double Gia;
    protected int SoLuong;
    protected double GiamGia;
    
    public SANPHAM(String Ma, String Ten, double Gia, int SoLuong, double GiamGia)
    {
        this.Ma=Ma;
        this.Ten=Ten;
        this.Gia=Gia;
        if(SoLuong<0)
            this.SoLuong=0;
        else 
            this.SoLuong=SoLuong;
        if(GiamGia>1)
            this.GiamGia=1;
        else
            this.GiamGia=GiamGia;
    }
    
    public abstract double TinhTien();
    
}
