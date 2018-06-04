

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributeSet
 */
@WebServlet("/AttributeSet")
public class AttributeSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributeSet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			  
			response.setContentType("text/html");  
			PrintWriter out=response.getWriter();  
			  
			ServletContext context=getServletContext();  
			context.setAttribute("company","IBM");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='servlet6'>visit</a>");  
			out.close();  
			  
			}catch(Exception e){System.out.println(e);}  
			  
			}
	}


