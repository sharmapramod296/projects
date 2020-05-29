package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SmallHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Small Header</title>\n");
      out.write("                <style>\n");
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
      out.write("            #searchusers\n");
      out.write("            {\n");
      out.write("                height: 40px;\n");
      out.write("                width: 200px;\n");
      out.write("                border: 2px solid greenyellow;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 70%;\n");
      out.write("                right: 10%;\n");
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
      out.write("            button\n");
      out.write("            {\n");
      out.write("                background-color: transparent;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 69%;\n");
      out.write("                right: 5.8%;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"headingdiv\" class=\"container-fluid\">\n");
      out.write("            <img src=\"images/doctors logo.gif\" alt=\"image not found\" id=\"brandimage\"/>\n");
      out.write("            <h1 id=\"brandname\"><span style=\"font-size: 65px;\">J</span>anta clinic</h1>\n");
      out.write("            <p id=\"brandmoto\">We care about your health</p>\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <nav>\n");
      out.write("                  <form action=\"SearchedUsers.jsp\">\n");
      out.write("                  <input type=\"text\" name=\"username\" placeholder=\"username\" id=\"searchusers\"/>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success\"><img src=\"images/search1.png\" id=\"searchimage\"></button>\n");
      out.write("                  </form>\n");
      out.write("                  <a href=\"Home.jsp\" id=\"exitusers\">Exit</a>\n");
      out.write("                  \n");
      out.write("              </nav>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        <br>\n");
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
}
