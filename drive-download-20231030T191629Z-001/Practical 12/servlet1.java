package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import javax.servlet.http.*;

@WebServlet(name = "servlet1", urlPatterns = {"/servlet1"})
public class servlet1 extends HttpServlet {
    HttpSession Session;
    int countVisit = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Session = request.getSession();
            out.println("<br><br>Session Created: "+Session.getId());
            out.println("<br><br> Sesion Creation Time: "+new Date(Session.getCreationTime()));
            
            if (countVisit == 0){
                Session.setAttribute("visit",String.valueOf(countVisit));
                out.println("<br><br>Welcome its your First: "+Session.getAttribute("visit")+"visit...");
            } 
            else
            {
            Session.setAttribute("visit",String.valueOf(countVisit));
                out.println("<br><br>You have visited this page : "+Session.getAttribute("visit")+"times...");
            }
            countVisit++;
        }
        System.out.println("Last Accessed time: "+new Date(Session.getLastAccessedTime()));
        Session.invalidate();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
