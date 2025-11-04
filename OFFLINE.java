
package sanpham;

public class OFFLINE extends THANHTOAN{
    public OFFLINE(double TongTien){
        super(TongTien);
    }
    
    @Override
    public double ThanhToan(){
        return TongTien;
    }
}
