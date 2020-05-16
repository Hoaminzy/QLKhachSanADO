/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DichVu;

/**
 *
 * @author vhc
 */
public class DichVu {
    String PK_iMaCTDV;
    String sTenDV;
    float fDonGia;
    String PK_iMaDV;

    public DichVu() {
        super();
    }

    public DichVu(String PK_iMaCTDV, String sTenDV, float fDonGia, String PK_iMaDV) {
        this.PK_iMaCTDV = PK_iMaCTDV;
        this.sTenDV = sTenDV;
        this.fDonGia = fDonGia;
        this.PK_iMaDV = PK_iMaDV;
    }

    public String getPK_iMaCTDV() {
        return PK_iMaCTDV;
    }

    public void setPK_iMaCTDV(String PK_iMaCTDV) {
        this.PK_iMaCTDV = PK_iMaCTDV;
    }

    public String getsTenDV() {
        return sTenDV;
    }

    public void setsTenDV(String sTenDV) {
        this.sTenDV = sTenDV;
    }

    public float getfDonGia() {
        return fDonGia;
    }

    public void setfDonGia(float fDonGia) {
        this.fDonGia = fDonGia;
    }

    public String getPK_iMaDV() {
        return PK_iMaDV;
    }

    public void setPK_iMaDV(String PK_iMaDV) {
        this.PK_iMaDV = PK_iMaDV;
    }
    
    
    
};
