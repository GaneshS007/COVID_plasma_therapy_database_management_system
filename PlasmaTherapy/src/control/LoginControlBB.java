package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AdminBB;


@WebServlet(name = "LoginControlBB", urlPatterns = {"/LoginControlBB"})
public class LoginControlBB extends HttpServlet 
{

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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        String entered_username = request.getParameter("username");
        String entered_password = request.getParameter("pass");
        
        if(AdminBB.isAdmin(entered_username, entered_password))
        {
            System.out.println("Redirecting to Login");
            request.getSession().setMaxInactiveInterval(60*30);            
            request.getSession().setAttribute("adminBB", entered_username);
            request.getSession().setAttribute("BbankId", AdminBB.getBbankId(entered_username));
            response.sendRedirect("BloodBank/Home1/Home1.jsp");
            return;
        }     
        response.getWriter().println("<script type=\"text/JavaScript\">\r\n"
        		+ "alert(\"Invalid Credentials\");\r\n"
        		+ "window.location.href=\"BloodBank/login1/login1.jsp\";\r\n"
        		+ "</script>");
    }

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
            throws ServletException, IOException 
    {
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
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "This is the login control";
    }// </editor-fold>

}
