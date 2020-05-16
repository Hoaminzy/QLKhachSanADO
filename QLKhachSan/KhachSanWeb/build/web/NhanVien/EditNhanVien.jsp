<%-- 
    Document   : EditNhanVien.jsp
    Created on : 20 Dec, 2019, 2:05:33 AM
    Author     : vhc
--%>

<%@page import="Models.NhanVien.NhanVien"%>
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
          NhanVien nv = (NhanVien)request.getAttribute("nv");
        %>
         
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="title">
                <h2>Chỉnh sửa thông tin nhân viên</h2>
            </div>
            <div class="content">
                <form method="post" >
                    <table>
                        <tr>
                            <th>Mã nhân viên: </th>
                            <td><input type="text" name="txtMaNV" value="<%=nv.getPK_iMaNV() %>"/></td>
                        </tr>
                        <tr>
                            <th>Tên nhân viên: </th>
                            <td><input type="text" name="txtTenNV" value="<%=nv.getsTenNV()%>"/></td>
                        </tr>
                            <tr>
                            <th>Chức vụ: </th>
                            <td><input type="text" name="txtCV" value="<%=nv.getsChucVu()%>"/></td>
                        </tr>
                            <tr>
                            <th>Số điện thoại: </th>
                            <td><input type="number" name="txtSDT" value="<%=nv.getsSDT() %>"/></td>
                        </tr>
                            <tr>
                            <th>Luong: </th>
                            <td><input type="text" name="txtLuong" value="<%=nv.getFuong() %>"/></td>
                        </tr>
                            <tr>
                            <th>Ngay Sinh: </th>
                            <td><input type="date" name="txtNS"value="<%=nv.getdNgaySinh() %>" /></td>
                        </tr>
                            <tr>
                            <th>Giới Tính: </th>
                            <td><input type="text" name="txtGT" value="<%=nv.getbGioiTinh() %>"/></td>
                        </tr>
                            <tr>
                            <th>Địa Chỉ: </th>
                            <td><input type="text" name="txtDC" value="<%=nv.getsDiaChi()%>"/></td>
                        </tr>
                           <tr>
                            <th>Tình Trạng: </th>
                            <td><input type="text" name="txtTT" value="<%=nv.getsTinhTrang()%>"/></td>
                        </tr>
                        <tr>
                            <th>Bộ phận: </th>
                            <td>
                                  <% Vector<BoPhan> vtbp = (Vector<BoPhan>)request.getAttribute("vtbp"); %>
                        <select name="cbBoPhan">
                            <option>--Chọn Bộ Phận--</option>
                            <% for(BoPhan bp :vtbp){ %>
                            <option value="<%=bp.getPK_iMaBP()%>"<% if(nv.getPK_iMaBP()==bp.getPK_iMaBP()) out.print("select='selected'"); %>>
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
