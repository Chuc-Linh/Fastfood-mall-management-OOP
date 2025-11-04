
package sanpham;

public abstract class THANHTOAN {
    protected double TongTien;
    public THANHTOAN(double TongTien){
        this.TongTien=TongTien;
    }
    public abstract double ThanhToan();
}
