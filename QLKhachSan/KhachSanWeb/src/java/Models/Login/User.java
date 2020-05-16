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
public class User {
  
  protected String sTenTK;
   protected String sMatKhau;
   protected String PK_iMaQuyen;

    public User() {
        super();
    }

    public User(String sTenTK, String sMatKhau, String PK_iMaQuyen) {
        this.sTenTK = sTenTK;
        this.sMatKhau = sMatKhau;
        this.PK_iMaQuyen = PK_iMaQuyen;
    }

    public String getsTenTK() {
        return sTenTK;
    }

    public void setsTenTK(String sTenTK) {
        this.sTenTK = sTenTK;
    }

    public String getsMatKhau() {
        return sMatKhau;
    }

    public void setsMatKhau(String sMatKhau) {
        this.sMatKhau = sMatKhau;
    }

    public String getPK_iMaQuyen() {
        return PK_iMaQuyen;
    }

    public void setPK_iMaQuyen(String PK_iMaQuyen) {
        this.PK_iMaQuyen = PK_iMaQuyen;
    }

    
    
}
