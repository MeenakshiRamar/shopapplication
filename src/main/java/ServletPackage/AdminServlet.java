package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("n");
		String password=request.getParameter("p");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			PreparedStatement stmt=con.prepareStatement("select * from AdminLoginData where user_name=? and User_password=?");
			stmt.setString(1, name);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			if(rs.next())
			{
			response.sendRedirect("Admin.jsp");	
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.print("Entered User name And Password is wrong");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
