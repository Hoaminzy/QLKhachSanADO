/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Login;

/**
 *
 * @author vhc
 */
public class Quyen {
   protected String PK_iMaQuyen;
   protected String sTenQuyen;
   protected String sGhiChu;

    public Quyen() {
        super();
    }

    public Quyen(String PK_iMaQuyen, String sTenQuyen, String sGhiChu) {
        this.PK_iMaQuyen = PK_iMaQuyen;
        this.sTenQuyen = sTenQuyen;
        this.sGhiChu = sGhiChu;
    }

    public String getPK_iMaQuyen() {
        return PK_iMaQuyen;
    }

    public void setPK_iMaQuyen(String PK_iMaQuyen) {
        this.PK_iMaQuyen = PK_iMaQuyen;
    }

    public String getsTenQuyen() {
        return sTenQuyen;
    }

    public void setsTenQuyen(String sTenQuyen) {
        this.sTenQuyen = sTenQuyen;
    }

    public String getsGhiChu() {
        return sGhiChu;
    }

    public void setsGhiChu(String sGhiChu) {
        this.sGhiChu = sGhiChu;
    }
    
}
