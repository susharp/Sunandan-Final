
import factory.connfac;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cuserp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String user = (String) request.getSession().getAttribute("id");
            String current = request.getParameter("current");
            String password = request.getParameter("password");
            String newp = request.getParameter("newpassword");
            if (newp.matches(password)) {
                connfac.getCon().createStatement().executeUpdate("update students set password='" + password + "' where amity_id='" + user + "'" + " and password='" + current + "'");
                request.setAttribute("status", "Password Changed : " + new Date().toString());
                RequestDispatcher rd = request.getRequestDispatcher("complaint.jsp");
                rd.forward(request, response);
            }
            else{
                    request.setAttribute("status", "Invalid User Name or Password");
                RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
                rd.forward(request, response);
                    
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cuserp.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("status", "Invalid current Password");
        RequestDispatcher rd = request.getRequestDispatcher("complaint.jsp");

    }

}
