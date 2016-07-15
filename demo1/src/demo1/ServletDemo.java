package demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ServletDemo() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 PreparedStatement pstmt = null;
		 Connection conn = null;
		  String sql ="你好";
		try{
            Class.forName("com.mysql.jdbc.Driver") ;
            String url ="jdbc:mysql://118.193.205.238:3306/demo" ;
             conn = DriverManager.getConnection(url,"root","qscqsc42") ;
             pstmt = conn.prepareStatement("insert into car(carcol) values ('ceshi')");
             pstmt.execute();
                    }catch(Exception e){
            System.out.println("failure!!!") ;
            e.printStackTrace();
        }	
		response.getWriter().write("ok");
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
