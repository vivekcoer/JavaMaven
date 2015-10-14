package servletexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PostExample extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;     
	 int count;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			  throws ServletException, IOException {

			  StringBuffer jb = new StringBuffer();
			  String line = null;
			  try {
			    BufferedReader reader = request.getReader();
			    while ((line = reader.readLine()) != null)
			      jb.append(line);
			  } catch (Exception e) { /*report an error*/ }

//			  try {
//			    JSONObject jsonObject = JSONObject.fromObject(jb.toString());
//			  } catch (ParseException e) {
//			    // crash and burn
//			    throw new IOException("Error parsing JSON request string");
//			  }
			}
	
	protected void doGet(HttpServletRequest request,
		      HttpServletResponse response) throws ServletException, IOException {
		    // Set a cookie for the user, so that the counter does not increate
		    // every time the user press refresh
		    HttpSession session = request.getSession(true);
		    // Set the session valid for 5 secs
		    session.setMaxInactiveInterval(5);
		    response.setContentType("text/plain");
		    PrintWriter out = response.getWriter();
		    if (session.isNew()) {
		      count++;
		    }
		    out.println("This site has been accessed " + count + " times.");
		  }
}