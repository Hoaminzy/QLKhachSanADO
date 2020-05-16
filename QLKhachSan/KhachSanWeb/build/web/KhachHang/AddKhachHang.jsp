<%-- 
    Document   : AddKhachHang
    Created on : 18 Dec, 2019, 8:41:14 AM
    Author     : vhc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Website Khách Sạn</title>
        <style>
            fieldset{
                width: 400px;
                height: 350px;
                border: 1px solid;
                margin-left: 400px;
            }
            table{
                padding-left: 30px;
            }
            th{
               padding-right: 20px;
            }
        </style>
    </head>
    <body>
        <fieldset>
            <legend>
                   <h1>Thêm Khách Hàng</h1>
            </legend>
             <div id="container">
            <div id="content">
                <form method="post">
                    <table>
                        <tr>
                            <th>Mã khách hàng: </th>
                            <td><input type="text" name="txtMaKH"/></td>
                        </tr>
                        <tr>
                            <th>Tên khách hàng: </th>
                            <td><input type="text" name="txtTenKH"/></td>
                        </tr>
                        <tr>
                            <th>Số CMND: </th>
                            <td><input type="number" name="txtCMND"/></td>
                        </tr>
                        <tr>
                            <th>Số điện thoại: </th>
                            <td><input type="number" name="txtSDT"/></td>
                        </tr>
                        <tr>
                            <th>Quốc Tịch: </th>
                            <td><input type="text" name="txtQuocTich"/></td>
                        </tr>
                         <tr>
                            <th>Giới Tính: </th>
                            <td><input type="text" name="txtGioiTinh"/></td>
                            
                        </tr>
                         <tr>
                            <th>Ngày Sinh: </th>
                            <td><input type="date" name ="txtNgaySinh"/>
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
