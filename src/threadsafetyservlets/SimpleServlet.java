package threadsafetyservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	
	  private static final long serialVersionUID = 1L;
	  //A variable that is NOT thread-safe!
	  private int counter = 0;
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException
	  {
	    doPost(req, resp);
	  }
	  public void doPost(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException
	  {
	    resp.getWriter().println("<HTML><BODY>");
	    resp.getWriter().println(this + ": <br>");
	    for (int c = 0; c < 10; c++)
	    {
	      resp.getWriter().println("Counter = " + counter + "<BR>");
	      try
	      {
	        Thread.currentThread().sleep((long) Math.random() * 1000);
	        counter++;
	      }
	      catch (InterruptedException exc) { }
	    }
	    resp.getWriter().println("</BODY></HTML>");
	  }

}
