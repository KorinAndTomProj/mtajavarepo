package com.myorg.javacourse;
import java.io.IOException;
import javax.servlet.http.*;
import com.myorg.javacourse.MathEx3;

@SuppressWarnings("serial")
public class LearnServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		int x = 1;
		int y = 1;
		String result = x + " + " + y + " = " + MathEx3.sum(x, y);
	
		resp.getWriter().println(result);
	}
}

