package ServletPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrogetPasswordShop")
public class FrogetPasswordShop extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FrogetPasswordShop() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("p");
		String name=request.getParameter("n");
		String eMail=request.getParameter("e");	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			String q="update ShopData set User_password='"+password+"' where user_name='"+name+"'";
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.executeUpdate();
			response.sendRedirect("index.jsp");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
	}

}
