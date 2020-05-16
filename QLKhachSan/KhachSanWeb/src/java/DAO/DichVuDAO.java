/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.DichVu.DichVu;
import Models.DichVu.DichVuDetail;
import Models.DichVu.LoaiDV;
import com.sun.org.apache.xerces.internal.impl.dv.DVFactoryException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhc
 */
public class DichVuDAO extends Connection.BDConnection{
    public static DichVuDAO instance(){
        return  new DichVuDAO();
        
    }
    
    public Vector<DichVu> getAllDichVu(){
          Vector<DichVu> vtdv = new Vector<>();
        try {
          
            String strSelect= "select * from tbl_CTDichVu";
            ResultSet  rs = get(strSelect);
            while(rs.next()){
                DichVu dv = new DichVu();
                LoadDV(rs, dv);
                vtdv.add(dv);
            }
            CloseConnect();
           
        } catch (Exception ex) {
            System.out.println("Lỗi Kết nối !");
        }
         return vtdv;
    }
    public Vector<DichVuDetail> getDvWitdDichVuDetail() {
          Vector<DichVuDetail> vtdv = new Vector<>();
        try {
          
            String strSelect="select tbl_CTDichVu.*, tbl_DichVu.sTenLoaiDV from tbl_CTDichVu, tbl_DichVu where tbl_CTDichVu.PK_iMaDV=tbl_DichVu.PK_iMaDV";
            ResultSet rs = get(strSelect);
            while(rs.next()){
                DichVuDetail dv = new DichVuDetail();
                LoadDVDetail(rs, dv);
                vtdv.add(dv);
            }
            CloseConnect();
        } catch (Exception ex) {
            System.out.println("Lỗi kết nối !");
        }
        
            return vtdv;
    } 
    public DichVu getById(String PK_iMaCTDV){
         DichVu dv = new DichVu();
        try {
           
            String strSelect= "select* from tbl_CTDichVu where PK_iMaCTDV ='"+PK_iMaCTDV+"'";
            ResultSet rs = get(strSelect);
            while(rs.next()){
                LoadDV(rs, dv);
            }
            CloseConnect();
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
       return dv;
    }
    public void Delete(String PK_iMaCTDV){
         String strSelect= "delete from tbl_CTDichVu where PK_iMaCTDV='"+PK_iMaCTDV+"'";
        try {
            exeNonQuery(strSelect);
        } catch (Exception ex) {
        }
    }
    
    public void InsertDV(DichVu dv){
        try {
            String strSelect = "insert into tbl_CTDichVu values('"+dv.getPK_iMaCTDV()+"','"+dv.getsTenDV()+"',"+dv.getfDonGia()+",'"+dv.getPK_iMaDV()+"')";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            System.out.println("Connect Databese Error!");
        }
    }   
    public void UpdateDV(DichVu dv){
        try {
            String strSelect="update tbl_CTDichVu set PK_iMaCTDV='"+dv.getPK_iMaCTDV()+"',sTenDV='"+dv.getsTenDV()+"',fDonGia="+dv.getfDonGia()+",PK_iMaDV='"+dv.getPK_iMaDV()+"'where PK_iMaCTDV='"+dv.getPK_iMaCTDV()+"'";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    private void LoadDV( ResultSet rs , DichVu dv ) throws SQLException{
        dv.setPK_iMaCTDV(rs.getString("PK_iMaCTDV"));
        dv.setsTenDV(rs.getString("sTenDV"));
        dv.setfDonGia(rs.getFloat("fDonGia"));
        dv.setPK_iMaDV(rs.getString("PK_iMaDV"));
    }
    private void LoadDVDetail(ResultSet rs, DichVuDetail dv) throws SQLException{
        LoadDV(rs, dv);
        dv.setsTenLoaiDV(rs.getString("sTenLoaiDV"));
        
    }
}
