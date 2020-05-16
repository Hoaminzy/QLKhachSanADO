/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.KhachSanModel;
import Models.Phong.LoaiPhong;
import Models.Phong.Phong;
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
@WebServlet(name = "IndexControllerServlet", urlPatterns = {"/IndexControllerServlet"})
public class IndexControllerServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        KhachSanModel model = new KhachSanModel();
        Vector<LoaiPhong> vtlp = model.getAlLoaiPhongs();
        request.setAttribute("vtlp", vtlp);
        if(request.getParameter("action")==null){
            Vector<Phong> vtp = model.getAllPhongs();
            request.setAttribute("vtp", vtp);
        }
        else{
            String strAction = request.getParameter("action");
            if(strAction.equals("getByLoaiPhong")){
               String PK_iMaLoaiPhong = request.getParameter("PK_iMaLoaiPhong");
               Vector<Phong> vtp = model.getAllPhongWithByIdLoaiPhong(PK_iMaLoaiPhong);
               request.setAttribute("vtp", vtp);
            }
        }
        RequestDispatcher rs = request.getRequestDispatcher("Login/TrangChu.jsp");
       rs.forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
