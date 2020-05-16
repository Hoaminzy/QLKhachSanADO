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
public class DichVuDetail extends DichVu{
    String sTenLoaiDV;

    public DichVuDetail() {
        super();
    }

    public DichVuDetail(String sTenLoaiDV, String PK_iMaCTDV, String sTenDV, float fDonGia, String PK_iMaDV) {
        super(PK_iMaCTDV, sTenDV, fDonGia, PK_iMaDV);
        this.sTenLoaiDV = sTenLoaiDV;
    }

    public String getsTenLoaiDV() {
        return sTenLoaiDV;
    }

    public void setsTenLoaiDV(String sTenLoaiDV) {
        this.sTenLoaiDV = sTenLoaiDV;
    }
    
}
