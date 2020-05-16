<%-- 
    Document   : TrangChu.jsp
    Created on : 24 Dec, 2019, 8:39:44 PM
    Author     : vhc
--%>

<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="Models.Phong.Phong"%>
<%@page import="Models.Phong.LoaiPhong"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
                background-image: url("images/title2.jpg");

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
            header-logo img{
                align-content: center;
                padding-left: 400px;
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
            .left-content{
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
            }
            .right-content{
                width:75%;
                min-height: 800px;
                float: right;
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
            .content-bottom-subcontent img{
                margin-left:  20px;
                
            }
            .left-content.trTenPhong{
                font-family: bold;
                font-size: 18px;


            }
            .left-content.trTenPhong:hover{
                color: yellow;
            }
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

                    <img src="images/ROSEMARY.png" alt="anh" width="200px" height="200px"/>
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
                                <p><a href="Cart/DatPhong.jsp">Booking</a></p>
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
                                <img src="images/title1.jpg" alt="Los Angeles" style="width:100%; height:500px; ">


                            </div>

                            <div class="item">
                                <img src="images/snow.jpg" alt="Chicago" style="width:100%;height:500px; ">

                            </div>

                            <div class="item">
                                <img src="images/title4.jpg" alt="New York" style="width:100%;height:500px; ">

                            </div>
                            <div class="item">
                                <img src="images/title1.jpg" alt="New York" style="width:100%;height:500px; ">

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
                <%
                    Vector<LoaiPhong> vtlp = (Vector<LoaiPhong>) request.getAttribute("vtlp");
                    Vector<Phong> vtp = (Vector<Phong>) request.getAttribute("vtp");
                %>
                <div class="content">
                    <div class="left-content">
                        <table class="table table-hover">
                            <tr class="warning">
                                <th>Loại Phòng</th>

                            </tr>
                            <%
                                for (int i = 0; i < vtlp.size(); i++) {
                                    LoaiPhong lp = vtlp.get(i);
                            %>
                            <tr>
                                <td class="td"> 
                                    <a href="?action=getByLoaiPhong&PK_iMaLoaiPhong=<%=lp.getPK_iMaLoaiPhong()%>" onclick=""><%=lp.getsTenLoaiPhong()%></a>
                                </td>
                            </tr>

                            <%} %>


                        </table>

                    </div>

                    <div  class="right-content">

                        <div class="sub1content">
                            <div class="top-subcontent">
                                <strong>Phòng</strong>
                            </div>
                            <div class="bottom-subcontent">
                                <%
                                
                                    Locale locale = new Locale("en", "EN");
                                    NumberFormat en = NumberFormat.getInstance(locale);
                                %>

                                <%
                                    for (int i = 0; i < vtp.size(); i++) {
                                        Phong p = vtp.get(i);
                                %>
                                <div class="content-bottom-subcontent">
                                    
                                    <strong>
                                        <%= p.getsTenPhong()%>
                                    </strong><br>

                                    <img src="<%=getServletContext().getContextPath() + "/images/" + p.getsHinhanh()%>" alt="day la anh" style="width: 250px;height: 250px" border="1px solid black" /> 
                                    <br>
                                    <p>Giá Phòng: <strong color="red"><%=en.format(p.getfGiaPhong())%></strong>đ/Đêm</p>
                                    <a href="CartControllerServlet?action=checkItem&PK_iMaPhong=<%=p.getPK_iMaPhong()%>"><button class="btn-warning">Details</button> </a>
                                    <a href="CartControllerServlet?action=addItem&PK_iMaPhong=<%=p.getPK_iMaPhong()%>"><button class="btn-warning">Add To List</button> </a>
                                </div>
                                <% }%>
                            </div>
                        </div>

<!--                        <div class="sub2content">
                            <div class="top-subcontent">
                                <strong>Dịch Vụ</strong>
                            </div>
                            <div class="bottom-subcontent">
                                <div>

                                </div>

                            </div>
                        </div>-->
                    </div>           

                </div>
                <div class="footer">

                </div>
            </div>

        </div>
    </body>

</html>