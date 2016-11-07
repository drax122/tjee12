package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateGracz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      servlet.serv.Druzyna druzyna = null;
      synchronized (session) {
        druzyna = (servlet.serv.Druzyna) _jspx_page_context.getAttribute("druzyna", PageContext.SESSION_SCOPE);
        if (druzyna == null){
          druzyna = new servlet.serv.Druzyna();
          _jspx_page_context.setAttribute("druzyna", druzyna, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      servlet.serv.Gracz gracz = null;
      synchronized (session) {
        gracz = (servlet.serv.Gracz) _jspx_page_context.getAttribute("gracz", PageContext.SESSION_SCOPE);
        if (gracz == null){
          gracz = new servlet.serv.Gracz();
          _jspx_page_context.setAttribute("gracz", gracz, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("druzyna"), request);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("gracz"), request);
      out.write("\r\n");
      out.write("\r\n");
      servlet.service.Storage storage = null;
      synchronized (application) {
        storage = (servlet.service.Storage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new servlet.service.Storage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

    Integer idDruzyna = Integer.parseInt(request.getParameter("idDruzyna"));
    Integer idGracz = Integer.parseInt(request.getParameter("idGracz"));

    String nickname = request.getParameter("Nickname");
    Integer Pensja = Integer.parseInt(request.getParameter("Pensja"));
    String Dyw = request.getParameter("Dywizja");

    storage.updateGracz(idDruzyna,idGracz,nickname,Pensja,Dyw);
    response.sendRedirect("DruzynaView.jsp?id=" + idDruzyna);

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
