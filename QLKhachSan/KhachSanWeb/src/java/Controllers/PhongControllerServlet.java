/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.KhachSanModel;
import Models.NhanVien.NhanVien;
import Models.Phong.LoaiPhong;
import Models.Phong.Phong;
import Models.Phong.PhongDetail;
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

@WebServlet(name = "PhongControllerServlet", urlPatterns = {"/PhongControllerServlet"})
public class PhongControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    private void BindToListPhong(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PhongDetail p = new PhongDetail();
        KhachSanModel model =new KhachSanModel();
       Vector<PhongDetail> vtp =   model.getAllPhongwithDetai();
        request.setAttribute("vtp", vtp);
        RequestDispatcher rd = request.getRequestDispatcher("Phong/PhongList.jsp");
        rd.forward(request, response);
        
    }
    
    private void DeletePhong(HttpServletRequest request, HttpServletResponse response){
        try {
            String PK_iMaPhong = request.getParameter("PK_iMaPhong");
            KhachSanModel model = new KhachSanModel();
            model.Delete(PK_iMaPhong);
            response.sendRedirect("PhongControllerServlet");
        } catch (IOException ex) {
            System.out.println("Error!");
        }
     }
private void UpdatePhong(HttpServletRequest request, HttpServletResponse response){
        try {
            String PK_iMaPhong = request.getParameter("PK_iMaPhong");
            KhachSanModel model = new KhachSanModel();
            Phong  p = model.getByIdPhong(PK_iMaPhong);
            request.setAttribute("p", p);
            Vector<LoaiPhong> vtlp = model.getAlLoaiPhongs();
            request.setAttribute("vtlp", vtlp);
            Vector<NhanVien> vtnv = model.getAllNV();
            request.setAttribute("vtnv", vtnv);
            RequestDispatcher rd = request.getRequestDispatcher("Phong/EditPhong.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(PhongControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
 }
private void InsertPhong(HttpServletRequest request, HttpServletResponse response){
        try {
            KhachSanModel model = new KhachSanModel();
            Vector<LoaiPhong> vtlp =  model.getAlLoaiPhongs();
            request.setAttribute("vtlp", vtlp);
            Vector<NhanVien> vtnv = model.getAllNV();
            request.setAttribute("vtnv", vtnv);
            RequestDispatcher rd = request.getRequestDispatcher("Phong/AddPhong.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
        } 
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("action")==null){
            BindToListPhong(request, response);
            return;
        }
        
        switch(request.getParameter("action")){
            case "insert":{
                InsertPhong(request, response);
                break;
            }
            case "delete":{
                DeletePhong(request, response);
                break;
            }
            case "update":{
                UpdatePhong(request, response);
            }
        }
    }
    
    private void InsertPhongComplete(HttpServletRequest request, HttpServletResponse response){
        try {
            String PK_iMaPhong = request.getParameter("txtMaP");
            String sTenPhong= request.getParameter("txtTenP");
            float fGiaPhong =Float.valueOf( request.getParameter("txtDG"));
            String sMota = request.getParameter("txtMT");
            String sHinhanh = request.getParameter("txtHA");
            String PK_iMaLoaiPhong = request.getParameter("cbLoaiPhong");
            String PK_iMaNV = request.getParameter("cbNhanVien");
            Phong p = new Phong(PK_iMaPhong, sTenPhong, fGiaPhong, sMota, sHinhanh, PK_iMaLoaiPhong, PK_iMaNV);
            KhachSanModel model = new KhachSanModel();
            model.InsertPhong(p);
            response.sendRedirect("PhongControllerServlet");
        } catch (IOException ex) {
            Logger.getLogger(PhongControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    private void UPdatePhongComplete(HttpServletRequest request, HttpServletResponse response){
        try {
            String PK_iMaPhong = request.getParameter("txtMaP");
            String sTenPhong= request.getParameter("txtTenP");
            float fGiaPhong =Float.valueOf( request.getParameter("txtDG"));
            String sMota = request.getParameter("txtMT");
            String sHinhanh = request.getParameter("txtHA");
            String PK_iMaLoaiPhong = request.getParameter("cbLoaiPhong");
            String PK_iMaNV = request.getParameter("cbNhanVien");
            
            Phong p = new Phong(PK_iMaPhong, sTenPhong, fGiaPhong, sMota, sHinhanh, PK_iMaLoaiPhong, PK_iMaNV);
            KhachSanModel model = new KhachSanModel();
            model.UpdatePhong(p);
            response.sendRedirect("PhongControllerServlet");
        } catch (IOException ex) {
            Logger.getLogger(PhongControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("action")==null){
          return;
        }
        switch(request.getParameter("action")){
            case "insert":{
                InsertPhongComplete(request, response);
                break;
            }
            case "update":{
                UPdatePhongComplete(request, response);
                break;
        }
        
    }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
