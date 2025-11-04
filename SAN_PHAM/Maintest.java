package sanpham;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class Maintest {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\LAP TRINH HUONG DOI TUONG\\DU AN CUOI KHOA\\SANPHAM\\src\\sanpham\\DATA.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("SANPHAM");

            HOADON hd = new HOADON();

            for (int i = 0; i < nList.getLength(); i++) {
                Element spElement = (Element) nList.item(i);
                String type = spElement.getAttribute("type");

                String ma = spElement.getElementsByTagName("Ma").item(0).getTextContent();
                String ten = spElement.getElementsByTagName("Ten").item(0).getTextContent();
                double gia = Double.parseDouble(spElement.getElementsByTagName("Gia").item(0).getTextContent());
                int soLuong = Integer.parseInt(spElement.getElementsByTagName("SoLuong").item(0).getTextContent());
                double giamGia = Double.parseDouble(spElement.getElementsByTagName("GiamGia").item(0).getTextContent());

                SANPHAM sp = null;

                switch (type) {
                    case "MY":
                        String loaiMy = spElement.getElementsByTagName("LoaiMy").item(0).getTextContent();
                        sp = new MY(ma, ten, gia, soLuong, giamGia, loaiMy);
                        break;
                    case "COM":
                        String them = spElement.getElementsByTagName("Them").item(0).getTextContent();
                        sp = new COM(ma, ten, gia, soLuong, giamGia, them);
                        break;
                    case "GA":
                        sp = new GA(ma, ten, gia, soLuong, giamGia);
                        break;
                    case "NUOC":
                        String size = spElement.getElementsByTagName("Size").item(0).getTextContent();
                        sp = new NUOC(ma, ten, gia, soLuong, giamGia, size);
                        break;
                    case "COMBO":
                        // Lấy món ăn
                        Element monAnE = (Element) spElement.getElementsByTagName("MonAn").item(0);
                        String monAnType = monAnE.getAttribute("type");
                        String maMA = monAnE.getElementsByTagName("Ma").item(0).getTextContent();
                        String tenMA = monAnE.getElementsByTagName("Ten").item(0).getTextContent();
                        double giaMA = Double.parseDouble(monAnE.getElementsByTagName("Gia").item(0).getTextContent());
                        int slMA = Integer.parseInt(monAnE.getElementsByTagName("SoLuong").item(0).getTextContent());
                        double ggMA = Double.parseDouble(monAnE.getElementsByTagName("GiamGia").item(0).getTextContent());
                        THUCAN monAn = new GA(maMA, tenMA, giaMA, slMA, ggMA);

                        // Lấy nước uống
                        Element nuocE = (Element) spElement.getElementsByTagName("NuocUong").item(0);
                        String sizeN = nuocE.getElementsByTagName("Size").item(0).getTextContent();
                        String maN = nuocE.getElementsByTagName("Ma").item(0).getTextContent();
                        String tenN = nuocE.getElementsByTagName("Ten").item(0).getTextContent();
                        double giaN = Double.parseDouble(nuocE.getElementsByTagName("Gia").item(0).getTextContent());
                        int slN = Integer.parseInt(nuocE.getElementsByTagName("SoLuong").item(0).getTextContent());
                        double ggN = Double.parseDouble(nuocE.getElementsByTagName("GiamGia").item(0).getTextContent());
                        NUOC nuocUong = new NUOC(maN, tenN, giaN, slN, ggN, sizeN);

                        sp = new COMBO(ma, ten, gia, soLuong, giamGia, monAn, nuocUong);
                        break;
                }

                if (sp != null) {
                    hd.themSanPham(sp);
                }
            }

            // In hóa đơn
            hd.xuatHoaDon();

            // Thanh toán online (ví dụ)
            THANHTOAN tt = new ONLINE(hd.tinhTongTien(), 0.05);
            System.out.println("\nTổng thanh toán online (thêm 5% phí VC): " + tt.ThanhToan() + " VND");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
