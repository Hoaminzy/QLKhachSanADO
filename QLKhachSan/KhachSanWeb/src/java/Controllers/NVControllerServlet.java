/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.BoPhanDAO;
import Models.KhachSanModel;
import Models.NhanVien.BoPhan;
import Models.NhanVien.NhanVien;
import Models.NhanVien.NhanVienDetail;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vhc
 */
@WebServlet(name = "NVControllerServlet", urlPatterns = {"/NVControllerServlet"})
public class NVControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    private void BindToListNV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
        KhachSanModel model = new KhachSanModel();
        Vector<NhanVienDetail> vtnv = model.getAllNVWithBoPhan();
        request.setAttribute("vtnv", vtnv);
        RequestDispatcher rd = request.getRequestDispatcher("NhanVien/NhanvienList.jsp");
        rd.forward(request, response);

    }

    private void DeleteNV(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String PK_iMaNV =request.getParameter("PK_iMaNV");
       KhachSanModel model = new KhachSanModel();
       model.DeleteNVien(PK_iMaNV);
       response.sendRedirect("NVControllerServlet");
    }
    private void InsertNV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    Vector<BoPhan> vtbp = BoPhanDAO.instance().getAllBP();
    request.setAttribute("vtbp", vtbp);
    RequestDispatcher rd = request.getRequestDispatcher("NhanVien/AddNhanVien.jsp");
    rd.forward(request, response);
    }
   private void UpdateNV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       String PK_iMaNV = request.getParameter("PK_iMaNV");
       KhachSanModel model = new KhachSanModel();
       NhanVien nv = model.getByIdNV(PK_iMaNV);
       request.setAttribute("nv", nv);
       Vector<BoPhan> vtbp = BoPhanDAO.instance().getAllBP();
       request.setAttribute("vtbp", vtbp);
       RequestDispatcher rd= request.getRequestDispatcher("NhanVien/EditNhanVien.jsp");
    rd.forward(request, response);
   }
   private void InsertNVComplete(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String PK_iMaNV = request.getParameter("txtMaNV");
   String sTenNV = request.getParameter("txtTenNV");
   String sChucVu = request.getParameter("txtCV");
   String sSDT = request.getParameter("txtSDT");
   float fLuong= Float.valueOf(request.getParameter("txtLuong"));
   String dNgaySinh = request.getParameter("txtNS");
   boolean bGioiTinh =Boolean.valueOf( request.getParameter("txtGT"));
   String sDiaChi = request.getParameter("txtDC");
   String sTinhTrang = request.getParameter("txtTT");
   String PK_iMaBP = request.getParameter("cbBoPhan");
   NhanVien nv = new NhanVien(PK_iMaNV, sTenNV, sChucVu, sSDT, fLuong, dNgaySinh, bGioiTinh, sDiaChi, sTinhTrang, PK_iMaBP);
   KhachSanModel model= new KhachSanModel();
   model.InsertNV(nv);
   response.sendRedirect("NVControllerServlet");
   }
   private void UpdateNVComplete(HttpServletRequest request, HttpServletResponse response) throws IOException{
   String PK_iMaNV = request.getParameter("txtMaNV");
   String sTenNV = request.getParameter("txtTenNV");
   String sChucVu = request.getParameter("txtCV");
   String sSDT = request.getParameter("txtSDT");
   float fLuong= Float.valueOf(request.getParameter("txtLuong"));
   String dNgaySinh = request.getParameter("txtNS");
   boolean bGioiTinh =Boolean.valueOf( request.getParameter("txtGT"));
   String sDiaChi = request.getParameter("txtDC");
   String sTinhTrang = request.getParameter("txtTT");
   String PK_iMaBP = request.getParameter("cbBoPhan");
   NhanVien nv = new NhanVien(PK_iMaNV, sTenNV, sChucVu, sSDT, fLuong, dNgaySinh, bGioiTinh, sDiaChi, sTinhTrang, PK_iMaBP);
   KhachSanModel model = new  KhachSanModel();
   model.UpdateNV(nv);
   response.sendRedirect("NVControllerServlet");
   }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
      if(request.getParameter("action")==null){
      try {
            BindToListNV(request, response);
            return;
        } catch (Exception ex) {
            System.out.println("lỗi hoài ");
        }
      }
      switch(request.getParameter("action")){
          case "xoa":{
              DeleteNV(request, response);
              break;
          }
          case "sua":{
          UpdateNV(request, response);
          break;
          }
          case "insert":{
              InsertNV(request, response);
              break;
          }
      }         
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        if(request.getParameter("action")==null){
            return;
        }
        switch(request.getParameter("action")){
           case "sua":
               UpdateNVComplete(request, response);
               break;
           case "insert":
               InsertNVComplete(request, response);
               break;
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
