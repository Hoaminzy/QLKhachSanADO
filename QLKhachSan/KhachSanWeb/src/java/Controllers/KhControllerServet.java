/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.KhachHangDAO;
import Models.KhachHang.KhachHang;
import Models.KhachSanModel;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "KhControllerServet", urlPatterns = {"/KhControllerServet"})
public class KhControllerServet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    private void BindKHToList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        KhachSanModel model = new KhachSanModel();
        Vector<KhachHang> vtkh = model.getALLKH();
        request.setAttribute("vtkh", vtkh);
        RequestDispatcher rd = request.getRequestDispatcher("KhachHang/KhachHangList.jsp");
        rd.forward(request, response);

    }

    private void DeleteKH(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String PK_iMaKH = request.getParameter("PK_iMaKH");
        KhachSanModel model = new KhachSanModel();
        model.DeleteKhachHang(PK_iMaKH);
        response.sendRedirect("KhControllerServet");
    }

    private void InsertKH(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Vector<KhachHang> vtkh = KhachHangDAO.instantce().getAllKH();
        request.setAttribute("vtkh", vtkh);
        RequestDispatcher rd = request.getRequestDispatcher("KhachHang/AddKhachHang.jsp");
        rd.forward(request, response);
    }

    private void UpdateKH(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String PK_iMaKH = request.getParameter("PK_iMaKH");
        KhachSanModel model = new KhachSanModel();
        KhachHang kh = model.getByIdKH(PK_iMaKH);
        model.UpdateKhachHang(kh);
        request.setAttribute("kh", kh);  
        RequestDispatcher rd = request.getRequestDispatcher("KhachHang/EditKhachhang.jsp");
        rd.forward(request, response);
    }
   private void InsertKHComplete(HttpServletRequest request, HttpServletResponse response) throws IOException{
          String PK_iMaKH = request.getParameter("txtMaKH");
        String sTenKH = request.getParameter("txtTenKH");
        String sCMND = request.getParameter("txtCMND");
        String sSDT = request.getParameter("txtSDT");
        String sQuocTich = request.getParameter("txtQuocTich");
        boolean sGioiTinh = Boolean.valueOf(request.getParameter("txtGioiTinh"));
        String dNgaySinh = request.getParameter("txtNgaySinh");
        KhachHang kh = new KhachHang(PK_iMaKH, sTenKH, sCMND, sSDT, sQuocTich, sGioiTinh, dNgaySinh);
        KhachSanModel model =new KhachSanModel();
        model.InsertKhachHang(kh);
        response.sendRedirect("KhControllerServet");
   }
    private void UpdateKhComplete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String PK_iMaKH = request.getParameter("txtMaKH");
        String sTenKH = request.getParameter("txtTenKH");
        String sCMND = request.getParameter("txtCMND");
        String sSDT = request.getParameter("txtSDT");
        String sQuocTich = request.getParameter("txtQuocTich");
        boolean sGioiTinh = Boolean.valueOf(request.getParameter("txtGioiTinh"));
        String dNgaySinh = request.getParameter("txtNgaySinh");
        KhachHang kh = new KhachHang(PK_iMaKH, sTenKH, sCMND, sSDT, sQuocTich, sGioiTinh, dNgaySinh);
        KhachSanModel model = new KhachSanModel();
        model.UpdateKhachHang(kh);
        response.sendRedirect("KhControllerServet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        if (request.getParameter("action") == null) {
            try {
                BindKHToList(request, response);
            } catch (Exception ex) {
                System.out.println("Error!");
            }
        }
        switch (request.getParameter("action")) {
            case "xoa":
                DeleteKH(request, response);
                break;
            case "sua":
                UpdateKH(request, response);
                break;
            case "insert": {
             
            try {
                InsertKH(request, response);
            } catch (Exception ex) {
                Logger.getLogger(KhControllerServet.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            }
            break;
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
            case "insert":{
                InsertKHComplete(request, response);
                break;
            }
            case "sua": 
                UpdateKhComplete(request, response);
                break;
         
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
