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

@WebServlet(urlPatterns = "/addDruzyna")

public class addDruzyna extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s1 = request.getParameter("Img");

        if(request.getSession().getAttribute("druzyna") == null){
            request.getSession().setAttribute("druzyna", new Druzyna());
        }

        Storage ss = (Storage) getServletContext().getAttribute("storage");
        ss.add_druzyna(request.getParameter("nazwaDruzyny"),request.getParameter("mZalozyciel"),Integer.parseInt(request.getParameter("liczbaGraczy")),s1);
        int id = ss.All().size() - 1;
        response.sendRedirect("getGraczData.jsp?id=" + id);

    }

    @Override
    public void init() throws ServletException {
        if(getServletContext().getAttribute("storage") == null)
        {
            getServletContext().setAttribute("storage", new Storage());
        }
    }
}