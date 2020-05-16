package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DangNhap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("        <title> Form Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js'>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("        } \n");
      out.write("        html{font-family: \"Roboto\", sans-serif}\n");
      out.write("        .wrap{\n");
      out.write("            height: 400px;\n");
      out.write("            width: 350px;\n");
      out.write("            border: 1px solid red;\n");
      out.write("            margin: 50px auto;\n");
      out.write("\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        .form{\n");
      out.write("            width: 90.8%;\n");
      out.write("            height: 300px;\n");
      out.write("            padding-left: 30px;\n");
      out.write("            border: 1px solid pink;\n");
      out.write("         \n");
      out.write("margin-top: 70px;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("        .title{\n");
      out.write("            display: block;\n");
      out.write("            width: 100px;\n");
      out.write("            height: 30px;\n");
      out.write("\n");
      out.write("            font-size: 20px;\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .form .input{\n");
      out.write("            width: 250px;\n");
      out.write("            height: 35px;\n");
      out.write("            padding: 4px 10px;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: all 0.2s ease;\n");
      out.write("        }\n");
      out.write("        .form .input:focus{\n");
      out.write("            border: 1px solid rgb(247,48,251);\n");
      out.write("            /*cursor: pointer;*/\n");
      out.write("        }\n");
      out.write("        .show-pass{\n");
      out.write("\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btnLogin{\n");
      out.write("\n");
      out.write("            height: 40px;\n");
      out.write("            width: 100px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background: linear-gradient(to right,#12c2e9,#c471ed,#f64f59);\n");
      out.write("            margin-top: 10px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: #fff;\n");
      out.write("            margin-left: 110px;\n");
      out.write("            transition: all 0.2s ease;\n");
      out.write("        }\n");
      out.write("        .btnLogin:hover{\n");
      out.write("\n");
      out.write("            background-image: linear-gradient(to left,#12c2e9,#c471ed,#f64f59);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        i:hover{\n");
      out.write("            color:blue;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        i:active{\n");
      out.write("            color: pink;\n");
      out.write("        }\n");
      out.write("\n");
      out.write(" \n");
      out.write("        .remember input{\n");
      out.write("            margin-left: 80px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .remember span{\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body onload=\"form\" >\n");
      out.write("\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("     \n");
      out.write("        <div class=\"content\">\n");
      out.write("          \n");
      out.write("            <form class=\"form\" method=\"post\" action=\"LoginServlet\">\n");
      out.write("                <span class=\"title\">Tài Khoản </span>\n");
      out.write("                <input type=\"text\" value=\"\" name=\"txtTen\" class=\"input\" placeholder=\"Nhập tài khoản\" tabindex=\"1\" />\n");
      out.write("                <br>\n");
      out.write("                <span class=\"title\">Mật Khẩu </span>\n");
      out.write("                <input type=\"password\" value=\"\" name=\"txtMK\" class=\"input\" placeholder=\"Nhập mật khẩu\" tabindex=\"2\"/>\n");
      out.write("                <i class=\"fa fa-eye show-pass\"></i>\n");
      out.write("\n");
      out.write("                <div class=\"remember\">\n");
      out.write("                <input type=\"checkbox\" name=\"chkRemember\" value=\"1n\" class=\"\"inputt/> <span>Nhớ tài khoản!</span>\n");
      out.write("              \n");
      out.write("                <input type=\"submit\" value=\"Cập Nhật\" class=\"btnLogin\"/>\n");
      out.write("                <i class=\"fa fa-refresh\" ></i><br>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
