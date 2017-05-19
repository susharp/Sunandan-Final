/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import factory.connfac;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SUnAndAn
 */
public class review1 extends HttpServlet {

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
        
       
            /* TODO output your page here. You may use following sample code. */
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            /* TODO output your page here. You may use following sample code. */
             String userid = request.getParameter("ids");
            String textarea = request.getParameter("textarea");
             String q = "insert into reviews (emailid,review) " + "values(?,?)";
              PreparedStatement ps = connfac.getCon().prepareStatement(q);
            ps.setString(1, userid);
            ps.setString(2, textarea);
             int i = ps.executeUpdate();
            if (i >= 1) {
                request.setAttribute("status", "Thank you  ");

            } else {
                request.setAttribute("status", "Sorry, Server Problem !");

            }
            RequestDispatcher rd = request.getRequestDispatcher("DSW.jsp");
            rd.forward(request, response);
             } 
        catch (Exception e)
        {
            
            
            out.println(e);
        }
        }
    }
