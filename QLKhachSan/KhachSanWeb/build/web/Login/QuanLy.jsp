<%-- 
    Document   : QuanLy
    Created on : 25 Dec, 2019, 12:53:59 AM
    Author     : vhc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src='https://kit.fontawesome.com/a076d05399.js'></script>
	<style>
	     #contaner{
	     	height: auto;
	     	width: 1250px;

	     	margin: auto;

	     }
        #header{
        	height: 80px;
        	background-color: #000098;

        }
       #header  nav ul{
        	 padding-left: 850px;
        }
        #header ul li{
        list-style: none;
        	position: relative;
        	float: left;
  	padding-left: 20px;
    
        }
        #header li a{
        	text-decoration: none;
        	color: white;
        
        	display: inline-block;


        }
        #header li a:hover{

        	color: yellow;
        }
        #menu{
        	height: 80px;
        	
        }

             #menu ul li{
         	list-style: none;
         	float: left;
         	color: red;
         	padding-top: 15px;
         	padding-left: 30px;
         		margin-left: 40px;
         }
         #menu li a{
         	text-decoration: none;
         	color: #093474;;
         }
         #menu li a:hover{
         	color: #FF6D00;
         }
         #menu ul li i{
         	padding-left: 10px;
         }
   		#sub-menu li:hover {
   				display: none;
   		} 
         #content{
         	height: 600px;
        	background-color: #F2F2F2;
         }

  
         #footer{
         	height: 30px;
        	background-color: #093474;
         }
	</style>
</head>
<body>
  <%
     
  %>
    <div id="contaner">
    	<div id="header">
    	<p> Đây là lô gô</p>
    		<nav>
    			<ul>
    				
    				<li>
    				
    					<i class="fa fa-globe" style="font-size:24px; color: white;" ></i> 
    					<a href="IndexControllerServlet" >Trang Chủ</a>
    				</li>
    				<li>
    				<i class='fas fa-user' style='font-size:24px; color:white;'></i>
                                <a href="?LoginServlet&action=logout"><%=session.getAttribute("sTenTK") %></a>
    				</li>
    			<li>
    			<i class='fas fa-share' style='font-size:24px; color: white;'></i>
    					<a href="login.jsp">Thoát</a>
    				</li>
    			</ul>
    		</nav>
    	</div>
    	<div id="menu">
    		
    	
    		<nav>
    			<ul>
    				<li>
    					<i class='fas fa-users' style='font-size:24px; color:#093474 ;'></i>
    					<p><a href="KhControllerServet">Khách Hàng</a></p>
    				
    				</li>
    					<li>
    					<i class='fas fa-users' style='font-size:24px; color:#093474 ;'></i>
    					<p><a href="Login/NVControllerServlet">Nhân Viên</a></p>
    				
    				</li>
    				<li>
    					 <i class='fas fa-hotel' style='font-size:24px;color:#093474;' ></i>
    					<p><a href="#">Khách Sạn</a></p>
    				</li>

    				<li>
    					<i class='fas fa-cannabis' style='font-size:24px;color:#093474;'></i>
    					<p><a href="PhongControllerServlet">Phòng</a></p>
    				</li>

    				<li>
    					<i class='fas fa-spa' style='font-size:24px;color:#093474;'></i></i>
    					<p><a href="DvControllerServlet">Dịch Vụ</a></p>
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
    	<div id="content">
    		
    	</div>
    	<div id="footer">
    		
    	</div>
    </div>
</body>
</html>
