
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {




     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        HttpSession session = request.getSession();
        
                // Retrieve the parameter from the reset form
        String operation = request.getParameter("logout");
        // if the operation parameter exists and equals "reset"
        // we should reset the form
        if( operation != null && operation.equals("log out") ){
            session.invalidate();
            session = request.getSession();
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
                 return; 
        

    }
    


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        

        return;
    }
} 