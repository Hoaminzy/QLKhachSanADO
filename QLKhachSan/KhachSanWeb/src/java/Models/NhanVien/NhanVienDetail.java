
package Models.NhanVien;
public class NhanVienDetail extends NhanVien{
    String sTenBP;

    public NhanVienDetail() {
        super();
    }
    public NhanVienDetail(String sTenBP, String PK_iMaNV, String sTenNV, String sChucVu, String sSDT, float fuong, String dNgaySinh, boolean bGioiTinh, String sDiaChi, String sTinhTrang, String PK_iMaBP) {
        super(PK_iMaNV, sTenNV, sChucVu, sSDT, fuong, dNgaySinh, bGioiTinh, sDiaChi, sTinhTrang, PK_iMaBP);
        this.sTenBP = sTenBP;
    }

    public String getsTenBP() {
        return sTenBP;
    }

    public void setsTenBP(String sTenBP) {
        this.sTenBP = sTenBP;
    }
    
    
}
