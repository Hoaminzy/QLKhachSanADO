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
public class UserDetail extends User{
    protected String sTenQuyen;

    public UserDetail() {
        super();
    }

    public UserDetail(String sTenQuyen, String sTenTK, String sMatKhau, String PK_iMaQuyen) {
        super(sTenTK, sMatKhau, PK_iMaQuyen);
        this.sTenQuyen = sTenQuyen;
    }

    public String getsTenQuyen() {
        return sTenQuyen;
    }

    public void setsTenQuyen(String sTenQuyen) {
        this.sTenQuyen = sTenQuyen;
    }
    
}
