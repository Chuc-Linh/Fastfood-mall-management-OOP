public class nguoi {
    protected String maDG;
    protected String ngaysinh;
    protected String GT;

    public String getMaDG() {
        return maDG;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getGT() {
        return GT;
    }

    public nguoi(String maDG, String ngaysinh, String GT) {
        this.maDG = maDG;
        this.ngaysinh = ngaysinh;
        if(GT.equals("nam") || GT.equals("nu")) {
            this.GT = GT;
        } else {
            this.GT = "nam";
        }
    }

    public void xuat() {
        System.out.println("\n");
        System.out.println("Ma DG: " + maDG);
        System.out.println("Ngay sinh: " + ngaysinh);
        System.out.println("Gioi tinh: " + GT);
    }

}