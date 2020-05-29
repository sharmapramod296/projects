package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"headercss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("              #makeanappointmentheaderlink\n");
      out.write("            {\n");
      out.write("                font-size: 15px ;\n");
      out.write("                font-weight: bold; \n");
      out.write("                color: white;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 8px;\n");
      out.write("                left: 0px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #makeanappointmentheaderlink:hover\n");
      out.write("            {\n");
      out.write("                color: greenyellow;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #bigimagename\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50px; \n");
      out.write("                left: 400px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 30px;\n");
      out.write("                color: #2831BE;\n");
      out.write("            }\n");
      out.write("            #doctors\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 90px;\n");
      out.write("                left: 400px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: #09407B;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            #doctorsname\n");
      out.write("            {\n");
      out.write("                font-weight: normal;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" style=\"height: 40px; width: 120%; background-color: #2831BE\">\n");
      out.write("            <div class=\"container-fluid\" style=\"height: 40px; width: 200px; position: absolute; left: 250px;\">\n");
      out.write("                <a href=\"MakeAnAppointment.jsp\"  id=\"makeanappointmentheaderlink\">Make An Appointment</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\" style=\"height: 40px; width: 170px; background-color: red; position: absolute; right: 80px;\">\n");
      out.write("                <p style=\"color: white; font-size: 0.75em;\"><strong>Emergency Number:</strong>022-2812 9018</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\" id=\"icon\">\n");
      out.write("            <a href=\"Home.jsp\"><img src=\"images/doctors logo.gif\" id=\"doctorslogo\"/></a>\n");
      out.write("            <p id=\"name\">Janta Clinic</p>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\" style=\"height: 80px; width: 100%; background-color: white; position: absolute; top: 40px\">\n");
      out.write("            \n");
      out.write("            <div class=\"container\" id=\"addressone\">\n");
      out.write("            <p id=\"addressonedetails\"><strong>Clinic one: </strong>Ekta Chawl, Near Neelkamal Naka,Kashmira Dongri,Mira Road(East)</p>    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container\" id=\"addresstwo\">\n");
      out.write("            <p id=\"addresstwodetails\"><strong>Clinic two: </strong>Goyal Plaza, Shop no:08, Opp.Shiwar Garden, Mira Road(East)</p>    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container\" id=\"email\">\n");
      out.write("                <p style=\"color: black; opacity: 0.8\" ><strong>Email: </strong>jantaclinic1010@gmail.com</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img src=\"images/medical-doctor-stethoscope-and-office-sign-web-header.jpg\" alt=\"image not found\" id=\"bigimage\"/>\n");
      out.write("            <div style=\"height: 400px; position: absolute; top :160px; width: 100%;\">\n");
      out.write("                <p id=\"bigimagename\">Welcome To Janta Clinic</p>\n");
      out.write("                <ul id=\"doctors\">\n");
      out.write("                    <li >Dr. Parvez Shaikh<span id=\"doctorsname\">(M.D, B.A.M.S, C.C.H, C.G.O)</span></li>\n");
      out.write("                    <li >Dr. Sonal Shaikh<span id=\"doctorsname\">(B.A.M.S, C.C.H, C.G.O)</span></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div  class=\"container-fluid\" id=\"one\">\n");
      out.write("            <p><center><Strong>Working hours</Strong></center></p>\n");
      out.write("            <table class=\"table\">\n");
      out.write("              <thead>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\"> </th>\n");
      out.write("                  <td>Monday-Friday</td>\n");
      out.write("                  <td>5.15 pm to 11.00 pm</td>\n");
      out.write("                  <td>Clinic one</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\"> </th>\n");
      out.write("                  <td>Monday-Friday</td>\n");
      out.write("                  <td>10.30 pm to 2.30 pm</td>\n");
      out.write("                  <td>Clinic two</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\"> </th>\n");
      out.write("                  <td>Monday-Friday</td>\n");
      out.write("                  <td>6.45 pm to 10.30pm</td>\n");
      out.write("                  <td>Clinic two</td>\n");
      out.write("                </tr>\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\" id=\"two\">\n");
      out.write("             <p><strong><center>Appointments</center></strong></p>\n");
      out.write("             <p><center>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</center></p>\n");
      out.write("        <center><button type=\"button\" class=\"btn btn-success\"><a href=\"MakeAnAppointment.jsp\" style=\"color: black; text-decoration: none;\">Make An Appointment</a></button></center>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("          <div class=\"container-fluid\" id=\"three\">\n");
      out.write("             <p><strong><center>Emergency cases</center></strong></p>\n");
      out.write("             <p><strong><center>022-2812 9018</center></strong></p>\n");
      out.write("             <p><center>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</center></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
        out.write("          \n");
        out.write("            <div class=\"container-fluid\" id=\"navbar\">\n");
        out.write("                <nav>\n");
        out.write("                    <a href=\"Home.jsp\" id=\"navbarelements\">Home</a>\n");
        out.write("                    <a href=\"AboutUs.jsp\" id=\"navbarelements\">About us</a>\n");
        out.write("                    <a href=\"Register.jsp\" id=\"navbarelements\">Register</a>\n");
        out.write("                    <a href=\"Login.jsp\" id=\"navbarelements\">Login</a>\n");
        out.write("                </nav>\n");
        out.write("            </div>\n");
        out.write("            ");
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
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("          \n");
        out.write("            <div class=\"container-fluid\" id=\"navbar\">\n");
        out.write("                <nav>\n");
        out.write("                    <a href=\"Home.jsp\" id=\"navbarelements\">Home</a>\n");
        out.write("                    <a href=\"AboutUs.jsp\" id=\"navbarelements\">About us</a>.\n");
        out.write("                     <a href=\"EditController?name=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" id=\"navbarelements\">Edit profile</a>\n");
        out.write("                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <a href=\"Login.jsp\" id=\"navbarelements\">Logout</a>\n");
        out.write("                </nav>\n");
        out.write("            </div>\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role=='admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <a href=\"DisplayUsers.jsp\" id=\"navbarelements\">Display</a>\n");
        out.write("                    <a href=\"DisplayAppointments.jsp\" id=\"navbarelements\">Patients</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
