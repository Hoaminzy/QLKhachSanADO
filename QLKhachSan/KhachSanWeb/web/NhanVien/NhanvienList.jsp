<%-- 
    Document   : NhanvienList
    Created on : 17 Dec, 2019, 8:46:19 PM
    Author     : vhc
--%>

<%@page import="java.util.Vector"%>
<%@page import="Models.NhanVien.NhanVienDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <% Vector<NhanVienDetail> vtnv =(Vector<NhanVienDetail>)request.getAttribute("vtnv"); %>
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading" >
                    <h1>Quản Lý Nhân Viên</h1>
                    <button> <a href="?action=insert">Thêm Nhân Viên</a></button>
                </div>
                <div class="panel-boding">
                    <table class="table table-hover">
                        <tr>
                            <th>Mã NV</th>
                            <th>Tên NV</th>
                            <th>Chức vụ</th>
                            <th>SDT</th>
                            <th>Lương</th>
                            <th>Ngày Sinh</th>
                            <th>Giới tính</th>
                            <th>Địa chỉ</th>
                            <th>Tình trạng</th>
                            <th>Bộ phận</th>
                            <th>Sửa</th>
                            <th>Xóa</th>
                            
                        </tr>
                        <% for(NhanVienDetail nv:vtnv){%>
                        <tr>
                            <td><%=nv.getPK_iMaNV()%></td>
                            <td><%=nv.getsTenNV()%></td>
                            <td><%=nv.getsChucVu()%></td>
                            <td><%=nv.getsSDT()%></td>
                            <td><%=nv.getFuong()%></td>
                            <td><%=nv.getdNgaySinh()%></td>
                            <td><%=nv.getbGioiTinh()%></td>
                             <td><%=nv.getsDiaChi()%></tđ>
                            <td><%=nv.getsTinhTrang()%></td>
                            <td><%=nv.getsTenBP()%></td>
                            <td><a href="?action=sua&PK_iMaNV=<%=nv.getPK_iMaNV()%>"><button class="btn-warming">Sửa</button></a></td>
                            <td><a href="?action=xoa&PK_iMaNV=<%=nv.getPK_iMaNV()%>"onclick="return confirm('Xóa nhân viên?')"><button class="btn-warming">Xóa</button> </a></td>
                        </tr>
                        <%}%>
                    </table>  
                </div>
            </div>
        </div>

    </body>
</html>
