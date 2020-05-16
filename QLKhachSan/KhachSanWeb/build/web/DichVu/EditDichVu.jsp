<%-- 
    Document   : EditDichVu
    Created on : 26 Dec, 2019, 10:53:04 PM
    Author     : vhc
--%>

<%@page import="Models.DichVu.LoaiDV"%>
<%@page import="Models.DichVu.DichVu"%>
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
            DichVu dv =(DichVu) request.getAttribute("dv");
        %>
        <%
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <div class="container">
            <div class="title">
                <h2>Update Dịch Vụ</h2>
            </div>
            <div class="content">
                <form method="post" >
                    <table>
                        <tr>
                            <th>Mã dịch vụ: </th>
                            <td><input type="text" name="txtMaDV" value="<%= dv.getPK_iMaCTDV() %>" /></td>
                        </tr>
                        <tr>
                            <th>Dịch vụ: </th>
                            <td><input type="text" name="txtTenDV" value="<%=dv.getsTenDV() %>" /></td>
                        </tr>
                            <tr>
                            <th>Đơn giá: </th>
                            <td><input type="number" name="txtGia" value="<%=dv.getfDonGia() %>"/></td>
                        </tr>
                        <tr>
                            <th>Loại Dịch vụ: </th>
                            <td>
                                <% Vector<LoaiDV> vtdv = (Vector<LoaiDV>)request.getAttribute("vtdv"); %>
                        <select name="cbLoaiDV">
                            <option>--Chọn Loại Dịch Vụ--</option>
                            <% for(LoaiDV vtt :vtdv){ %>
                            <option value="<%=dv.getPK_iMaDV()%>">
                                <%=vtt.getsTenLoaiDV() %>
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
