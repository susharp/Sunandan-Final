package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#dialog\").dialog();\n");
      out.write("\n");
      out.write("                $(\"#opener\").on(\"click\", function () {\n");
      out.write("                    $(\"#dialog\").dialog(\"open\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Sign-Up/Login Form</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"countryStateCity.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            ");

                String status = (String) request.getAttribute("status");
                if (status != null) {
            
      out.write("\n");
      out.write("            <h2>\n");
      out.write("                <font color=\"red\">   \n");
      out.write("                <center>\n");
      out.write("                    Dear Student ,\n");
      out.write("                    ");
      out.print(status);
      out.write("<br>\n");
      out.write("                    Please enter a valid details\n");
      out.write("                </center>\n");
      out.write("                </font>\n");
      out.write("\n");
      out.write("            </h2>      \n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <ul class=\"tab-group\">\n");
      out.write("                <li class=\"tab active\"><a href=\"#signup\">Sign Up</a></li>\n");
      out.write("                <li class=\"tab\"><a href=\"#login\">Log In</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div id=\"signup\">   \n");
      out.write("                    <h1>Sign Up for new account</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"sreg\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"top-row\">\n");
      out.write("                            <div class=\"field-wrap\">\n");
      out.write("                                <label>\n");
      out.write("                                    First Name<span class=\"req\">*</span>\n");
      out.write("                                </label>\n");
      out.write("                                <input type=\"text\" name=\"fname\" required autocomplete=\"off\"  />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"field-wrap\">\n");
      out.write("                                <label>\n");
      out.write("                                    Last Name<span class=\"req\">*</span>\n");
      out.write("                                </label>\n");
      out.write("                                <input type=\"text\" name=\"lname\" required autocomplete=\"off\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Amizone Email Address<span class=\"req\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"email\" name=\"email\" required autocomplete=\"off\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Set A Password<span class=\"req\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" required autocomplete=\"off\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Confirm your Password<span class=\"req\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"password\" name=\"confirmpassword\" id=\"confirm_password\" required autocomplete=\"off\"/>\n");
      out.write("                        </div>\n");
      out.write("                          <script>\n");
      out.write("            var password = document.getElementById(\"password\")\n");
      out.write("                    , confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("\n");
      out.write("            function validatePassword() {\n");
      out.write("                if (password.value != confirm_password.value) {\n");
      out.write("                    confirm_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("                } else {\n");
      out.write("                    confirm_password.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            password.onchange = validatePassword;\n");
      out.write("            confirm_password.onkeyup = validatePassword;\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <select class=\"form-control\" id=\"country\" name=\"dept\" data-width=\"auto\">\n");
      out.write("                                <optgroup label=\"ASET\">\n");
      out.write("                                    <option>CSE</option>\n");
      out.write("                                    <option>MAE</option>\n");
      out.write("                                    <option>ECE/EEE</option>\n");
      out.write("                                    <option>Civil/Chemical</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"ABS\">\n");
      out.write("                                    <option>BCOM</option>\n");
      out.write("                                    <option>BBA</option>\n");
      out.write("                                    <option>MBA</option>\n");
      out.write("                                    <option>MCOM</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <option class=\"bold\">ASAP</option>\n");
      out.write("                                <option class=\"bold\">ALS</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"field-wrap\">\n");
      out.write("                <label>\n");
      out.write("                 ID Card Number<span class=\"req\">*</span>\n");
      out.write("                </label>\n");
      out.write("                   <input pattern=\".{8,8}\" type=\"text\" name=\"idno\" oninput=\"this.value=this.value.replace(/[^0-9]/g,'');\"  required=\"on\" maxlength=\"8\" size=\"8\" minlength=\"8\"/>\n");
      out.write("               </div>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Image Link\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <input type=\"file\" name=\"photo\" id=\"file\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" id=\"opener\" class=\"button button-block\">Get Started</button>\n");
      out.write("                        <div id=\"dialog\" title=\"Basic dialog\">\n");
      out.write("                            <p> The dialog window can be moved, resized and closed with the 'x' icon.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"login\">   \n");
      out.write("                    <h1>Login for existing user</h1>\n");
      out.write("\n");
      out.write("                    <form action=\"usertest\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Amizone Email Address<span class=\"req\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"email\" name=\"email\" required autocomplete=\"off\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field-wrap\">\n");
      out.write("                            <label>\n");
      out.write("                                Password<span class=\"req\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"password\" name=\"password\" required autocomplete=\"off\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <p class=\"forgot\"><a href=\"#\">Forgot Password?</a></p>\n");
      out.write("\n");
      out.write("                        <button class=\"button button-block\">Log In</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div><!-- tab-content -->\n");
      out.write("\n");
      out.write("        </div> <!-- /form -->\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/countries.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
