<%-- 
    Document   : EditKhachhang
    Created on : 17 Dec, 2019, 12:03:05 PM
    Author     : vhc
--%>

<%@page import="Models.KhachHang.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            fieldset{
                height: 300px;
                width: 350px;
                border: 1px solid;
                margin-left: 400px;
            }
        </style>
    </head>
    
    <body>
        <%
           KhachHang kh =(KhachHang)request.getAttribute("kh");
        %>
        <fieldset>
                   <legend>
                        <h1>Chỉnh sửa Khách Hàng</h1>
                  </legend>
          <div id="container">
            
            </div>
            <div id="content">
                <form method="post">
                    <table>
                        <tr>
                            <th>Mã khách hàng: </th>
                            <td><input type="text" name="txtMaKH" value="<%=kh.getPK_iMaKH() %>"/></td>
                        </tr>
                        <tr>
                            <th>Tên khách hàng: </th>
                            <td><input type="text" name="txtTenKH" value="<%=kh.getsTenKH() %>"/></td>
                        </tr>
                        <tr>
                            <th>Số CMND: </th>
                            <td><input type="number" name="txtCMND" value="<%=kh.getsCMND() %>"/></td>
                        </tr>
                        <tr>
                            <th>Số điện thoại: </th>
                            <td><input type="number" name="txtSDT" value="<%=kh.getsSDT() %>" /></td>
                        </tr>
                        <tr>
                            <th>Quốc Tịch: </th>
                            <td><input type="text" name="txtQuocTich" value="<%=kh.getsQuocTich()%>"/></td>
                        </tr>
                         <tr>
                            <th>Giới Tính: </th>
                            <td><input type="date" name="txtGioiTinh" value="<%=kh.isbGioiTinh()%>"/></td>
                        </tr>
                         <tr>
                            <th>Ngày Sinh: </th>
                            <td><input type="text" name ="txtNgaySinh" value="<%=kh.getdNgaySinh() %>"/>
                            </td>
                        </tr>
                     
                        <tr>
                            <th></th>
                            <td><input type="submit" value="Cập Nhật"/></td>
                        </tr>
                    </table>
                </form>

            </div>
        </div>
        </fieldset>
    </body>
</html>
