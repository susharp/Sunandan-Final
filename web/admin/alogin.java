
import factory.connfac;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sunan
 */
public class alogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        try {
            String status = null;
            String email = request.getParameter("email");
            String password = request.getParameter("password");
          //  HttpSession session = request.getSession();
            Connection con = connfac.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from admin where Adminid="+"'"+email+"'"+" and password="+"'"+password+"'");
          
            if(rs.first()){
                request.setAttribute("emails", email);
                 request.getRequestDispatcher("searchc.jsp").include(request, response);  
            }else{
                 request.setAttribute("status", "Invalid User Name or Password");
                RequestDispatcher rd = request.getRequestDispatcher("searchc.jsp");
                rd.forward(request, response);
            }
          

        } catch (Exception e) {
            
        }
        }
         
    }

  