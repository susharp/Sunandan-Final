import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class Logout extends HttpServlet {  
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            try (PrintWriter out = response.getWriter()) {
                 HttpSession session = request.getSession();
        session.removeAttribute("id");
        response.sendRedirect("index.jsp");
        session.invalidate();
        response.setHeader("Pragma","no-cache"); 
        response.setHeader("Cache-Control","no-store"); 
        response.setHeader("Expires","0"); 
        response.setDateHeader("Expires",-1);
        session.setAttribute("id",null); 

        processRequest(request, response);
                
                
                out.print("You are successfully logged out!");
            }  
    }  

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  