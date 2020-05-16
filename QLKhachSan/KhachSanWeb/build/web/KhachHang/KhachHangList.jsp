<%-- 
    Document   : KhachHangList
    Created on : 17 Dec, 2019, 8:07:00 AM
    Author     : vhc
--%>


<%@page import="Models.KhachHang.KhachHang"%>
<%@page import="java.util.Vector"%>
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
            Vector<KhachHang> vtkh = (Vector<KhachHang>)request.getAttribute("vtkh");
    
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
                    <h1>Quản Lý Khách Hàng</h1>
                    <a href="?action=insert" ><button style="color: green; font-family: bold" >Thêm Khách Hàng</button></a>
                </div>
                <div class="panel-boding">
                    <table class="table table-hover">
                        <tr>
                            <th>Mã KH</th>
                            <th>Tên KH</th>
                            <th>CMND</th>
                            <th>SDT</th>
                            <th>Quốc tịch</th>
                            <th>Giới tính</th>
                            <th>Ngày Sinh</th>
                            <th>Sửa</th>
                            <th>Xóa</th>
                            
                        </tr>
                     <% for(KhachHang kh:vtkh){%>
                        <tr>
                            <td><%=kh.getPK_iMaKH()%></td>
                            <td><%=kh.getsTenKH()%></td>
                            <td><%=kh.getsCMND()%></td>
                            <td><%=kh.getsSDT()%></td>
                            <td><%=kh.getsQuocTich()%></td>
                            <td><%=kh.isbGioiTinh()%></td>
                            <td><%=kh.getdNgaySinh()%></td>
                            <td><a href="?action=sua&PK_iMaKH=<%=kh.getPK_iMaKH()%>"><button cla class="btn-warming">Sửa</button></a></td>
                            <td><a href="?action=xoa&PK_iMaKH=<%=kh.getPK_iMaKH()%>"onclick="return confirm('chắc không?')"><button class="btn-warming">Xóa</button> </a></td>
                        </tr>
                        <%}%>
                    </table>  
                </div>
            </div>
        </div>


    </body>
</html>
