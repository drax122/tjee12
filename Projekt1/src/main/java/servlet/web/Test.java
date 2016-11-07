package servlet.web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.serv.Druzyna;
import servlet.service.Storage;
import java.util.*;

@WebServlet(urlPatterns = "/Test")

public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Storage ss = (Storage) getServletContext().getAttribute("storage");
        String ID = request.getParameter("nazwaDruzyny");


        if(request.getSession().getAttribute("druzyna") == null){
            request.getSession().setAttribute("druzyna", new Druzyna());
        }
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("Znalezne to:");
        int kontrola = 0;
        for(int i=0;i<ss.All().size();i++){
            if(ss.All().get(i).getNazwaDruzyny().equals(ID)) {
                kontrola = 1;
                response.sendRedirect("DruzynaView.jsp?id=" + i);
            }
        }
        if(kontrola==0){
            // GDY NIE ZNAJDZIE DRUŻYNY
            response.sendRedirect("notfound.jsp");
        }
        out.close();

    }
    @Override
    public void init() throws ServletException {
        if(getServletContext().getAttribute("storage") == null)
        {
            getServletContext().setAttribute("storage", new Storage());
        }
    }
}