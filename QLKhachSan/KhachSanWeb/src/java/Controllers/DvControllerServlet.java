/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.LoaiDichVuDAO;
import Models.DichVu.DichVu;
import Models.DichVu.DichVuDetail;
import Models.DichVu.LoaiDV;
import Models.KhachSanModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "DvControllerServlet", urlPatterns = {"/DvControllerServlet"})
public class DvControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    private void ListDichVu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        KhachSanModel model = new KhachSanModel();
        Vector<DichVuDetail> vtdv = model.getAllDvWitDetail();
        request.setAttribute("vtdv", vtdv);
        RequestDispatcher rd = request.getRequestDispatcher("DichVu/DichVuList.jsp");
        rd.forward(request, response);

    }

    private void DeleteDV(HttpServletRequest request, HttpServletResponse response) {
        try {
            String PK_iMaCTDV = request.getParameter("PK_iMaCTDV");
            KhachSanModel model = new KhachSanModel();
            model.DeleteDV(PK_iMaCTDV);
            response.sendRedirect("DvControllerServlet");
        } catch (IOException ex) {
            System.out.println("Error Connect Database!");
        }

    }

    private void InsertDV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        KhachSanModel model = new KhachSanModel();
        Vector<LoaiDV> vtdv = model.getAllLoaiDVs();
        request.setAttribute("vtdv", vtdv);
        RequestDispatcher rd = request.getRequestDispatcher("DichVu/AddDichVu.jsp");
        rd.forward(request, response);

    }

    private void UpdateDV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String PK_iMaCTDV = request.getParameter("PK_iMaCTDV");
        KhachSanModel model = new KhachSanModel();
        DichVu dv = model.getById(PK_iMaCTDV);
        model.UpdateDV(dv);
        request.setAttribute("dv", dv);
        Vector<LoaiDV> vtdv = model.getAllLoaiDVs();
        request.setAttribute("vtdv", vtdv);
        RequestDispatcher rd = request.getRequestDispatcher("DichVu/EditDichVu.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            ListDichVu(request, response);
            return;
        }
        switch (action) {
            case "xoa": {
                DeleteDV(request, response);
                break;
            }
            case "insert": {
                InsertDV(request, response);
                break;
            }
            case "sua": {
                UpdateDV(request, response);
                break;
            }
        }
    }

    private void InsertDVComplete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String PK_iMaCTDV = request.getParameter("txtMaDV");
        String sTenDV = request.getParameter("txtTenDV");
        float fDonGia = Float.valueOf(request.getParameter("txtGia"));
        String PK_iMaDV = request.getParameter("cbLoaiDV");
        DichVu dv = new DichVu(PK_iMaCTDV, sTenDV, fDonGia, PK_iMaDV);
        KhachSanModel model = new KhachSanModel();
        model.InsertDV(dv);
        response.sendRedirect("DvControllerServlet");
    }

    private void UpdateDVComplete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String PK_iMaCTDV = request.getParameter("txtMaDV");
        String sTenDV = request.getParameter("txtTenDV");
        float fDonGia = Float.valueOf(request.getParameter("txtGia"));
        String PK_iMaDV = request.getParameter("cbLoaiDV");
     DichVu dv = new DichVu(PK_iMaCTDV, sTenDV, fDonGia, PK_iMaDV);
        KhachSanModel model = new KhachSanModel();
        model.UpdateDV(dv);
        response.sendRedirect("DvControllerServlet");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("action") == null) {
            return;
        }
        switch (request.getParameter("action")) {
            case "insert": {
                InsertDVComplete(request, response);
                break;
            }
            case "sua":{
                UpdateDVComplete(request, response);
                break;
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
