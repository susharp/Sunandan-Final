package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <!--Css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/complaint.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"js/jquery-3.1.1.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('.dropdown-submenu a.test').on(\"click\", function(e){\n");
      out.write("                    $(this).next('ul').toggle();\n");
      out.write("                    e.stopPropagation();\n");
      out.write("                    e.preventDefault();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("     \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <div class=\"navbar-inner\">\n");
      out.write("            <a><img src=\"images/logo.png\" width=\"100%\" height=\"100%\"></a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("        <div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <div id=\"mySideNav\" class=\"sidenav\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("            \n");
      out.write("            <a href=\"complaint.jsp\">Post a Complaint</a>\n");
      out.write("            <a href=\"status.jsp\">\n");
      out.write("                \n");
      out.write("                Check Status</a>\n");
      out.write("            ");

                    String email = session.getAttribute("emails").toString();
                    session.setAttribute("id", email);
                
      out.write("\n");
      out.write("            <a href=\"DSW.jsp\">Write to DSW</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"dropdown-container\">\n");
      out.write("                        <button class=\"btn btn-default pull-right info-button dropdown-toggle\" data-toggle=\"dropdown\">&#9776;</button>\n");
      out.write("                        <ul class=\"dropdown-menu pull-right\" id=\"dropdown-top\">\n");
      out.write("                            <li><a href=\"profile.jsp\" tabindex=\"-1\">Change Profile</a></li>\n");
      out.write("                            <li><a href=\"usertest\" tabindex=\"-1\">Sign out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"prateek1.jpg\" class=\"img-circle img-thumbnail pull-right\" width=\"40\" height=\"50\">\n");
      out.write("                    <label id=\"user-name\" class=\"pull-right\">\n");
      out.write("                        ");

                        out.print(email);
                        
      out.write("  \n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                   ");
 
 String status=(String) request.getAttribute("status");
if(status!=null)
{
             
      out.write("\n");
      out.write("                 <h2>\n");
      out.write("                     <font color=\"green\">   \n");
      out.write("                     <center>\n");
      out.write("             Dear Student ,\n");
      out.write("             ");
      out.print(status);
      out.write("<br>\n");
      out.write("             Thank you ! For your time.\n");
      out.write("                     </center>\n");
      out.write("             </font>\n");
      out.write("                     \n");
      out.write("             </h2>      \n");
      out.write("             \n");
      out.write("             ");

                 }

      out.write("\n");
      out.write("        <h2>Post a Complaint</h2>\n");
      out.write("            <span onClick=\"openNav()\">&#9776;</span>\n");
      out.write("            \n");
      out.write("        <div>\n");
      out.write("            <form action=\"cregister\" method=\"post\">\n");
      out.write("        <div class=\"form-group text-center\">\n");
      out.write("            \n");
      out.write("            <label class=\"form-inline\" >Category:</label>\n");
      out.write("            <label class=\"form-inline\" for=\"ids\" >\n");
      out.write("                <input type=\"hidden\" value=\"");
 out.print(email); 
      out.write("\" name=\"ids\">\n");
      out.write("                \n");
      out.write("            </label>\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("                <select id=\"options\" onchange=\"member(this.id,'label-mem')\" data-live-search=\"true\" name=\"cname\">\n");
      out.write("                    <optgroup label=\"Food and Hostel\">\n");
      out.write("                        <option class=\"text-center\" id=\"Mess\" value=\"Mess\">Mess</option>\n");
      out.write("                        <option class=\"text-center\" id=\"Food Trucks\" value=\"Food Trucks\">Food Trucks</option>\n");
      out.write("                        <option class=\"text-center\" id=\"Hostel\" value=\"Hostel\">Hostel</option>\n");
      out.write("                    </optgroup>\n");
      out.write("                    <optgroup label=\"Medical\">\n");
      out.write("                        <option class=\"text-center\" id=\"MI Room\" value=\"MI Room\">MI Room</option>\n");
      out.write("                    </optgroup>\n");
      out.write("                    <optgroup label=\"Transport and Security\">\n");
      out.write("                        <option class=\"text-center\" id=\"Transport\" value=\"Transport\">Transport</option>\n");
      out.write("                    </optgroup>\n");
      out.write("                    <optgroup label=\"Fees and Accounts\">\n");
      out.write("                        <option class=\"text-center\" id=\"Fees\" value=\"Fees and Accounts\">Fees and Accounts</option>\n");
      out.write("                    </optgroup>\n");
      out.write("                    <optgroup label=\"Other\">\n");
      out.write("                        <option class=\"text-center\" id=\"Library\" value=\"Library\">Library</option>\n");
      out.write("                        <option class=\"text-center\" id=\"SRC\" value=\"SRC\">Student Resource Center (SRC)</option>\n");
      out.write("                        <option class=\"text-center\" id=\"IT\" value=\"IT\">IT</option>\n");
      out.write("                    </optgroup>\n");
      out.write("                </select>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("                 <div class=\"top\">\n");
      out.write("                <label>Complaint will be forwarded to: </label>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"concerned-member\" id=\"label-mem\"></label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"top\">\n");
      out.write("                <label>Please tell in brief about the complaint: </label>\n");
      out.write("                 <label class=\"pull-right\"><span class=\"red\">*</span><small>Max. of 200 Words are allowed</small></label>\n");
      out.write("                <div>\n");
      out.write("                    <textarea  name=\"textarea\" title=\"\" maxlength=\"200\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn btn-success\">Submit</button>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Javascript-->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("       <!-- <script src=\"bootstrap-select-master/bootstrap-select-master/dist/js/bootstrap-select.min.js\"></script>-->\n");
      out.write("        <script src=\"js/complaint.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
