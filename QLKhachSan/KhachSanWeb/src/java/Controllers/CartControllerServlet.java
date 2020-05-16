/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.DatPhongDAO;
import Models.KhachHang.KhachHang;
import Models.KhachSanModel;
import Models.Phong.Phong;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vhc
 */
@WebServlet(name = "CartControllerServlet", urlPatterns = {"/CartControllerServlet"})
public class CartControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
//        HttpSession session = request.getSession();
//        String PK_iMaPhong = request.getParameter("PK_iMaPhong");
//        KhachHang kh = (KhachHang) session.getAttribute("kh");
//        if(kh!=null){
//          new DatPhongDAO().themVaoDSDatPhong(PK_iMaPhong);
//          response.sendRedirect("DatHang.jsp");
//        }else{
//        response.sendRedirect("login");
//        }
    DatPhongDAO obj = new  DatPhongDAO();
          HttpSession  session = request.getSession();
          if(session.getAttribute("cart")!=null){
               obj=(DatPhongDAO)session.getAttribute("cart");
               
            }
          if(request.getParameter("action")!=null){
            String strAction = request.getParameter("action");
            if(strAction.equals("addItem")){
                String PK_iMaPhong = request.getParameter("PK_iMaPhong");
                //add phong vào ds
                KhachSanModel model = new KhachSanModel();
                Phong p = model.getByIdPhong(PK_iMaPhong);
                p.setiSoLuong(1);
                p.setiMaxPeople(1);
                obj.AddCart(p);
                session.setAttribute("cart", obj);
                response.sendRedirect("Cart/DatPhong.jsp");
            }else if(strAction.equals("checkItem")){
               String[] arrSoLuong=request.getParameterValues("txtSoLuong[]");
               obj.UpdateQuantity(arrSoLuong);
               session.setAttribute("cart", obj);
               response.sendRedirect("Cart/DatPhong.jsp");
               
            }
          }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          processRequest(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
