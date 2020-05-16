<%-- 
    Document   : AddPhong.jsp
    Created on : 29 Dec, 2019, 10:51:58 PM
    Author     : vhc
--%>

<%@page import="Models.NhanVien.NhanVien"%>
<%@page import="Models.Phong.LoaiPhong"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="title">
                <h2>Thêm Phong</h2>
            </div>
            <div class="content">
                <form method="post" >
                    <table>
                        <tr>
                            <th>Mã Phòng: </th>
                            <td><input type="text" name="txtMaP" /></td>
                        </tr>
                        <tr>
                            <th>Tên Phòng: </th>
                            <td><input type="text" name="txtTenP" /></td>
                        </tr>
                            <tr>
                            <th>Đơn giá: </th>
                            <td><input type="number" name="txtDG" min="1"/></td>
                        </tr>
                            <tr>
                            <th>Mô Tả: </th>
                            <td><input type="textarea" name="txtMT"/></td>
                        </tr>
                            <tr>
                            <th>Hình Ảnh: </th>
                            <td> <input type = "file" name = "txtHA" size = "50" /></td>
                         
                        </tr>
                      
                        <tr>
                            <th>Loại Phòng: </th>
                            <td>
                                <% Vector<LoaiPhong> vtlp = (Vector<LoaiPhong>)request.getAttribute("vtlp"); %>
                        <select name="cbLoaiPhong">
                            <option>--Chọn Loại Phòng--</option>
                            <% for(LoaiPhong lp :vtlp){ %>
                            <option value="<%=lp.getPK_iMaLoaiPhong()%>">
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
                        <select name="cbBNhanVien">
                            <option>--Chọn Nhân Viên--</option>
                            <% for(NhanVien nv :vtnv){ %>
                            <option value="<%=nv.getPK_iMaNV()%>">
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
