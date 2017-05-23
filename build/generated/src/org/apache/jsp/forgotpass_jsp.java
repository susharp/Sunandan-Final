package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("       <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Forget Password Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--navbar -->\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("        <div class=\"navbar-inner\">\n");
      out.write("            <a><img src=\"logo.png\" width=\"100%\" height=\"100%\"></a>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--inner body-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center\">Forget Password</h1>\n");
      out.write("            <form action=\"forgotpassword\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\">Email: </label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                    <input required type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"abc@student.amity.edu\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\">ID card number:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                    <input required type=\"text\" name=\"idno\" oninput=\"this.value=this.value.replace(/[^0-9]/g,'');\" class=\"form-control\" minlength=\"8\" maxlength=\"8\" placeholder=\"12345678\">\n");
      out.write("                    <span class=\"required\">*<i>Enter your 8 digit Amity ID card Number</i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                     <label class=\"control-label col-sm-2\">Enter your new password</label>\n");
      out.write("                     <div class=\"col-sm-10\">\n");
      out.write("                         <input required type=\"password\" class=\"form-control\" name=\"password\" id=\"newpassword\" placeholder=\"Enter your new password\">  \n");
      out.write("                     </div>\n");
      out.write("                      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                     <label class=\"control-label col-sm-2\">Retype your new password</label>\n");
      out.write("                     <div class=\"col-sm-10\">\n");
      out.write("                         <input required type=\"password\" class=\"form-control\" name=\"newpassword\" id=\"new_pass\" placeholder=\"Retype your new password\">  \n");
      out.write("                     </div>\n");
      out.write("                      \n");
      out.write("                </div>\n");
      out.write("                <script>\n");
      out.write("                            var newpassword = document.getElementById(\"newpassword\")\n");
      out.write("                                    , new_password = document.getElementById(\"new_pass\");\n");
      out.write("\n");
      out.write("                            function validatePassword() {\n");
      out.write("                                if (newpassword.value != new_password.value) {\n");
      out.write("                                    new_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("                                } else {\n");
      out.write("                                    new_password.setCustomValidity('');\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            newpassword.onchange = validatePassword;\n");
      out.write("                            new_password.onkeyup = validatePassword;\n");
      out.write("                        </script>\n");
      out.write("                 <div class=\"formgroup\">\n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                    <button class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("                    </div>\n");
      out.write("               \n");
      out.write("          \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
