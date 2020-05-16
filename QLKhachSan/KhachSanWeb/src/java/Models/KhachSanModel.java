/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DAO.DichVuDAO;
import Models.KhachHang.KhachHang;
import DAO.KhachHangDAO;
import DAO.LoaiDichVuDAO;
import DAO.NhanVienDAO;
import DAO.PhongDAO;
import DAO.UserDAO;
import Models.DichVu.DichVu;
import Models.DichVu.DichVuDetail;
import Models.DichVu.LoaiDV;
import Models.NhanVien.NhanVien;
import Models.NhanVien.NhanVienDetail;
import Models.Phong.LoaiPhong;
import Models.Phong.Phong;
import Models.Phong.PhongDetail;
import java.util.Vector;
public class KhachSanModel {
    //KhachHangKhach--------
    public Vector<KhachHang> getALLKH() throws Exception {
    return KhachHangDAO.instantce().getAllKH();
    }
    public KhachHang getByIdKH(String PK_iMaKH){
    return KhachHangDAO.instantce().getById(PK_iMaKH);
    }
     public  void DeleteKhachHang(String PK_iMaKH){
      KhachHangDAO.instantce().DeleteKH(PK_iMaKH);
    }
     public void UpdateKhachHang(KhachHang kh){
      KhachHangDAO.instantce().UpdateKH(kh);
     }
     public void InsertKhachHang(KhachHang kh){
     KhachHangDAO.instantce().insertKH(kh);
     }
     //NhanVien----------
    public Vector<NhanVien> getAllNV() throws Exception{
       return NhanVienDAO.instantce().getAllNhanVien();
    }

      public Vector<NhanVienDetail> getAllNVWithBoPhan() throws Exception{
       return NhanVienDAO.instantce().getAllWithBoPhan();
      }
      
      public NhanVien getByIdNV(String PK_iMaNV){
          return NhanVienDAO.instantce().getById(PK_iMaNV);
      }
    public void DeleteNVien(String PK_iMaNV){
      NhanVienDAO.instantce().DeleteNV(PK_iMaNV);
    }
   
    public void UpdateNV(NhanVien nv){
       NhanVienDAO.instantce().UpdateNV(nv);
    }
    public void InsertNV(NhanVien nv){
       NhanVienDAO.instantce().InsertNV(nv);
    }
 
    
    //User
    public void getUser(String PK_iMaTK, String sMatKhau){
         UserDAO.instance().getUser(PK_iMaTK, sMatKhau);
    }
    
    //DichVu
    
    public Vector<DichVu> getAllDichVu(){
    return  DichVuDAO.instance().getAllDichVu();
    
    }
    
    public Vector<DichVuDetail> getAllDvWitDetail(){
       return  DichVuDAO.instance().getDvWitdDichVuDetail();
    }
    public  DichVu getById(String PK_iMaCTDV){
        return DichVuDAO.instance().getById(PK_iMaCTDV);
    }
    
    public void DeleteDV(String PK_iMaCTDV){
       DichVuDAO.instance().Delete(PK_iMaCTDV);
      
    }
    public void InsertDV( DichVu dv){
    DichVuDAO.instance().InsertDV(dv);
    }
    public void UpdateDV(DichVu dv){
       DichVuDAO.instance().UpdateDV(dv);
    }
    //LoaiDV
    public Vector<LoaiDV> getAllLoaiDVs(){
        return LoaiDichVuDAO.instance().getAllDichVu();
    }
    //Phong
    public Vector<Phong> getAllPhongs(){
       return  PhongDAO.instance().getAllPhong();
    }
    public Vector<PhongDetail> getAllPhongwithDetai(){
    return  PhongDAO.instance().getAllPhongDetails();
    }
    public Vector<Phong> getAllPhongWithByIdLoaiPhong(String PK_iMaLoaiPhong){
       return PhongDAO.instance().getAllPhongWithByIdLoaiPhong(PK_iMaLoaiPhong);
    }
    public Phong getByIdPhong(String PK_iMaPhong){
       return PhongDAO.instance().getByID(PK_iMaPhong);
    }
    public void Delete(String PK_iMaPhong){
        PhongDAO.instance().DeletePhong(PK_iMaPhong);
    }
    public void UpdatePhong(Phong p){
        PhongDAO.instance().UpdatePhong(p);
    }
    public void InsertPhong(Phong p){
        PhongDAO.instance().InsertPhong(p);
    }
    
    public Vector<LoaiPhong> getAlLoaiPhongs(){
       return  PhongDAO.instance().getAllLoaiPhong();
    }
    public LoaiPhong getByIdLoaiPhong(String PK_iMaLoaiPhong){
       return PhongDAO.instance().getByIDLoaiPhong(PK_iMaLoaiPhong);
    }
}
