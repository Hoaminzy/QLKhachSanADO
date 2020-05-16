package Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Models.KhachSanModel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vhc
 */
@WebServlet( urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        if(request.getParameter("action")==null){
//         return;
//        }
//        switch(request.getParameter("action")){
//            case "login":{
//                 response.sendRedirect("Manage.jsp");
//                 break;
//            }
//        }
if(request.getParameter("action").equals("logout")){
  HttpSession session = request.getSession();
        session.removeAttribute("user");
        response.sendRedirect("login.jsp");
}
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        
       String sTenTK =request.getParameter("user");
        String sMatKhau= request.getParameter("pass");

        boolean check = false;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://HC:1433;databasename=QLKhachSan", "sa", "12345678");
            Statement st = conn.createStatement();
            String strSelect = "Select * from tbl_User where sTenTK='"+sTenTK+"'and sMatKhau='"+sMatKhau+"'";
            ResultSet rs = st.executeQuery(strSelect);
            if (rs.next()) {
                check = true;
                conn.close();
            }
         
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error!");
        }
        
           if (check) {
            if(request.getParameter("chkremember")!=null){
            //nho tai khoan mat khuau
                Cookie ckUser = new Cookie("uid", sTenTK);
                ckUser.setMaxAge(30*24*60*60);//luu tai khoan trong 30 ngày
                Cookie ckPass = new Cookie("pwd",sMatKhau);
                ckPass.setMaxAge(30*24*60*60);
                response.addCookie(ckUser);
                response.addCookie(ckPass);
            }
            HttpSession session = request.getSession();
            session.setAttribute("sTenTK", sTenTK);
           
           request.getRequestDispatcher("Login/QuanLy.jsp").forward(request, response);
        } else {
               
            request.getRequestDispatcher("login.jsp").forward(request, response);
               System.out.println("Error");
        }
   
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
