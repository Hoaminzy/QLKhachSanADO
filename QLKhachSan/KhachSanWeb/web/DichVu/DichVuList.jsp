<%-- 
    Document   : DichVuList
    Created on : 26 Dec, 2019, 1:21:12 AM
    Author     : vhc
--%>

<%@page import="Models.DichVu.DichVuDetail"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.DichVu.DichVu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <title>Website Khách Sạn</title>
         <%
            Vector<DichVuDetail> vtdv = (Vector<DichVuDetail>)request.getAttribute("vtdv");
    
        %>
    </head>
    <body>
       
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading" >
                    <h1>Quản Lý Dịch Vụ</h1>
                    <a href="?action=insert" ><button style="color: green; font-family: bold" >Thêm Dịch Vụ</button></a>
                </div>
                <div class="panel-boding">
                    <table class="table table-hover">
                        <tr>
                            <th>Mã Dịch Vụ</th>
                            <th>Dịch Vụ</th>
                            <th>Loại DV</th>
                            <th>Đơn  Giá</th>
                            <th>Sửa</th>
                            <th>Xóa</th>
                            
                        </tr>
                        <% for(DichVuDetail dv:vtdv){%>
                        <tr>
                            <td><%=dv.getPK_iMaCTDV()%></td>
                            <td><%=dv.getsTenDV()%></td>
                            <td><%=dv.getsTenLoaiDV()%></td>
                            <td><%=dv.getfDonGia()%></td>
                           
                            <td><a href="?action=sua&PK_iMaCTDV=<%=dv.getPK_iMaCTDV()%>"><button class="btn-warming">Sửa</button></a></td>
                            <td><a href="?action=xoa&PK_iMaCTDV=<%=dv.getPK_iMaCTDV()%>"onclick="return confirm('chắc không?')"><button class="btn-warming">Xóa</button> </a></td>
                        </tr>
                        <%}%>
                    </table>  
                </div>
            </div>
        </div>


    </body>
</html>
