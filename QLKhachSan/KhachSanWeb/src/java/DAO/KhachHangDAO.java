/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.KhachHang.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends  Connection.BDConnection{
    public static KhachHangDAO instantce(){
        return new  KhachHangDAO();
    };
    public Vector<KhachHang> getAllKH() throws Exception{
        
    Vector<KhachHang> vtkh = new Vector<>();
         String strSelect = "select * from tbl_KhachHang";
        ResultSet rs = get(strSelect);
        while(rs.next()){
           KhachHang kh = new KhachHang();
            AssignResultToObjectSV(rs,kh);
            vtkh.add(kh);
        }
        CloseConnect();
        return vtkh;
    }
    public KhachHang getById(String PK_iMaKH) {
         KhachHang kh = new KhachHang();
        try {
           
            String strSelect = "select * from tbl_KhachHang where PK_iMaKH='"+PK_iMaKH+"'";
            ResultSet rs = get(strSelect);
            if(rs.next()){
                AssignResultToObjectSV(rs, kh);
            }
            CloseConnect();
        } catch (Exception ex) {
            System.out.println("Error!");
        }
        return kh;
    }
    public void DeleteKH(String PK_iMaKH){
       
        try {
             String strSelect= "delete from tbl_KhachHang where PK_iMaKH='"+PK_iMaKH+"'";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            System.out.println("Error!");
        }
    }
    public void insertKH(KhachHang kh){
        try {
            String strSelect="insert into tbl_KhachHang values('"+kh.getPK_iMaKH()+"','"+kh.getsTenKH()+"','"+kh.getsCMND()+"','"+kh.getsSDT()+"','"+kh.getsQuocTich()+"','"+kh.isbGioiTinh()+"','"+kh.getdNgaySinh()+"')";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            System.out.println("lỗi");
        }
    }
    public void UpdateKH(KhachHang kh){
        try {
            String strSelect="update tbl_KhachHang set PK_iMaKH='"+kh.getPK_iMaKH()+"',sTenKH='"+kh.getsTenKH()+"',sCMND='"+kh.getsCMND()+"',sSDT='"+kh.getsSDT()+"',sQuocTich='"+kh.getsQuocTich()+"',bGioiTinh='"+kh.isbGioiTinh()+"',dNgaySinh='"+kh.getdNgaySinh()+"' where PK_iMaKH='"+kh.getPK_iMaKH()+"'";
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            System.out.println("lỗi");
        }
    }
    private void AssignResultToObjectSV(ResultSet rs, KhachHang kh) throws SQLException{
       kh.setPK_iMaKH(rs.getString("PK_iMaKH"));
       kh.setsTenKH(rs.getString("sTenKH"));
       kh.setsCMND(rs.getString("sCMND"));
       kh.setsSDT(rs.getString("sSDT"));
       kh.setsQuocTich(rs.getString("sQuocTich"));
       kh.setbGioiTinh(rs.getBoolean("bGioiTinh"));//note boolean kieu String nhe
       kh.setdNgaySinh(rs.getString("dNgaySinh"));
    }


}
