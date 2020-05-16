/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.NhanVien;

/**
 *
 * @author vhc
 */
public class NhanVien {
    String PK_iMaNV;
    String sTenNV;
    String sChucVu;
    String sSDT;
    float fuong;
    String dNgaySinh;
    boolean bGioiTinh;
    String sDiaChi;
    String sTinhTrang;
    String PK_iMaBP;

    public NhanVien() {
    }

    public NhanVien(String PK_iMaNV, String sTenNV, String sChucVu, String sSDT, float fuong, String dNgaySinh, boolean bGioiTinh, String sDiaChi, String sTinhTrang, String PK_iMaBP) {
        this.PK_iMaNV = PK_iMaNV;
        this.sTenNV = sTenNV;
        this.sChucVu = sChucVu;
        this.sSDT = sSDT;
        this.fuong = fuong;
        this.dNgaySinh = dNgaySinh;
        this.bGioiTinh = bGioiTinh;
        this.sDiaChi = sDiaChi;
        this.sTinhTrang = sTinhTrang;
        this.PK_iMaBP = PK_iMaBP;
    }

    public String getPK_iMaNV() {
        return PK_iMaNV;
    }

    public void setPK_iMaNV(String PK_iMaNV) {
        this.PK_iMaNV = PK_iMaNV;
    }

    public String getsTenNV() {
        return sTenNV;
    }

    public void setsTenNV(String sTenNV) {
        this.sTenNV = sTenNV;
    }

    public String getsChucVu() {
        return sChucVu;
    }

    public void setsChucVu(String sChucVu) {
        this.sChucVu = sChucVu;
    }

    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public float getFuong() {
        return fuong;
    }

    public void setFuong(float fuong) {
        this.fuong = fuong;
    }

    public String getdNgaySinh() {
        return dNgaySinh;
    }

    public void setdNgaySinh(String dNgaySinh) {
        this.dNgaySinh = dNgaySinh;
    }

    public boolean getbGioiTinh() {
        return bGioiTinh;
    }

    public void setbGioiTinh(boolean bGioiTinh) {
        this.bGioiTinh = bGioiTinh;
    }

    public String getsDiaChi() {
        return sDiaChi;
    }

    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    public String getsTinhTrang() {
        return sTinhTrang;
    }

    public void setsTinhTrang(String sTinhTrang) {
        this.sTinhTrang = sTinhTrang;
    }

    public String getPK_iMaBP() {
        return PK_iMaBP;
    }

    public void setPK_iMaBP(String PK_iMaBP) {
        this.PK_iMaBP = PK_iMaBP;
    }

  
    
    
    
}
