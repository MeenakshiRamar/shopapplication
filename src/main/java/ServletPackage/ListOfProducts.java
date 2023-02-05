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

@WebServlet("/ListOfProducts")
public class ListOfProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListOfProducts() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buyed=request.getParameter("n");	
		String q=request.getParameter("q"); 
		int q1=Integer.parseInt(q);
		PrintWriter out=response.getWriter();
		int quan = 0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","Meenakshi@123");  
			PreparedStatement stmt=con.prepareStatement("select Quantity from ListOfProduct2 where product='"+buyed+"'");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				String quanDB;
				 quanDB=rs.getString("Quantity");
				 quan=Integer.parseInt(quanDB);
			}
			int sub=quan-q1;
			if(q1<=quan)
			{
			stmt.executeUpdate("update ListOfProduct2 set Quantity='"+sub+"' where product='"+buyed+"'");
			response.sendRedirect("Buyed.jsp");
			}
			else
			{
				out.println("Stock is not available");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
