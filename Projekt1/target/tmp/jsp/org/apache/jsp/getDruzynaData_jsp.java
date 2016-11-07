package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getDruzynaData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <!-- CSS -->\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "boostrap.jsp", out, false);
      out.write("\r\n");
      out.write("  <title>Drużyny i gracze</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      servlet.service.Storage storage = null;
      synchronized (application) {
        storage = (servlet.service.Storage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new servlet.service.Storage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      servlet.serv.Druzyna druzyna = null;
      synchronized (session) {
        druzyna = (servlet.serv.Druzyna) _jspx_page_context.getAttribute("druzyna", PageContext.SESSION_SCOPE);
        if (druzyna == null){
          druzyna = new servlet.serv.Druzyna();
          _jspx_page_context.setAttribute("druzyna", druzyna, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\"></button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.jsp\">Drużyny i gracze</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("           <li><a href=\"pokazWszystkieDruzyny.jsp\">Drużyny</a></li>\r\n");
      out.write("           <li><a href=\"getDruzynaData.jsp\">Dodaj nową drużynę</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("     <h3>Dodaj nową drużynę!</h3>\r\n");
      out.write("     <div class=\"container-fluid\">\r\n");
      out.write("        <form action=\"addDruzyna.jsp\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"nazwaDruzyny\">Nazwa drużyny</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"nazwaDruzyny\" name=\"nazwaDruzyny\" placeholder=\"Druzyna\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"mZalozyciel\">Założyciel</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"mZalozyciel\" name=\"mZalozyciel\" placeholder=\"Zalozyciel\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"liczbaGraczy\">Liczba graczy</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"liczbaGraczy\" name=\"liczbaGraczy\" placeholder=\"Liczba graczy\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"Img\">Logo</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"Img\" name=\"Img\" placeholder=\"Link do obrazka\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <button type=\"submit\" value=\"add\" class=\"btn btn-default\">Dodaj</button>\r\n");
      out.write("          </form>\r\n");
      out.write("          <a href=\"pokazWszystkieDruzyny.jsp\"><button class=\"btn btn-default\">Powrót</button></a>\r\n");
      out.write("         </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
