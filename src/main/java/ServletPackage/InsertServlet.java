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

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product=request.getParameter("n");
		String product_head=request.getParameter("h");
		String prize=request.getParameter("p");
		String quantity=request.getParameter("q");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			String q="insert into ListOfProduct2 (product,product_lead,product_prize,Quantity) values('"+product+"','"+product_head+"','"+prize+"','"+quantity+"')";
			PreparedStatement stmt=con.prepareStatement(q);
			int n=stmt.executeUpdate();
			if(n>0)
			{
			response.sendRedirect("ProductList.jsp");	
			}
			else
			{
			out.print("Not Successfully");		
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
