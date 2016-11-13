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

@WebServlet(urlPatterns = "/addGraczy")

public class addGraczy extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if(request.getSession().getAttribute("druzyna") == null){
            request.getSession().setAttribute("druzyna", new Druzyna());
        }

        Storage ss = (Storage) getServletContext().getAttribute("storage");

        String nick,dyw;
        Integer pen;
        int id = ss.All().size() - 1;
        for (int i=1; i <= ss.All().get(id).getLiczbaGraczy(); i++)
        {
            nick = request.getParameter("gracz" + i + ".Nickname");
            dyw = request.getParameter("gracz" + i + ".Dywizja");
            pen = Integer.parseInt(request.getParameter("gracz"+ i + ".Pensja"));

            ss.All().get(id).dodajGracza(nick,pen,dyw);
        }
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