/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import factory.connfac;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SUnAndAn
 */
public class Chgstatus1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            response.setContentType("text/html;charset=UTF-8");
          PrintWriter out = response.getWriter();
       try
       {
         String cid=request.getParameter("cid");
         
              connfac.getCon().createStatement().executeUpdate("update complaints set Status='Processing' where comp_id='"+cid+"'  ");
           
            
            response.sendRedirect("searchc.jsp");
            
        }
       catch(Exception e)
       {
       
       }
        }
    }

  
