/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhc
 */
public class UserDAO extends Connection.BDConnection{
    public static UserDAO instance(){
        return  new UserDAO();
    }
    public void getUser(String PK_iMaTK, String sMatKhau){
      String strSelect="select * from tbl_User where PK_iMaTK='"+PK_iMaTK+"',sMatKhau="+sMatKhau+"";
        try {
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
