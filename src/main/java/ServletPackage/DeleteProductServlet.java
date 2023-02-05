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

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product=request.getParameter("n");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project1","root","Meenakshi@123");  
			String q="delete from ListOfProduct2 where product='"+product+"'";
			PreparedStatement stmt=con.prepareStatement(q);
			int n=stmt.executeUpdate();
			if(n>0)
			{
			
			response.sendRedirect("DeleteProduct.jsp");	
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
