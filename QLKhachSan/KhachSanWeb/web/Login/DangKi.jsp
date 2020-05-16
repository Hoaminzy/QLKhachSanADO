<%-- 
    Document   : DangKi
    Created on : 21 Dec, 2019, 1:43:03 PM
    Author     : vhc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Form Login</title>
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src='https://kit.fontawesome.com/a076d05399.js'>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>

    </script>
    <style type="text/css">
        .{
            margin: 0px;
            padding: 0px;

        } 


        html{font-family: "Roboto", sans-serif}
        .wrap{
            height: 400px;
            width: 350px;
            border: 1px solid red;
            margin: 50px auto;

        }
 
        .form{
            width: 90.8%;
            height: 220px;
            padding-left: 30px;
            border: 1px solid pink;
         
margin-top: 70px;
        }
    
        .title{
            display: block;
            width: 100px;
            height: 30px;

            font-size: 20px;
            margin-bottom: 8px;
            margin-top: 10px;
        }
        .form .input{
            width: 250px;
            height: 35px;
            padding: 4px 10px;
            outline: none;
            font-size: 16px;
            transition: all 0.2s ease;
        }
        .form .input:focus{
            border: 1px solid rgb(247,48,251);
            /*cursor: pointer;*/
        }
        .show-pass{

            cursor: pointer;
        }

        .btnLogin{

            height: 40px;
            width: 100px;
            border-radius: 4px;
            background: linear-gradient(to right,#12c2e9,#c471ed,#f64f59);
            margin-top: 10px;
            font-size: 20px;
            color: #fff;
            margin-left: 110px;
            transition: all 0.2s ease;
        }
        .btnLogin:hover{

            background-image: linear-gradient(to left,#12c2e9,#c471ed,#f64f59);
            cursor: pointer;
        }
        i:hover{
            color:blue;

        }
        i:active{
            color: pink;
        }

        .remember{
            height: 100px;
            width: 100%;
            
        }
        .remember input{
            margin-left: 100px;
            margin-top: 10px;
        }
        .remember span{
            margin-top: 10px;
        }
      

    </style>
</head>
<body>
    
     <%
        String uid = "";
        String pwd ="";
        String email="";
        if(request.getCookies()!=null){
        Cookie[] arrCK = request.getCookies();
        for(Cookie ck:arrCK){
//           if(ck.getName().equals("uid")&&ck.getName().equals("pwd")&&ck.getName().equals("email")){
//              response.sendRedirect("admin.jsp");
//           }
        if(ck.getName().equals("uid")){
            uid = ck.getValue();
        }else if(ck.getName().equals("pwd")){
           pwd = ck.getValue();
        }
        }
        }
        %>
    <div class="wrap">
     
        <div class="content">
          
            <form class="form" method="post" action="LoginServlet">
                <span class="title">Tài Khoản </span>
                <input type="text" value="" name="txtTen" class="input" placeholder="Nhập tài khoản" tabindex="1" />
                <br>
                <span class="title">Mật Khẩu </span>
                <input type="password" value="" name="txtMK" class="input" placeholder="Nhập mật khẩu" tabindex="2"/>
                <i class="fa fa-eye show-pass"></i>

                <div class="remember">
                <input type="checkbox" name="chkRemember" value="1n" class=""inputt/> <span>Nhớ tài khoản!</span>
                <button type="button" name="button" class="btnLogin">Login</button>
                <i class="fa fa-refresh" ></i><br>
                   
            </div>

            </form>
         
        </div>   
    </div>

</div>
</body>
</html>
