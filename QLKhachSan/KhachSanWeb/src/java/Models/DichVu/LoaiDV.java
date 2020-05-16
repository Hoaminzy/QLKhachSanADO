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
public class LoaiDV {
    String PK_iMaDV;
    String sTenLoaiDV;

    public LoaiDV() {
        super();
    }

    public LoaiDV(String PK_iMaDV, String sTenLoaiDV) {
        this.PK_iMaDV = PK_iMaDV;
        this.sTenLoaiDV = sTenLoaiDV;
    }

    public String getPK_iMaDV() {
        return PK_iMaDV;
    }

    public void setPK_iMaDV(String PK_iMaDV) {
        this.PK_iMaDV = PK_iMaDV;
    }

    public String getsTenLoaiDV() {
        return sTenLoaiDV;
    }

    public void setsTenLoaiDV(String sTenLoaiDV) {
        this.sTenLoaiDV = sTenLoaiDV;
    }
    
    
    
}
