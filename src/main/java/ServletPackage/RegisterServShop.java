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

@WebServlet("/RegisterServShop")
public class RegisterServShop extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServShop() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("n");	
		String password=request.getParameter("p");
		String eMail=request.getParameter("e");	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			String q="insert into ShopData (user_name,User_password,email) values('"+name+"','"+password+"','"+eMail+"')";
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
