<%-- 
    Document   : AddNhanVien.jsp
    Created on : 20 Dec, 2019, 10:23:08 AM
    Author     : vhc
--%>

<%@page import="Models.NhanVien.BoPhan"%>
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
                <h2>Thêm nhân viên</h2>
            </div>
            <div class="content">
                <form method="post" >
                    <table>
                        <tr>
                            <th>Mã nhân viên: </th>
                            <td><input type="text" name="txtMaNV" /></td>
                        </tr>
                        <tr>
                            <th>Tên nhân viên: </th>
                            <td><input type="text" name="txtTenNV" /></td>
                        </tr>
                            <tr>
                            <th>Chức vụ: </th>
                            <td><input type="text" name="txtCV" /></td>
                        </tr>
                            <tr>
                            <th>Số điện thoại: </th>
                            <td><input type="number" name="txtSDT"/></td>
                        </tr>
                            <tr>
                            <th>Luong: </th>
                            <td><input type="text" name="txtLuong" /></td>
                        </tr>
                            <tr>
                            <th>Ngay Sinh: </th>
                            <td><input type="date" name="txtNS" /></td>
                        </tr>
                            <tr>
                            <th>Giới Tính: </th>
                            <td><input type="text" name="txtGT" /></td>
                        </tr>
                            <tr>
                            <th>Địa Chỉ: </th>
                            <td><input type="text" name="txtDC" /></td>
                        </tr>
                           <tr>
                            <th>Tình Trạng: </th>
                            <td><input type="text" name="txtTT"/></td>
                        </tr>
                        <tr>
                            <th>Bộ phận: </th>
                            <td>
                                  <% Vector<BoPhan> vtbp = (Vector<BoPhan>)request.getAttribute("vtbp"); %>
                        <select name="cbBoPhan">
                            <option>--Chọn Bộ Phận--</option>
                            <% for(BoPhan bp :vtbp){ %>
                            <option value="<%=bp.getPK_iMaBP()%>">
                                <%=bp.getsTenBP() %>
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


