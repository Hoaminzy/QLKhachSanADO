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
public class BoPhan {
    String PK_iMaBP;
    String sTenBP;

    public BoPhan() {
    }

    public BoPhan(String PK_iMaBP, String sTenBP) {
        this.PK_iMaBP = PK_iMaBP;
        this.sTenBP = sTenBP;
    }

    public String getPK_iMaBP() {
        return PK_iMaBP;
    }

    public void setPK_iMaBP(String PK_iMaBP) {
        this.PK_iMaBP = PK_iMaBP;
    }

    public String getsTenBP() {
        return sTenBP;
    }

    public void setsTenBP(String sTenBP) {
        this.sTenBP = sTenBP;
    }
    
    
}
