/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.BDConnection;
import Models.NhanVien.NhanVien;
import Models.NhanVien.NhanVienDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class NhanVienDAO extends BDConnection {

    public static NhanVienDAO instantce() {
        return new NhanVienDAO();
    }
    public Vector<NhanVien> getAllNhanVien() throws Exception {
        Vector<NhanVien> vtsv = new Vector<>();
        String strSelect = "select * from tbl_NhanVien";
        ResultSet rs = get(strSelect);
        while (rs.next()) {
            NhanVien nv = new NhanVien();
            LoadNhanVien(rs, nv);
            vtsv.add(nv);
        }
        CloseConnect();
        return vtsv;
    }

    public Vector<NhanVienDetail> getAllWithBoPhan() {
        Vector<NhanVienDetail> vtnv = new Vector<>();

        try {
            String strSelect = "select tbl_NhanVien.*, tbl_BoPhan.sTenBP from  tbl_NhanVien inner join tbl_BoPhan on tbl_NhanVien.PK_iMaBP = tbl_BoPhan.PK_iMaBP";
            ResultSet rs = get(strSelect);
            while(rs.next()){
                NhanVienDetail nv = new NhanVienDetail();
                LoadNhanVienWithBoPhan(rs, nv);
                vtnv.add(nv);
            }
            CloseConnect();
        } catch (Exception ex) {
            
        }
        
        return vtnv;
    }
 public NhanVien getById(String PK_iMaNV){
     
            NhanVien nv = new NhanVien();
        try {
            String strSelect ="select * from tbl_NhanVien where PK_iMaNV='"+PK_iMaNV+"'";
            ResultSet rs = get(strSelect);
            if(rs.next()){
                LoadNhanVien(rs, nv);
                
            }   
            CloseConnect();
        } catch (Exception ex) {
        }
       return nv;
 }
    public void DeleteNV(String PK_iMaNV) {

        String strSelect = "Delete from tbl_NhanVien where PK_iMaNV='" + PK_iMaNV + "'";
        try {
            exeNonQuery(strSelect);
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
    }

    public void UpdateNV(NhanVien nv) {
        try {
            String strQuery = "Update tbl_NhanVien set PK_iMaNV='"+nv.getPK_iMaNV()+"', sTenNV='" + nv.getsTenNV()+ "',sChucVu='" + nv.getsChucVu()+"',sSDT='"+ nv.getsSDT()+"',fLuong=" +nv.getFuong()+",dNgaySinh='"+ nv.getdNgaySinh()+"',bGioiTinh='"+nv.getbGioiTinh()+"',sDiaChi='"+nv.getsDiaChi()+"',sTinhTrang='"+ nv.getsTinhTrang()+"',PK_iMaBP='"+ nv.getPK_iMaBP()+"' where PK_iMaNV='" + nv.getPK_iMaNV() + "'";
            exeNonQuery(strQuery);
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
    }

    public void InsertNV(NhanVien nv) {
        try {
            String strQuery = "insert into tbl_NhanVien values('" + nv.getPK_iMaNV() + "','"+ nv.getsTenNV() + "','" + nv.getsChucVu() + "','" + nv.getsSDT() + "'," + nv.getFuong() + ",'" + nv.getdNgaySinh()+"','"+nv.getbGioiTinh()+"','"+nv.getsDiaChi()+"','"+ nv.getsTinhTrang()+"','" + nv.getPK_iMaBP() +"')";
            exeNonQuery(strQuery);
        } catch (Exception ex) {
            System.out.println("Lỗi");
        }
    }

    private void LoadNhanVien(ResultSet rs, NhanVien nv) throws SQLException {
        nv.setPK_iMaNV(rs.getString("PK_iMaNV"));
        nv.setsTenNV(rs.getString("sTenNV"));
        nv.setsChucVu(rs.getString("sChucVu"));
        nv.setsSDT(rs.getString("sSDT"));
        nv.setFuong(rs.getFloat("fLuong"));
        nv.setdNgaySinh(rs.getString("dNgaySinh"));
        nv.setbGioiTinh(rs.getBoolean("bGioiTinh"));
        nv.setsDiaChi(rs.getString("sDiaChi"));
        nv.setsTinhTrang(rs.getString("sTinhTrang"));
        nv.setPK_iMaBP(rs.getString("PK_iMaBP"));
    }
    private void LoadNhanVienWithBoPhan(ResultSet rs, NhanVienDetail nv) throws SQLException{
        LoadNhanVien(rs, nv);
          nv.setsTenBP(rs.getString("sTenBP"));
    }
}
