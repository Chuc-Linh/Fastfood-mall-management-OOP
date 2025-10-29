public class main {
    public static void main(String[] args) {
        nguoi ng = new nguoi("DG000", "31/12/1980","nm");
        ng.xuat();

        nhanvien nv = new nhanvien("DG001", "01/01/1990","nam", "NV001", "Quan ly", 2);
        nv.xuat();

        khachhang kh = new khachhang("DG002", "02/02/1992","nu", "KH001", "Nguyen Thi A");
        kh.xuat();

        quanly ql = new quanly("DG003", "03/03/1985","nam", "QL001", "Giam doc", 5);
        ql.xuat();
    }
}
