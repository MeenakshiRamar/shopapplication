package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateProduct() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product1=request.getParameter("n");
		String product_head=request.getParameter("h");
		String prize=request.getParameter("p");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			String q="update ListOfProduct2 set product_lead='"+product_head+"' where product='"+product1+"'";
			PreparedStatement stmt=con.prepareStatement(q);
			String q1="update ListOfProduct2 set product_prize='"+prize+"'  where product='"+product1+"'";
			stmt.executeUpdate(q);
			stmt.executeUpdate(q1);
			response.sendRedirect("UpdateProduct.jsp");	
			}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}

