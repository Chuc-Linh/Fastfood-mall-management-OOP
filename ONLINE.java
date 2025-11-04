
package sanpham;

public class ONLINE extends THANHTOAN{
    protected double PhiVC;
    public ONLINE(double TongTien, double PhiVC){
        super(TongTien);
        this.PhiVC=PhiVC;
    }
    @Override
    public double ThanhToan(){
        return TongTien+PhiVC*TongTien;
    }
}
