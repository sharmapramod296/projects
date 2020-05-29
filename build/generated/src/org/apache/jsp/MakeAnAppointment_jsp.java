package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MakeAnAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Make An Appointment</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("          <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("          <link href=\"MakeAnAppointmentCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <script>\n");
      out.write("           $(document).ready(function ()\n");
      out.write("           {\n");
      out.write("               $(\"#close\").click(function ()\n");
      out.write("               {\n");
      out.write("                   $(\"#makeanappointmentmain\").hide(1000);\n");
      out.write("               });\n");
      out.write("           });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         \n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <script>\n");
        out.write("               ");
        if (true) {
          _jspx_page_context.forward("Login.jsp");
          return true;
        }
        out.write("\n");
        out.write("            </script>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home.jsp", out, false);
        out.write("\n");
        out.write("        <div class=\"container-fluid\">\n");
        out.write("            <div class=\"container-fluid\" id=\"makeanappointmentmain\">\n");
        out.write("          <center>\n");
        out.write("                <div id=\"makeanappointmentcontent\">\n");
        out.write("                    <div id=\"titlediv\">\n");
        out.write("                          <p style=\"background-color: #2831BE;height:40px;\"id=\"title\">Make an Appointment</p>\n");
        out.write("                          <div id=\"close\">+</div>\n");
        out.write("                      </div>\n");
        out.write("                    \n");
        out.write("                    <form action=\"MakeAnAppointmentController\" method=\"post\" enctype=\"multipart/form-data\">\n");
        out.write("                        <table>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"text\" name=\"name\" placeholder=\"Patient's name\" /></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"email\" name=\"email\" placeholder=\"Email\" /></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"text\" name=\"contact\" placeholder=\"Contact number\" /></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><textarea rows=\"3\" cols=\"22\" placeholder=\"Message\" name=\"message\"></textarea></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"color: black;\"><input type=\"file\" name=\"image\" accept=\"image\\*\" placeholder=\"image of the patient\">\n");
        out.write("                            <short style=\"color: black; font-size: 0.8em;\">Photo of the patient(not mandatory)</short>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"color: black;\">\n");
        out.write("                                    Clinic one:<input type=\"radio\" name=\"clinic\" value=\"Clinic one\" />\n");
        out.write("                                    Clinic two:<input type=\"radio\" name=\"clinic\" value=\"Clinic two\" />\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"date\" name=\"date\" id=\"date\"/></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
        out.write("                                <button type=\"submit\" class=\"btn btn-success\">Reset</button>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                        </table>\n");
        out.write("                    </form>\n");
        out.write("                </div>\n");
        out.write("             </center>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
