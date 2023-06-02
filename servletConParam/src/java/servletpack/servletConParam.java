package servletpack;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
public class servletConParam extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
    {
     
        try 
        {
            ServletContext context = getServletContext();
            String para1 = context.getInitParameter("app-developer");
            String para2 = context.getInitParameter("launch-date");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletConParam</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Context Parameter List</h1><hr>");
            out.println("<pre>");
            out.println("Application Developer : "+para1);
            out.println("Date of Launch        : "+para2);
            out.println("</pre>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }   

}
