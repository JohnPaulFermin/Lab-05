
package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                 return; 
        

    }
    


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String name = request.getParameter("user");
            String pwrd = request.getParameter("pass");
            try {
if(name.equals("abe")&&pwrd.equals("password")){
            HttpSession session = request.getSession();
            session.setAttribute("username",name);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/home.jsp");
            rd.forward(request, response);
        }else if(name.equals("barb")&&pwrd.equals("password")){ 
            HttpSession session = request.getSession();
            session.setAttribute("username",name);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/home.jsp");
            rd.forward(request, response);
        }
    
    } catch (Exception e) {
            
        if(!name.equals("abe")&&!pwrd.equals("password")){
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login.jsp");
            rd.include(request, response);
            rd.forward(request, response);
        }else if(!name.equals("barb")&&!pwrd.equals("password")){ 
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/login.jsp");
            rd.include(request, response);
        }
            
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
    }
    }
} 