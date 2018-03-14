/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAMSUNG
 */
@WebServlet(urlPatterns = {"/modifierservlet"})
public class modifierservlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet modifierservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet modifierservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        response.setContentType("text/html");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<h1> modifier </h1>");
        String etudId=request.getParameter("id");
        int id=Integer.parseInt(etudId);
        Etud etud=connectiondb.afficherId(id);
        
            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Servlet modifierservlet</title>");            
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<form method='modifierservlet' method='post'>");
            printWriter.println("<table>");
            printWriter.println("<tr><td><input name='id' value='"+etud.getId()+"'/></td></tr>");
            printWriter.println("<tr><td>nom :<input type='text' name='nom' value='"+etud.getNom()+"'/></td></tr>");
            printWriter.println("<tr><td>nom :<input type='text' name='email' value='"+etud.getEmail()+"'/></td></tr>");
            printWriter.println("<tr><td>nom :<input type='text' name='pwd' value='"+etud.getPwd()+"'/></td></tr>");
            printWriter.println("<tr><td><input name='id' type='text' name='pays' value='"+etud.getPays()+"'/></td></tr>");
            printWriter.println("<tr><td colspan='2'><input type='submit' value='submit'/></td></tr>");
            printWriter.println("</table>");
            printWriter.println("</form>");
            printWriter.println("</body>");
            printWriter.println("</html>");
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
