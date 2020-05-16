/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.KhachHang;
public class KhachHang {
    String PK_iMaKH;
    String sTenKH;
    String sCMND;
    String sSDT;
    String sQuocTich;
   boolean bGioiTinh;
   String dNgaySinh;

    public KhachHang() {
        super();
    }

    public KhachHang(String PK_iMaKH, String sTenKH, String sCMND, String sSDT, String sQuocTich, boolean bGioiTinh, String dNgaySinh) {
        this.PK_iMaKH = PK_iMaKH;
        this.sTenKH = sTenKH;
        this.sCMND = sCMND;
        this.sSDT = sSDT;
        this.sQuocTich = sQuocTich;
        this.bGioiTinh = bGioiTinh;
        this.dNgaySinh = dNgaySinh;
    }

    public String getPK_iMaKH() {
        return PK_iMaKH;
    }

    public void setPK_iMaKH(String PK_iMaKH) {
        this.PK_iMaKH = PK_iMaKH;
    }

    public String getsTenKH() {
        return sTenKH;
    }

    public void setsTenKH(String sTenKH) {
        this.sTenKH = sTenKH;
    }

    public String getsCMND() {
        return sCMND;
    }

    public void setsCMND(String sCMND) {
        this.sCMND = sCMND;
    }

    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public String getsQuocTich() {
        return sQuocTich;
    }

    public void setsQuocTich(String sQuocTich) {
        this.sQuocTich = sQuocTich;
    }

    public boolean isbGioiTinh() {
        return bGioiTinh;
    }

    public void setbGioiTinh(boolean bGioiTinh) {
        this.bGioiTinh = bGioiTinh;
    }

    public String getdNgaySinh() {
        return dNgaySinh;
    }

    public void setdNgaySinh(String dNgaySinh) {
        this.dNgaySinh = dNgaySinh;
    }

   
    
}
