package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("          <link href=\"RegisterCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function ()\n");
      out.write("                {\n");
      out.write("                   $(\"#closeregister\").click(function ()\n");
      out.write("                   {\n");
      out.write("                       $(\"#registermain\").hide(1000);\n");
      out.write("                   })     \n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <!--ajax code-->\n");
      out.write("               \n");
      out.write("        <script>\n");
      out.write("            function myfunction(element)\n");
      out.write("            {\n");
      out.write("                url=\"RegisterController?id=\"+element.id+\"&val=\"+element.value;\n");
      out.write("                xhttp=new  XMLHttpRequest(); \n");
      out.write("                xhttp.onreadystatechange=function()\n");
      out.write("                {\n");
      out.write("                    if(xhttp.readyState==4 && xhttp.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"message\"+element.id).innerHTML=xhttp.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                xhttp.open(\"GET\",url)\n");
      out.write("                xhttp.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");

                String username="",email="",password="",confirmpassword="",contact="",address="";
                Cookie cookie[]=request.getCookies();
                for(Cookie c:cookie)
                {
                    if(c.getName().equals("username"))
                    {
                        username=c.getValue();
                    }
                    else if(c.getName().equals("email"))
                    {
                        email=c.getValue();
                    }
                    else if(c.getName().equals("password"))
                    {
                        password=c.getValue();
                    }
                    else if(c.getName().equals("confirmpassword"))
                    {
                        confirmpassword=c.getValue();
                    }
                    else if(c.getName().equals("contact"))
                    {
                        contact=c.getValue();
                    }
                    else if(c.getName().equals("address"))
                    {
                        address=c.getValue();
                    }
                }
            
          out.write("\n");
          out.write("        \n");
          out.write("            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home.jsp", out, false);
          out.write("\n");
          out.write("          <div class=\"container-fluid\">\n");
          out.write("            <div class=\"container-fluid\" id=\"registermain\">\n");
          out.write("                <div id=\"registerimagediv\">\n");
          out.write("                    <img src=\"images/coffee-cup-drink-875511.jpg\" alt=\"image not found\" id=\"registerimage\"/>\n");
          out.write("                </div>\n");
          out.write("          <center>\n");
          out.write("                <div id=\"Registercontent\">\n");
          out.write("                    <div id=\"registertitlediv\">\n");
          out.write("                          <p style=\"background-color: #2831BE;height:40px;\"id=\"registertitle\">Register</p>\n");
          out.write("                          <div id=\"closeregister\">+</div>\n");
          out.write("                      </div>\n");
          out.write("                    \n");
          out.write("                    <form action=\"RegisterController\" method=\"post\">\n");
          out.write("                        <table>\n");
          out.write("                            <tr>\n");
          out.write("                                <td><input type=\"text\" name=\"username\" placeholder=\"Username\" id=\"username\" onkeyup=\"myfunction(this)\" /><span id=\"messageusername\" style=\"color:red\"></span><br></td>\n");
          out.write("                            </tr>\n");
          out.write("                            \n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <input onkeyup=\"myfunction(this)\" type=\"text\" name=\"email\" placeholder=\"Email\" value=\"");
          out.print(email);
          out.write("\" id=\"emailaddress\"/><span id=\"messageemailaddress\" style=\"color:red\"></span><br>\n");
          out.write("                                    <short style=\"color: black; font-size: 0.8em;\">Your email will be safe with us</short>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            \n");
          out.write("                            <tr>\n");
          out.write("                                <td><input type=\"password\" name=\"password\" placeholder=\"Password\" id=\"password\" value=\"");
          out.print(password);
          out.write("\" /></td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td><input type=\"password\" name=\"confirmpassword\" placeholder=\"Confirm Password\" id=\"confirmpassword\" value=\"");
          out.print(confirmpassword);
          out.write("\" /></td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td><input onkeyup=\"myfunction(this)\" type=\"text\" name=\"contact\" placeholder=\"Contact number\" value=\"");
          out.print(contact);
          out.write("\"  id=\"contact\" /><span id=\"messagecontact\" style=\"color:red\"></span><br></td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td><textarea rows=\"3\" cols=\"22\" placeholder=\"Address\" name=\"address\" value=\"");
          out.print(address);
          out.write("\"></textarea></td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td style=\"color: black;\">\n");
          out.write("                                    Male:<input type=\"radio\" name=\"gender\" value=\"Male\" />\n");
          out.write("                                    Female:<input type=\"radio\" name=\"gender\" value=\"Female\" />\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                <button type=\"submit\" class=\"btn btn-success\" onclick=\"validate()\">Register</button>\n");
          out.write("                                <button type=\"submit\" class=\"btn btn-success\">Reset</button>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td style=\"color: black;\">Already have an account: <a href=\"Login.jsp\"/>Login</td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                            <p id=\"message\" style=\"color: red\"></p>\n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                            \n");
          out.write("                    </form>\n");
          out.write("                </div>\n");
          out.write("             </center>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("         \n");
      out.write("        \n");
      out.write("          <script>\n");
      out.write("            function validate()\n");
      out.write("           {\n");
      out.write("              var password=document.getElementById(\"password\").value;\n");
      out.write("              var confirmpassword=document.getElementById(\"confirmpassword\").value;\n");
      out.write("              if(password!=confirmpassword)\n");
      out.write("              {\n");
      out.write("                  alert(\"Password and Confirm password should be same\")\n");
      out.write("                  document.getElementById(\"message\").innerHTML=\"Password and Confirm password should be same\"\n");
      out.write("              }\n");
      out.write("              else\n");
      out.write("              {\n");
      out.write("                  username=document.getElementById(\"username\").value\n");
      out.write("                  alert(\"welcome : \"+username)\n");
      out.write("              }\n");
      out.write("          }\n");
      out.write("          </script>\n");
      out.write("            \n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("          \n");
        out.write("          \n");
        out.write("            ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home.jsp", out, false);
        out.write("\n");
        out.write("          <div class=\"container-fluid\">\n");
        out.write("            <div class=\"container-fluid\" id=\"registermain\">\n");
        out.write("                <div id=\"registerimagediv\">\n");
        out.write("                    <img src=\"images/coffee-cup-drink-875511.jpg\" alt=\"image not found\" id=\"registerimage\"/>\n");
        out.write("                </div>\n");
        out.write("          <center>\n");
        out.write("                <div id=\"Registercontent\">\n");
        out.write("                    <div id=\"registertitlediv\">\n");
        out.write("                          <p style=\"background-color: #2831BE;height:40px;\"id=\"registertitle\">Update Profile</p>\n");
        out.write("                          <div id=\"closeregister\">+</div>\n");
        out.write("                      </div>\n");
        out.write("                    \n");
        out.write("                    <form action=\"EditController\" method=\"post\">\n");
        out.write("                        <table>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"text\" name=\"username\" placeholder=\"Username\" id=\"username\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly /></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    <input type=\"email\" name=\"email\" placeholder=\"Email\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  />\n");
        out.write("                                    <short style=\"color: black; font-size: 0.8em;\">Your email will be safe with us</short>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"password\" name=\"password\" placeholder=\"Password\" id=\"password\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"password\" name=\"confirmpassword\" placeholder=\"Confirm Password\" id=\"confirmpassword\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.confirmpassword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><input type=\"text\" name=\"contact\" placeholder=\"Contact number\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><textarea rows=\"3\" cols=\"22\" placeholder=\"Address\" name=\"address\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registerData1.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></textarea></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"color: black;\">\n");
        out.write("                                    Male:<input type=\"radio\" name=\"gender\" value=\"Male\" />\n");
        out.write("                                    Female:<input type=\"radio\" name=\"gender\" value=\"Female\" />\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    <button type=\"submit\" class=\"btn btn-success\" onclick=\"validate()\">Register</button>\n");
        out.write("                                <button type=\"submit\" class=\"btn btn-success\">Reset</button>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"color: black;\">Already have an account: <a href=\"Login.jsp\"/>Login</td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                            <p id=\"message\" style=\"color: red\"></p>\n");
        out.write("                            </tr>\n");
        out.write("                        </table>\n");
        out.write("                    </form>\n");
        out.write("                </div>\n");
        out.write("             </center>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("       ");
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
