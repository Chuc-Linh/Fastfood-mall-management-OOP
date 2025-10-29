import Interface.Idanhhieu;

public class nhanvien extends nguoi implements Idanhhieu {
    protected String maNV;
    protected String chucvu;
    protected int songaynghi;

    public String getMaNV() {
        return maNV;
    }

    public String getChucvu() {
        return chucvu;
    }
    
    public int getSongaynghi() {
        return songaynghi;
    }

    public nhanvien(String maDG, String ngaysinh, String GT, String maNV, String chucvu, int songaynghi) {
        super(maDG, ngaysinh, GT);
        this.maNV = maNV;
        this.chucvu = chucvu;
        this.songaynghi = songaynghi;
    }

    public float tinhLuong() {
        return 1000000 - (songaynghi * 50000);
    }
    
    @Override
    public String DanhHieu() {
        if(songaynghi == 0) {
            return "Nhan vien xuat sac";
        } else if (songaynghi <= 2) {
            return "Nhan vien gioi";
        } else if (songaynghi <= 5) {
            return "Nhan vien kha";
        } else {
            return "Nhan vien trung binh";
        }
    }
    
    @Override
    public void xuat() {
    super.xuat();
        System.out.println("Ma NV: " + maNV);
        System.out.println("Chuc vu: " + DanhHieu());
        System.out.println("So ngay nghi: " + songaynghi);
        System.out.println("Luong: " + tinhLuong());
    }
}
