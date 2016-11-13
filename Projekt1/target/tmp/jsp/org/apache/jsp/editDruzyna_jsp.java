package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlet.serv.Druzyna;
import servlet.serv.Gracz;

public final class editDruzyna_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      servlet.service.Storage storage = null;
      synchronized (application) {
        storage = (servlet.service.Storage) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new servlet.service.Storage();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
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
      out.write("\r\n");
      out.write("\r\n");
 int id = Integer.parseInt(request.getParameter("id"));
    Druzyna d = storage.All().get(id);
    pageContext.setAttribute("d", d);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "boostrap.jsp", out, false);
      out.write("\r\n");
      out.write("                <!-- bootstrap -->\r\n");
      out.write("        <title>Druzyny i gracze</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("    <form action=\"updateDruzyna.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"nazwaDruzyny\">Nazwa drużyny</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nazwaDruzyny\" name=\"nazwaDruzyny\" value=\"");
      out.print(d.getNazwaDruzyny());
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"mZalozyciel\">Założyciel</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"mZalozyciel\" name=\"mZalozyciel\" value=\"");
      out.print(d.getmZalozyciel());
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"liczbaGraczy\">Liczba graczy</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"liczbaGraczy\" name=\"liczbaGraczy\" value=\"");
      out.print(d.getLiczbaGraczy());
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"Img\">Img</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"Img\" name=\"Img\" value=\"");
      out.print(d.getImg());
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" value=\"Edytuj\" class=\"btn btn-default\">Edytuj</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <form style=\"display: inline\" action=\"DruzynaView.jsp?id=");
      out.print(id);
      out.write("\" method=\"get\">\r\n");
      out.write("                                   <button class=\"btn btn-default\">Powrót</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
