/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Phong;

/**
 *
 * @author vhc
 */
public class PhongDetail extends Phong{
    String sTenLoaiPhong;
    String sTenNV;

    public PhongDetail() {
        super();
    }

    public PhongDetail(String sTenLoaiPhong, String sTenNV, String PK_iMaPhong, String sTenPhong, float fGiaPhong, String sMota, String sHinhanh, String PK_iMaLoaiPhong, String PK_iMaNV) {
        super(PK_iMaPhong, sTenPhong, fGiaPhong, sMota, sHinhanh, PK_iMaLoaiPhong, PK_iMaNV);
        this.sTenLoaiPhong = sTenLoaiPhong;
        this.sTenNV = sTenNV;
    }

    public String getsTenLoaiPhong() {
        return sTenLoaiPhong;
    }

    public void setsTenLoaiPhong(String sTenLoaiPhong) {
        this.sTenLoaiPhong = sTenLoaiPhong;
    }

    public String getsTenNV() {
        return sTenNV;
    }

    public void setsTenNV(String sTenNV) {
        this.sTenNV = sTenNV;
    }
    
    
}
