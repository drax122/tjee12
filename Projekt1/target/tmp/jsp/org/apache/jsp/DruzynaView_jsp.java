package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlet.serv.Druzyna;

public final class DruzynaView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
 int id = Integer.parseInt(request.getParameter("id"));
Druzyna d = storage.All().get(id);
pageContext.setAttribute("d", d);
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "boostrap.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- bootstrap-->\r\n");
      out.write("<title>Druzyny i gracze</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("<div class=\"navbar-header\">\r\n");
      out.write("<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\"></button>\r\n");
      out.write("<a class=\"navbar-brand\" href=\"index.jsp\">Drużyny i gracze</a>\r\n");
      out.write("</div>\r\n");
      out.write("<ul class=\"nav navbar-nav\">\r\n");
      out.write("<li><a href=\"pokazWszystkieDruzyny.jsp\">Drużyny</a></li>\r\n");
      out.write("<li><a href=\"getDruzynaData.jsp\">Dodaj nową drużynę</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-6 col-md-3\">\r\n");
      out.write("            <a href=\"\" class=\"thumbnail\">\r\n");
      out.write("                <img src=\"");
      out.print(d.getImg());
      out.write("\" alt=\"\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <!-- Default panel contents -->\r\n");
      out.write("                <div class=\"panel-heading\"><b>Dane drużyny: </b></div>\r\n");
      out.write("                <!-- List group -->\r\n");
      out.write("                <ul class=\"list-group\">\r\n");
      out.write("                <li class=\"list-group-item\">Nazwa Druzyny: ");
      out.print(d.getNazwaDruzyny());
      out.write("</li>\r\n");
      out.write("                <li class=\"list-group-item\">Załozyciel: ");
      out.print(d.getmZalozyciel());
      out.write("</li>\r\n");
      out.write("                <li class=\"list-group-item\">Liczba graczy: ");
      out.print(d.getLiczbaGraczy());
      out.write("</li>\r\n");
      out.write("                <li class\"list-group-item\">\r\n");
      out.write("                <a href=\"editDruzyna.jsp?id=");
      out.print(id);
      out.write("\" title=\"Edytuj daną drużynę\" type=\"button\"\r\n");
      out.write("                                                                             class=\"btn btn-default btn-sm\"><span class=\"glyphicon glyphicon-pencil\"></span></a>\r\n");
      out.write("                <a href=\"addGraczGetData.jsp?id=");
      out.print(id);
      out.write("\" title=\"Dodaj nowego gracza\" type=\"button\"\r\n");
      out.write("                                             class=\"btn btn-default btn-sm\"><span class=\"glyphicon glyphicon-plus\"></span></a>\r\n");
      out.write("                <a href=\"removeDruzyna.jsp?id=");
      out.print(id);
      out.write("\" title=\"Usuń drużynę\" type=\"button\"\r\n");
      out.write("                                              class=\"btn btn-default btn-sm\"><span class=\"glyphicon glyphicon-remove\"></span></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-6 col-md-9\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                         <div class=\"panel-heading\">Lista graczy</div>\r\n");
      out.write("                     <table class=\"table\"><tr>\r\n");
      out.write("                        <th><h3 style=\"font-size: larger\"><strong>Nickname</strong></h3></th>\r\n");
      out.write("                        <th><h3 style=\"font-size: larger\"><strong>Pensja</strong></h3></th>\r\n");
      out.write("                        <th><h3 style=\"font-size: larger\"><strong>Dywizja</strong></h3></th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.getListaGraczy()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("listaGraczy");
      _jspx_th_c_forEach_0.setVarStatus("loop");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <tr>\r\n");
            out.write("                            <td><h5 style=\"font-size: larger\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaGraczy.getNickname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </h5></td>\r\n");
            out.write("                            <td><h5 style=\"font-size: larger\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaGraczy.getPensja()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </h5></td>\r\n");
            out.write("                            <td><h5 style=\"font-size: larger\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaGraczy.getDywizja()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </h5></td>\r\n");
            out.write("                            <td><a title=\"Edytuj gracza\"\r\n");
            out.write("                            href=\"editGracz.jsp?idGracz=");
            out.print(d.getListaGraczy().indexOf(pageContext.getAttribute("listaGraczy")));
            out.write("&idDruzyna=");
            out.print(id);
            out.write("\"\r\n");
            out.write("                            type=\"button\" class=\"btn btn-default btn-sm\">\r\n");
            out.write("                            <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>\r\n");
            out.write("                            </a>\r\n");
            out.write("                            <td>\r\n");
            out.write("                            <td><a title=\"Usuń gracza\"\r\n");
            out.write("                            href=\"removeGracz.jsp?idGracz=");
            out.print(d.getListaGraczy().indexOf(pageContext.getAttribute("listaGraczy")));
            out.write("&idDruzyna=");
            out.print(id);
            out.write("\"\r\n");
            out.write("                            type=\"button\" class=\"btn btn-default btn-sm\">\r\n");
            out.write("                            <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>\r\n");
            out.write("                            </a>\r\n");
            out.write("                            <td>\r\n");
            out.write("                        </tr>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     </body>\r\n");
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
