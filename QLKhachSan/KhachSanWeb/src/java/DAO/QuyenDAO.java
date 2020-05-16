/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Login.Quyen;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author vhc
 */
public class QuyenDAO extends Connection.BDConnection{
    public QuyenDAO instance(){
      return new QuyenDAO();
    }
    public Vector<Quyen> getALlQuyen() throws Exception{
       Vector<Quyen> vtq = new Vector<>();
         String strSelect= "select * from tbl_Quyen";
         ResultSet rs = get(strSelect);
         while(rs.next()){
             Quyen q = new Quyen();
             
         }
       return vtq;
    }
    private void LoadQuyenToList(){
    
    }
}
