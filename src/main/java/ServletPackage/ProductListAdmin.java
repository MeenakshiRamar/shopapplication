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

@WebServlet("/ProductListAdmin")
public class ProductListAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProductListAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			PreparedStatement stmt=con.prepareStatement("select * from ListOfProduct");
			ResultSet rs=stmt.executeQuery();
			PrintWriter out=response.getWriter();
			while(rs.next())
			{
				out.println(rs.getString("product"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
	}}