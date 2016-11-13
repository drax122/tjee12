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

@WebServlet(urlPatterns = "/addGracz")

public class addGracz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if(request.getSession().getAttribute("druzyna") == null){
            request.getSession().setAttribute("druzyna", new Druzyna());
        }

        Storage ss = (Storage) getServletContext().getAttribute("storage");

        int id = Integer.parseInt(request.getParameter("id"));
        String s1 = request.getParameter("Nickname");
        Integer s2 = Integer.parseInt(request.getParameter("Pensja"));
        String s3 = request.getParameter("Dywizja");
        ss.All().get(id).dodajGracza(s1,s2,s3);
        response.sendRedirect("DruzynaView.jsp?id=" + id);



    }

    @Override
    public void init() throws ServletException {
        if(getServletContext().getAttribute("storage") == null)
        {
            getServletContext().setAttribute("storage", new Storage());
        }
    }
}