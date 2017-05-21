package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import factory.connfac;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <html ng-app=\"DSWMatter\">\n");
      out.write("        <head>\n");
      out.write("            <!--Css-->\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/complaint.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/dsw.css\">\n");
      out.write("            <script src=\"js/jquery-3.1.1.js\"></script>\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"js/angular.min.js\"></script>\n");
      out.write("            <script src=\"js/app.js\"></script>\n");
      out.write("            <script src=\"js/DSWController.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('.dropdown-submenu a.test').on(\"click\", function (e) {\n");
      out.write("                        $(this).next('ul').toggle();\n");
      out.write("                        e.stopPropagation();\n");
      out.write("                        e.preventDefault();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body ng-controller=\"DSWController\">\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <div class=\"navbar-inner\">\n");
      out.write("                <a><img src=\"images/logo.png\" width=\"100%\" height=\"100%\"></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"mySideNav\" class=\"sidenav\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("            <a href=\"index.html\">Home</a>\n");
      out.write("            <a href=\"index.html\"><i class=\"fa fa-envelope-open-o\" aria-hidden=\"true\"></i> Complaints</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"dropdown-container\">\n");
      out.write("                        <button class=\"btn btn-default pull-right info-button dropdown-toggle\" data-toggle=\"dropdown\">&#9776;</button>\n");
      out.write("                        <ul class=\"dropdown-menu pull-right\" id=\"dropdown-top\">\n");
      out.write("                            <li><a href=\"profile.html\" tabindex=\"-1\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i> Change Profile</a></li>\n");
      out.write("                            <li><a href=\"#\" tabindex=\"-1\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Sign out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"prateek1.jpg\" class=\"img-circle img-thumbnail pull-right\" width=\"40\" height=\"50\">\n");
      out.write("                    <label id=\"user-name\" class=\"pull-right\">Prateek Gogia</label>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <span onClick=\"openNav()\">&#9776;</span>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <table class=\"table table-bordered table-responsive\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"text-center\">amity_id</th>\n");
      out.write("                                <th class=\"text-center\">comp_id</th>\n");
      out.write("                                <th class=\"text-center\">Comp_cat</th>\n");
      out.write("                                <th class=\"text-center\">Comp_desc</th>\n");
      out.write("                                <th class=\"text-center\">date</th>\n");
      out.write("                                <th class=\"text-center\">status</th>\n");
      out.write("                                <th class=\"text-center\">Action</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                String t1, t2, t3, t4, t5, t6;
                                String amity_id = "", comp_id = "", cat = "", desc = "", dat = "", status = "";
                                Connection con = null;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint management?zeroDateTimeBehavior=convertToNull", "root", "1234");
                                ResultSet rs = connfac.getCon().createStatement().executeQuery("select * from complaints");
                                while (rs.next()) {
                                    t1 = rs.getString(1);
                                    t2 = rs.getString(2);
                                    t3 = rs.getString(3);
                                    t4 = rs.getString(4);
                                    t5 = rs.getString(5);
                                    t6 = rs.getString(6);

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td> ");
      out.print(t1);
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(t2);
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(t3);
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(t4);
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(t5);
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(t6);
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
