<%-- 
    Document   : EditPhong
    Created on : 29 Dec, 2019, 3:43:16 PM
    Author     : vhc
--%>

<%@page import="Models.NhanVien.NhanVien"%>
<%@page import="Models.Phong.LoaiPhong"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.Phong.Phong"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="form">
        <% 
          Phong p = (Phong)request.getAttribute("p");
        %>
         
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="title">
                <h2>Chỉnh sửa thông tin Phòng</h2>
            </div>
            <div class="content">
                <form method="post" id="form">
                    <table>
                        <tr>
                            <th>Mã Phòng: </th>
                            <td><input type="text" name="txtMaP" value="<%=p.getPK_iMaPhong() %>"/></td>
                        </tr>
                        <tr>
                            <th>Tên Phòng: </th>
                            <td><input type="text" name="txtTenP" value="<%=p.getsTenPhong()%>" /></td>
                        </tr>
                            <tr>
                            <th>Giá Phòng: </th>
                            <td><input type="number" name="txtDG" value="<%=p.getfGiaPhong()%>" min="1"/></td>
                        </tr>
                            <tr>
                            <th>Mô Tả: </th>
                            <td><input type="textarea" name="txtMT" value="<%=p.getsMota() %>"/></td>
                        </tr>
                            <tr>
                            <th>Hình Ảnh: </th>
                            <td><input type="text" name="txtHA" value="<%=p.getsHinhanh() %>"/></td>
                        </tr>
                        <tr>
                            <th>Loại Phòng: </th>
                            <td>
                                <% Vector<LoaiPhong> vtlp = (Vector<LoaiPhong>)request.getAttribute("vtlp"); %>
                        <select name="cbLoaiPhong">
   <option>--Chọn Loại Phòng--</option>
                            <% for(LoaiPhong lp :vtlp){ %>
                            <option value="<%=lp.getPK_iMaLoaiPhong()%>"<% if(lp.getPK_iMaLoaiPhong()==p.getPK_iMaPhong()) out.print("select='selected'"); %>>
                                <%=lp.getsTenLoaiPhong()%>
                            </option>
                            <%}%>
                        </select>
                            </td>
                        </tr>
                                    <tr>
                            <th>Nhân Viên: </th>
                            <td>
                                <% Vector<NhanVien> vtnv = (Vector<NhanVien>)request.getAttribute("vtnv"); %>
                        <select name="cbNhanVien">
                            <option>--Chọn Nhân Viên--</option>
                            <% for(NhanVien nv :vtnv){ %>
                            <option value="<%=nv.getPK_iMaNV()%>"<% if(nv.getPK_iMaNV()==p.getPK_iMaPhong()) out.print("select='selected'"); %>>
                                <%=nv.getsTenNV()%>
                            </option>
                            <%}%>
                        </select>
                            </td>
                        </tr>
                      
                        <tr>
                            <th></th>
                            <td>
                                <input type ="submit" value="Cập Nhật"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
