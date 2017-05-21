package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Sign-Up/Login Form</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <div class=\"navbar-inner\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/logo.png\" width=\"100%\" height=\"100%\"></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-offset-3 col-sm-6\">\n");
      out.write("                    <!-- Nav tabs -->\n");
      out.write("                    <h1 class=\"text-center\">Login to your Account</h1>\n");
      out.write("                    <!-- Tab panes -->\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                        <div role=\"tabpanel\" class=\"tab-pane active\" id=\"home\">\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-pane\" id=\"profile\">\n");
      out.write("\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div id=\"login\">\n");
      out.write("                                        <form action=\"alogin\" method=\"post\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Amity Email ID:</label>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" placeholder=\"Type your Amity Email\" name=\"email\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Password:</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" placeholder=\"Type your password\" name=\"password\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <button class=\"btn btn-default col-sm-offset-5 col-xs-offset-5\">Login</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
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
