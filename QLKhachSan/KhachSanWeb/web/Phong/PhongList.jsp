<%-- 
    Document   : PhongList
    Created on : 29 Dec, 2019, 3:13:11 PM
    Author     : vhc
--%>

<%@page import="java.util.Vector"%>
<%@page import="Models.Phong.PhongDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
      
        <title>JSP Page</title>
    </head>
    <body>
        <% Vector<PhongDetail> vtp =(Vector<PhongDetail>)request.getAttribute("vtp"); %>
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading" >
                    <h1>Quản Lý Phòng</h1>
                    <button> <a href="?action=insert">Thêm Phòng</a></button>
                </div>
                <div class="panel-boding">
                    <table class="table table-hover">
                        <tr>
                            <th>Mã Phòng</th>
                            <th>Tên Phòng</th>
                            <th>Giá Phòng</th>
                            <th>Mô Tả</th>
                            <th>Hình Ảnh</th>
                            <th>Loại Phòng</th>
                            <th>Nhân Viên</th>
                            <th colspan="2" >Chỉnh Sửa</th>
                           
                            
                        </tr>
                        <% for(PhongDetail p:vtp){%>
                        <tr>
                            <td><%=p.getPK_iMaPhong()%></td>
                            <td><%=p.getsTenPhong()%></td>
                            <td><%=p.getfGiaPhong()%></td>
                            <td><%=p.getsMota()%></td>
                            <td><img src="<%=getServletContext().getContextPath()+"/images/"+p.getsHinhanh()%>" style="width: 100px;height: 100px" /> </td>
                            <td><%=p.getsTenLoaiPhong()%></td>
                            <td><%=p.getsTenNV()%></td>
                            <td><a href="?action=update&PK_iMaPhong=<%=p.getPK_iMaPhong()%>"><button type="button" class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-pencil"></span> 
        </button></a></td>
                            <td><a href="?action=delete&PK_iMaPhong=<%=p.getPK_iMaPhong()%>"onclick="return confirm('Xóa nhân viên?')">  <button type="button" class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-trash"></span> 
        </button></a></td>
                        </tr>
                        <%}%>
                    </table>  
                </div>
            </div>
        </div>

    </body>

</html>


