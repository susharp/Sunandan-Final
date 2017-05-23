package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import factory.connfac;
import java.sql.DriverManager;
import java.sql.Connection;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"DSWMatter\">\n");
      out.write("<head>\n");
      out.write("    <!--Css-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/complaint.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/status.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"js/jquery-3.1.1.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/angular.min.js\"></script>\n");
      out.write("    <script src=\"js/app.js\"></script>\n");
      out.write("    <script src=\"js/DSWController.js\"></script>\n");
      out.write("    <script type = \"text/javascript\" >\n");
      out.write("function disableBackButton()\n");
      out.write("{\n");
      out.write("window.history.forward();\n");
      out.write("}\n");
      out.write("setTimeout(\"disableBackButton()\", 5);\n");
      out.write("</script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $('.dropdown-submenu a.test').on(\"click\", function(e){\n");
      out.write("                $(this).next('ul').toggle();\n");
      out.write("                e.stopPropagation();\n");
      out.write("                e.preventDefault();\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body ng-controller=\"DSWController\">\n");
      out.write("<nav class=\"navbar\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <a><img class=\"img-responsive\" src=\"images/logo.png\" width=\"100%\" height=\"100%\"></a>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<div id=\"mySideNav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"#\"> Profile</a>\n");
      out.write("    <a href=\"complaint.jsp\"><i class=\"fa fa-envelope-open-o\" aria-hidden=\"true\"></i> Post a Complaint</a>\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-tasks\" aria-hidden=\"true\"></i> Check Status</a>\n");
      out.write("    <a href=\"DSW.jsp\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Write to DSW</a>\n");
      out.write("</div>\n");
      out.write("<div id=\"main\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div>\n");
      out.write("            <div class=\"dropdown-container\">\n");
      out.write("                <button class=\"btn btn-default pull-right info-button dropdown-toggle\" data-toggle=\"dropdown\">&#9776;</button>\n");
      out.write("                <ul class=\"dropdown-menu pull-right\" id=\"dropdown-top\">\n");
      out.write("                    <li><a href=\"profile.jsp\" tabindex=\"-1\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i> Change Profile</a></li>\n");
      out.write("                    <li><a href=\"usertest\" tabindex=\"-1\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Sign out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"prateek1.jpg\" class=\"img-circle img-thumbnail pull-right\" width=\"40\" height=\"50\">\n");
      out.write("            <label id=\"user-name\" class=\"pull-right\">\n");
      out.write("                 ");

                    String email = session.getAttribute("emails").toString();
                    session.setAttribute("id", email);
                 
      out.write("\n");
      out.write("                     ");

                        out.print(email);
                        
      out.write("\n");
      out.write("               \n");
      out.write("            </label>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <h2 class=\"text-center\">Complaint Status</h2>\n");
      out.write("    <span onClick=\"openNav()\">&#9776;</span>\n");
      out.write("    <form action=\"cstatus\" method=\"post\">\n");
      out.write("    <div class=\"status-label\">\n");
      out.write("        <table class=\"table table-striped\" >\n");
      out.write("            <tr class=\"info\">\n");
      out.write("                <td>\n");
      out.write("        <div>\n");
      out.write("            <label class=\"label-in\">Last complaint posted:   \n");
      out.write("            \n");
      out.write("                ");

                
                    
                    String id = session.getAttribute("id").toString();
                    String cat="",dat="";
                    Connection con = null;
                    Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint management?zeroDateTimeBehavior=convertToNull","root","1234");
                    String q = "select comp_cat,comp_date from complaints where amity_id='"+id+"' order by comp_date desc";
            Statement stmt = con.createStatement();
           ResultSet rs =stmt.executeQuery(q);
            while(rs.first())
            {
                cat = rs.getString(1);
                dat = rs.getString(2);
               break;
            }
                
               
                
                
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </label>\n");
      out.write("        \n");
      out.write("            <label class=\"label-out\"></label>\n");
      out.write("        </div>\n");
      out.write("                <td>\n");
      out.write("                    ");
 out.println(cat);
      out.write(" \n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    ");
out.println(dat);
      out.write("\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        <tr class=\"active\">\n");
      out.write("            <td>\n");
      out.write("        <div>\n");
      out.write("            <label class=\"label-in\">All complaints: </label>\n");
      out.write("            <label class=\"label-out\"></label>\n");
      out.write("        </div>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                 <select id=\"options\" onchange=\"member(this.id, 'label-mem')\" data-live-search=\"true\" name=\"cgroup\">\n");
      out.write("                            <optgroup label=\"Food and Hostel\">\n");
      out.write("                                <option class=\"text-center\" id=\"Mess\" value=\"#mess\">Mess</option>\n");
      out.write("                                <option class=\"text-center\" id=\"Food Trucks\" value=\"Food Trucks\">Food Trucks</option>\n");
      out.write("                                <option class=\"text-center\" id=\"Hostel\" value=\"Hostel\">Hostel</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Medical\">\n");
      out.write("                                <option class=\"text-center\" id=\"MI Room\" value=\"MI Room\">MI Room</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Transport and Security\">\n");
      out.write("                                <option class=\"text-center\" id=\"Transport\" value=\"Transport\">Transport</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Fees and Accounts\">\n");
      out.write("                                <option class=\"text-center\" id=\"Fees\" value=\"Fees and Accounts\">Fees and Accounts</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Other\">\n");
      out.write("                                <option class=\"text-center\" id=\"Library\" value=\"Library\">Library</option>\n");
      out.write("                                <option class=\"text-center\" id=\"SRC\" value=\"#SRC\">Student Resource Center (SRC)</option>\n");
      out.write("                                <option class=\"text-center\" id=\"IT\" value=\"#ASET\">ASET</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                        </select>\n");
      out.write("                        <button type=\"submit\" class=\"send\">submit</button> \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("    </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--Javascript-->\n");
      out.write("<script src=\"js/complaint.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
