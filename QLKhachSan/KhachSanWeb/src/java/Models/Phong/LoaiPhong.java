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
public class LoaiPhong {
    String PK_iMaLoaiPhong;
    String sTenLoaiPhong;

    public LoaiPhong() {
        super();
    }

    public LoaiPhong(String PK_iMaLoaiPhong, String sTenLoaiPhong) {
        this.PK_iMaLoaiPhong = PK_iMaLoaiPhong;
        this.sTenLoaiPhong = sTenLoaiPhong;
    }

    public String getPK_iMaLoaiPhong() {
        return PK_iMaLoaiPhong;
    }

    public void setPK_iMaLoaiPhong(String PK_iMaLoaiPhong) {
        this.PK_iMaLoaiPhong = PK_iMaLoaiPhong;
    }

    public String getsTenLoaiPhong() {
        return sTenLoaiPhong;
    }

    public void setsTenLoaiPhong(String sTenLoaiPhong) {
        this.sTenLoaiPhong = sTenLoaiPhong;
    }
     
    
}
