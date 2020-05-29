package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DisplayAppointments_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("        <title>Display Appointments</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("           <style>\n");
      out.write("\n");
      out.write("            #button\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                border: black solid 1px;\n");
      out.write("                width: 130px;\n");
      out.write("                padding: 5px;\n");
      out.write("                border-radius:5px;\n");
      out.write("            }\n");
      out.write("            #headingdiv\n");
      out.write("            {\n");
      out.write("                height: 150px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #2831BE;\n");
      out.write("                position: relative;\n");
      out.write("                border-bottom: greenyellow 4px solid;           \n");
      out.write("            }\n");
      out.write("            #brandname\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 37%;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 55px;\n");
      out.write("                border-bottom: greenyellow 1px solid;\n");
      out.write("            }\n");
      out.write("            #brandmoto\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 95px;\n");
      out.write("                left: 650px;\n");
      out.write("            }\n");
      out.write("            #searchusersbyname\n");
      out.write("            {\n");
      out.write("                height: 40px;\n");
      out.write("                width: 200px;\n");
      out.write("                border: 2px solid greenyellow;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 70%;\n");
      out.write("                right: 9.5%;\n");
      out.write("            }\n");
      out.write("            #exitusers\n");
      out.write("            {\n");
      out.write("                color: red;\n");
      out.write("                font-size: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 7px;\n");
      out.write("                right: 30px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border: 1px solid red;\n");
      out.write("                padding: 3px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("            }\n");
      out.write("            #brandimage\n");
      out.write("            {\n");
      out.write("                height: 150px;\n");
      out.write("                width: 150px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 10px;\n");
      out.write("                left: 80px;\n");
      out.write("            }\n");
      out.write("            #searchimage\n");
      out.write("            {\n");
      out.write("                height: 23px; \n");
      out.write("                width: 23px;\n");
      out.write("            }\n");
      out.write("            #button1\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 69%;\n");
      out.write("                right: 5.8%;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            #button2\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 70%;\n");
      out.write("                right: 23.5%;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("    \n");
      out.write("            #searchusersbydate\n");
      out.write("            {\n");
      out.write("                height: 40px;\n");
      out.write("                width: 200px;\n");
      out.write("                border: 2px solid greenyellow;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 70%;\n");
      out.write("                right: 27%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("         <script>\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#button\").click(function()\n");
      out.write("                {\n");
      out.write("                    $(\"#allappointments\").show();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div id=\"headingdiv\" class=\"container-fluid\">\n");
      out.write("            <img src=\"images/doctors logo.gif\" alt=\"image not found\" id=\"brandimage\"/>\n");
      out.write("            <h1 id=\"brandname\"><span style=\"font-size: 65px;\">J</span>anta clinic</h1>\n");
      out.write("            <p id=\"brandmoto\">We care about your health</p>\n");
      out.write("            <div class=\"container\">\n");
      out.write("              \n");
      out.write("                <form action=\"DisplayByNames.jsp\">\n");
      out.write("                  <input type=\"text\" name=\"name\" placeholder=\"Patient's Name\" id=\"searchusersbyname\"/>\n");
      out.write("                  <button id=\"button1\" type=\"submit\" class=\"btn btn-success\"><img src=\"images/search1.png\" id=\"searchimage\"></button>\n");
      out.write("                </form>\n");
      out.write("                  \n");
      out.write("                <form action=\"DisplayByDate.jsp\">\n");
      out.write("                  <input type=\"date\"  placeholder=\"date\" id=\"searchusersbydate\"/>\n");
      out.write("                  <button id=\"button2\" type=\"submit\" class=\"btn btn-success\"><img src=\"images/search1.png\" id=\"searchimage\"></button>\n");
      out.write("                </form>\n");
      out.write("                <a href=\"Home.jsp\" id=\"exitusers\">Exit</a>\n");
      out.write("                  \n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        </div>        \n");
      out.write("       <br>\n");
      out.write("      \n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("    <center>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <th>Patient's Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Message</th>\n");
      out.write("            <th>Patient's Image</th>\n");
      out.write("            <th>Clinic</th>\n");
      out.write("            <th>Date</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("            <th>Update</th>\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </center>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/JantaClinic");
    _jspx_th_sql_setDataSource_0.setUser("JantaClinic");
    _jspx_th_sql_setDataSource_0.setPassword("JantaClinic");
    _jspx_th_sql_setDataSource_0.setVar("DataSource");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${DataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("data");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        select * from appointments\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("row");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><img src=\"ImageServlet?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"100px\" width=\"100px\" alt=\"image not available\"/></td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.clinic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><a href=\"DeletePatientController?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td>\n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
