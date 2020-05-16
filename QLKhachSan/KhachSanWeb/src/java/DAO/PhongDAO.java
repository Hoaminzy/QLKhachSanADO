/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Phong.LoaiPhong;
import Models.Phong.Phong;
import Models.Phong.PhongDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhc
 */
public class PhongDAO extends Connection.BDConnection{
    public static PhongDAO instance(){
       return  new PhongDAO();
    }
    public Vector<Phong> getAllPhong(){
         Vector<Phong> vtp = new Vector<>();
        try {
           
            String strSelect="select * from tbl_Phong";
            ResultSet rs = get(strSelect);
            while(rs.next()){
             Phong  p = new Phong();
                LoadPhong(rs, p);
                vtp.add(p);
            }
            CloseConnect();
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vtp;
    }
    
    public Vector<PhongDetail> getAllPhongDetails(){
         Vector<PhongDetail> vtp = new Vector<>();
        try {
           
            String strSelect = "select tbl_Phong.*, tbl_NhanVien.sTenNV , tbl_LoaiPhong.sTenLoaiPhong from tbl_Phong , tbl_NhanVien, tbl_LoaiPhong  where  tbl_Phong.PK_iMaNV = tbl_NhanVien.PK_iMaNV and tbl_Phong.PK_iMaLoaiPhong = tbl_LoaiPhong.PK_iMaLoaiPhong";
            ResultSet rs = get(strSelect);
         while(rs.next()){
            PhongDetail p = new PhongDetail();
             LoadPhongDetail(rs, p);
              vtp.add(p);
         }
         CloseConnect();
        } catch (Exception ex) {
        }
        return vtp;
    }
        public Vector<Phong> getAllPhongWithByIdLoaiPhong(String PK_iMaLoaiPhong){
         Vector<Phong> vtp = new Vector<>();
        try {
           
            String strSelect = "Select * from tbl_Phong where PK_iMaLoaiPhong ='"+PK_iMaLoaiPhong+"'";
            ResultSet rs = get(strSelect);
         while(rs.next()){
            Phong p = new Phong();
             LoadPhong(rs, p);
              vtp.add(p);
         }
         CloseConnect();
        } catch (Exception ex) {
        }
        return vtp;
    }
    
    public Phong getByID(String PK_iMaPhong){
    Phong p = new Phong();
        try {
            String strSelect = "select * from tbl_Phong where PK_iMaPhong = '"+PK_iMaPhong+"'";
            ResultSet rs = get(strSelect);
            while(rs.next()){
              
                LoadPhong(rs, p);
            }
            CloseConnect();
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return p;
    }
        public LoaiPhong getByIDLoaiPhong(String PK_iMaLoaiPhong){
    LoaiPhong p = new LoaiPhong();
        try {
            String strSelect = "select * from tbl_LoaiPhong where PK_iMaLoaiPhong = '"+PK_iMaLoaiPhong+"'";
            ResultSet rs = get(strSelect);
            while(rs.next()){
              
                LoadLoaiPhong(rs, p);
            }
            CloseConnect();
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return p;
    }
    public void DeletePhong(String PK_iMaPhong){
        try {
            String strSelect = "Delete from tbl_Phong where PK_iMaPhong='"+PK_iMaPhong+"'";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void InsertPhong(Phong p){
        try {
            String strSelect = "insert into tbl_Phong values('"+p.getPK_iMaPhong()+"','"+p.getsTenPhong()+"',"+p.getfGiaPhong()+",'"+p.getsMota()+"','"+p.getsHinhanh()+"','"+p.getPK_iMaLoaiPhong()+"','"+p.getPK_iMaNV()+"')";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdatePhong(Phong p){
        try {
            String strSelect ="Update from tbl_Phong set PK_iMaPhong='"+p.getPK_iMaPhong()+"',sTenPhong='"+p.getsTenPhong()+"',fGiaPhong="+p.getfGiaPhong()+", sMota='"+p.getsMota()+"', sHinhanh='"+p.getsHinhanh()+"',PK_iMaLoaiPhong='"+p.getPK_iMaLoaiPhong()+"', PK_iMaNV='"+p.getPK_iMaNV()+"' where PK_iMaPhong ='"+p.getPK_iMaPhong()+"'";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void LoadPhong(ResultSet rs, Phong p) throws SQLException{
       p.setPK_iMaPhong(rs.getString("PK_iMaPhong"));
       p.setsTenPhong(rs.getString("sTenPhong"));
       p.setfGiaPhong(rs.getFloat("fGiaPhong"));
       p.setsMota(rs.getString("sMota"));
       p.setsHinhanh(rs.getString("sHinhanh"));
       p.setPK_iMaLoaiPhong(rs.getString("PK_iMaLoaiPhong"));
       p.setPK_iMaNV(rs.getString("PK_iMaNV"));
     
    }
    private void LoadPhongDetail(ResultSet rs, PhongDetail p) throws SQLException{
         LoadPhong(rs,p);
       p.setsTenLoaiPhong(rs.getString("sTenLoaiPhong"));
      p.setsTenNV(rs.getString("sTenNV"));
    }
   public Vector<LoaiPhong> getAllLoaiPhong(){
       Vector<LoaiPhong> vtlp = new Vector<>();
       
       
        try {
            String strSelect="select * from tbl_LoaiPhong";
            ResultSet rs = get(strSelect);
            while(rs.next()){
                LoaiPhong p = new LoaiPhong();
                LoadLoaiPhong(rs, p);
               vtlp.add(p);
            }
            CloseConnect();
        } catch (Exception ex) {
        }
        return  vtlp;
   }
   private void LoadLoaiPhong(ResultSet rs, LoaiPhong p) throws SQLException{
     p.setPK_iMaLoaiPhong(rs.getString("PK_iMaLoaiPhong"));
               p.setsTenLoaiPhong(rs.getString("sTenLoaiPhong"));
   }
}
