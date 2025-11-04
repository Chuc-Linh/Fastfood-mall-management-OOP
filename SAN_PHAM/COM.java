
package sanpham;

public class COM extends THUCAN{
    private String Them;
    public COM(String Ma, String Ten, double Gia, int SoLuong, double GiamGia, String Them)
    {
        super(Ma,Ten,Gia,SoLuong,GiamGia);
        if(!Them.equals("Com")&&!Them.equals("Rau")&&!Them.equals("Thit")&&!Them.equals("Ca"))
            this.Them="Khong";
        else
            this.Them=Them;
    }
     
    public double TienThem(){
        if(Them.equals("Com"))
            return 5;
        if(Them.equals("Rau"))
            return 5;
        if(Them.equals("Thit"))
            return 10;
        if(Them.equals("Ca"))
            return 15;
        else 
            return 0;
    }
    
    @Override
    public double TinhTien(){
        return Gia - GiamGia*Gia + TienThem() ;
    }
    
}
