/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.NhanVien.BoPhan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhc
 */
public class BoPhanDAO extends Connection.BDConnection{
    public static BoPhanDAO instance(){
       return new BoPhanDAO();
    }
    public Vector<BoPhan> getAllBP(){
          Vector<BoPhan> vtbp =new Vector<>();
        try {
          
            String strSelect= "select * from tbl_BoPhan";
            ResultSet rs = get(strSelect);
            while(rs.next()){
               BoPhan bp = new BoPhan();
                LoadDsBoPhan(bp, rs);
               vtbp.add(bp);
            }
            CloseConnect();
          
        } catch (Exception ex) {
          ex.printStackTrace();
        }
          return vtbp;
    }

public BoPhan getById(String PK_iMaBP){
     BoPhan bp = new BoPhan();
        try {
           
            String strSelect = "select * from tbl_BoPhan where PK_iMaBP='"+bp.getsTenBP()+"";
            ResultSet rs = get(strSelect);
           if(rs.next()){
               LoadDsBoPhan(bp, rs);
           }
           CloseConnect();
        } catch (Exception ex) {
            Logger.getLogger(BoPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return bp;
}
public void UpdateBP(BoPhan bp){
        try {
            String strQuery="update tbl_BoPhan set PK_iMaBP='"+bp.getsTenBP()+"',sTenBP='"+bp.getsTenBP()+"where PK_iMaBP="+bp.getPK_iMaBP()+"'";
            exeNonQuery(strQuery);
        } catch (Exception ex) {
            Logger.getLogger(BoPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}public void InsertBP(BoPhan bp){
        try {
            String strQuery="insert into tbl_BoPhan values('"+bp.getPK_iMaBP()+"',"+bp.getsTenBP()+")";
            exeNonQuery(strQuery);
        } catch (Exception ex) {
            Logger.getLogger(BoPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void DeleteById(String PK_iMaBP){
        try {
            String strQuery="delete from tbl_BoPhan where PK_iMaBP='"+PK_iMaBP+"'";
            exeNonQuery(strQuery);
        } catch (Exception ex) {
            Logger.getLogger(BoPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void LoadDsBoPhan(BoPhan bp, ResultSet rs) throws SQLException{
           bp.setPK_iMaBP(rs.getString("PK_iMaBP"));
            bp.setsTenBP(rs.getString("sTenBP"));
    }
}
