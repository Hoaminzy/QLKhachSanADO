<%-- 
    Document   : Cart
    Created on : 6 Jan, 2020, 11:28:04 AM
    Author     : vhc
--%>

<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="DAO.DatPhongDAO"%>
<%@page import="Models.Phong.LoaiPhong"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.Phong.Phong"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Website Khach Sạn</title>
        <link rel="stylesheet" type="text/css" href="index.js">
        <link rel="stylesheet" type="text/css" href="index.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="index.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            body, html {
                height: 100%;
                font-family: Arial, Helvetica, sans-serif;
            }
            .{
                padding: 0px;
                margin: 0px;
            }

            #container{
                min-height: 700px;
                width: 100%;  
            }
            #sub-contain{
                width: 1300px;

                min-height: 700px;
                margin: auto;
            }
            .bg-img {
                /* The image used */
                background-image: url("../images/title2.jpg");

                min-height: 600px;

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                position: relative;
            }
            .header-logo{
                height: 100px;
                width: 100%;


            }
            .menu{
                height: 70px;
                width: 100%;
                position: relative;

            }
            .menu ul li{
                list-style: none;
                float: left;
                color: red;
                padding-top: 15px;
                padding-left: 30px;
                margin-left: 40px;
            }
            .menu li a{
                text-decoration: none;
                color: #093474;
                font-size: 18px;
                font-style: bold;
            }
            .menu li a:hover{
                color: #FF6D00;
            }
            .menu ul li i{
                padding-left: 10px;
            }
            .header-image{
                width: 100%;
                height: 500px;


            }
            .content{
                width: 100%;
                height: 800px;

            }
/*            .left-content{
                width: 25%;
                min-height: 800px;
                float : left;

            }
            .left-content table{

                width: 80%;
                margin: auto;
                margin-top: 70px;

            }
            .left-content table th{
                height: 30px;

                padding-left: 90px;
            }
            .td a:hover{
                color: yellow;
                text-decoration: none;
            }*/
            .right-content{
                width:100%;
                min-height: 800px;
                float: right;

            }
            .right-content input .sl{
                 size: 10px;
                
            }
            .sub1content{

                width: 100%;
                height: 400px;
               

            }

            .top-subcontent{
                width: 100%;
                height: 30px;
                padding-top: 5px;
                background: red;
                position: relative;
                top: 5px;

            }
            .top-subcontent strong{
                position: relative;
                line-height: 15px;
                margin-left: 20px;

            }
            .bottom-subcontent{

                position: absolute;
                height: 370px;
                width: 975px;

            }
            .content-bottom-subcontent{
                height: 350px;
                width: 300px;
               padding: auto;
                margin-top: 10px;
                margin-left: 5px;
                margin-right: 5px;
                float: left;
                background: #F2F2F2;

            }
            .content-bottom-subcontent a {
             margin-left: 30px;
               border-radius: 20px;
            }
/*            .left-content.trTenPhong{
                font-family: bold;
                font-size: 18px;


            }
            .left-content.trTenPhong:hover{
                color: yellow;
            }*/
            .sub2content{
                width: 100%;
                height: 400px;



            }

            .footer{
                width: 100%;
                height: 200px;
                background: pink;
            }
        </style>
    </head>
    <body>
   
          <div id="container" class="bg-img">
            <div id="sub-contain">
                <div class="header-logo">

                </div>
                <div class="menu">
                    <nav>
                        <ul>
                            <li>
                                <i class='fas fa-users' style='font-size:24px; color:#093474 ;'></i>
                                <p><a href="#">Khách Hàng</a></p>

                            </li>
                            <li>
                                <i class='fas fa-hotel' style='font-size:24px;color:#093474;' ></i>
                                <p><a href="#">Khách Sạn</a></p>
                            </li>
                            <li>
                                <i class='fas fa-cannabis' style='font-size:24px;color:#093474;'></i>
                                <p><a href="#">Phòng</a></p>
                            </li>
                            <li>
                                <i class='fas fa-spa' style='font-size:24px;color:#093474;'></i></i>
                                <p><a href="#">Dịch Vụ</a></p>
                            </li>
                            <li>
                                <i class='fas fa-images' style='font-size:24px;color:#093474;'></i>
                                <p><a href="#">Gellary</a></p>
                            </li>

                            <li>
                                <i class='fas fa-edit' style='font-size:24px;color:#093474;'></i>
                                <p><a href="#">Bài Viết</a></p>
                            </li>
                            <li>
                                <i class='fas fa-bookmark' style='font-size:24px;color:#093474;'></i>
                                <p><a href="#">Booking</a></p>
                            </li>
                            <li>
                                <i class='fas fa-phone' style='font-size:24px;color:#093474;'></i>
                                <p><a href="#">Liên Hệ</a></p>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="header-image">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                            <li data-target="#myCarousel" data-slide-to="3"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">

                            <div class="item active">
                                <img src="../images/title1.jpg" alt="Los Angeles" style="width:100%; height:500px; ">


                            </div>

                            <div class="item">
                                <img src="../images/snow.jpg" alt="Chicago" style="width:100%;height:500px; ">

                            </div>

                            <div class="item">
                                <img src="../images/title4.jpg" alt="New York" style="width:100%;height:500px; ">

                            </div>
                            <div class="item">
                                <img src="../images/title1.jpg" alt="New York" style="width:100%;height:500px; ">

                            </div>

                        </div>

                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>

                </div>
            
                <div class="content">
<!--                    <div class="left-content">
                        <table class="table table-hover">
                            <tr>
                                <th>
                                 
                                </th>
                            </tr>
                   

                        </table>

                    </div>-->
                     <%
                            DatPhongDAO obj = (DatPhongDAO)session.getAttribute("cart");
                             ArrayList<Phong> vtp = obj.arrPhong;
                        %>

                    <div  class="right-content" >
                        <h2>Đặt Phòng</h2>
                        <form method="post" action = "CartControllerServlet">
                            <table  class="table table-hover" >
                                <tr class="warning">
                                    <td>Mã Phòng</td>
                                    <td>Loại Phòng</td>
                                    <td>Hình Ảnh</td>
                                    <td>Số Lượng Người</td>
                                    <td>Ngày Đến</td>
                                    <td>Ngày Đi</td>
                                    <td>Giá Phòng</td>
                                    <td>Số Lượng Phòng</td>
                                    <td>Thành Tiền</td>
                                </tr>
                                <%
                                    //dinh dang ngay thang
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                     String strNgayDen=sdf.format(new Date());
                                     String strNgayDi = sdf.format(new Date());
                                     //dinh dang tien te
                                       NumberFormat nf = NumberFormat.getInstance();
                                         Locale locale = new Locale("en", "EN");
                                          NumberFormat en = NumberFormat.getInstance(locale);
                                    float tong =0;
                                    for(Phong p:vtp){
                                      tong += p.getiSoLuong()*p.getfGiaPhong();
                                      %>
                                      <tr>
                                          <td><%=p.getPK_iMaPhong() %></td>
                                          <td><%=p.getsTenPhong() %></td>
                                          <td><img src="<%=getServletContext().getContextPath() + "/images/" + p.getsHinhanh()%>" alt="day la anh" style="width: 150px;height: 150px" border="1px solid black" /> </td>
                                          <td><input type="number" name="txtSoLuong[]" value="<%=p.getiMaxPeople() %>" min="1" max="4" class="sl"/></td>
                                          <td><input type="date" name="NgayDen" value="<%=strNgayDen%>" min="<%=strNgayDen%>" /></td>
                                          <td><input type="date" name="NgayDi" value="<%=strNgayDi %>"/></td>
                                          <td><%=en.format(p.getfGiaPhong()) %> </td>
                                       <td><input type="number" name="txtSoLuong[]" value="<%=p.getiSoLuong() %>" min="1" class="sl"/></td>
                                       <td><%=en.format(p.getfGiaPhong()*p.getiSoLuong()) %></td>
                                      <td></td>
                                      </tr>
                                   <% } %>
     
                                   <tr>
                                       <th colspan="8" >Tổng Tiền</th>
                                       <th><%=en.format(tong) %></th>
                                   </tr>
                                
                                
                            </table><br>
                            <input type="submit" value="Cập Nhật Phòng" name="btnUpdatePhong"/><br>
                            <a href="IndexControllerServlet">Tiếp Tục Xem Phong</a>
                            
                        </form>
                       
                    </div>           
                     
                </div>
                <div class="footer">

                </div>
            </div>

        </div>
    </body>
</html>
