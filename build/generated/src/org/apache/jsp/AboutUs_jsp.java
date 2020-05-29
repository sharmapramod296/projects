package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"AboutUs.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"AboutUsmapcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\" id=\"ourdoctorsmaindiv\">\n");
      out.write("            <div class=\"container\" id=\"ourdoctorstitlediv\">\n");
      out.write("                <p id=\"ourdoctorstitle\">Our Doctor's</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jumbotron\" style=\"height: 400px; width: 350px;position: absolute; top: 50px;border-bottom: greenyellow 4px solid;\">\n");
      out.write("                <img src=\"images/doctor1.jpg\" alt=\"Image not found\" class=\"img-thumbnail img-responsive\" id=\"doctor1\"/>\n");
      out.write("                <p style=\"color: black; position: absolute; top: 330px; left: 5px;\">Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsumaLorem ipsuma</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jumbotron\" style=\"height: 400px; width: 350px;position: absolute; top: 50px; left: 600px ;border-bottom: greenyellow 4px solid;\">\n");
      out.write("                <img src=\"images/doctor2.jpg\" alt=\"Image not found\" class=\"img-thumbnail img-responsive\" id=\"doctor2\"/>\n");
      out.write("                <p style=\"color: black; position: absolute; top: 330px; left: 5px;\">Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsuma Lorem ipsumaLorem ipsuma</p>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" id=\"ourclinicsmaindiv\">\n");
      out.write("                <div class=\"container \" id=\"ourclinicstitlediv\">\n");
      out.write("                    <p id=\"ourclinictitle\">Our Clinic's</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"jumbotron\" style=\"height: 180px; width: 350px;position: absolute; top: 500px; left: 0px;border-bottom: greenyellow 4px solid;\">\n");
      out.write("                    <p id=\"clinicone\" ><strong>Clinic One:</strong><br>Ekta Chawl, Near Neelkamal Naka,Kashmira Dongri,Mira Road(East),Mumbai.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"jumbotron\" style=\"height: 180px; width: 350px;position: absolute; top: 500px; left: 600px;border-bottom: greenyellow 4px solid;\" >\n");
      out.write("                    <p id=\"clinictwo\"><strong>Clinic Two:</strong>Goyal Plaza, Shop no:08, Opp.Shiwar Garden, Mira Road(East),Mumbai.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("        <div class=\"container\" id=\"mapsmaindiv\">\n");
      out.write("            <p id=\"mapstitle\">Find us on Google Maps</p>\n");
      out.write("            <div class=\"container\" id=\"map1div\">\n");
      out.write("                <p id=\"map1\"><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15064.266593970726!2d72.87756426465775!3d19.279467644940258!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b06470a44893%3A0xf288aade686c83e0!2sKashimira%2C+Mira+Road%2C+Mira+Bhayandar%2C+Maharashtra+401107!5e0!3m2!1sen!2sin!4v1556704702416!5m2!1sen!2sin\" width=\"500\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" id=\"map2div\">\n");
      out.write("                <p id=\"map2\"><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3765.8841410682044!2d72.86225405006168!3d19.287403950242346!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b046312f7617%3A0x747d67c428b6dc42!2sGoyal+Plaza%2C+Bharti+Nagar%2C+Mira+Road%2C+Mira+Bhayandar%2C+Maharashtra+401107!5e0!3m2!1sen!2sin!4v1556705273165!5m2!1sen!2sin\" width=\"500\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"imageslider1\">\n");
      out.write("            <img src=\"images/doctor1.jpg\"/>             \n");
      out.write("            <img src=\"images/doctor2.jpg\"/>             \n");
      out.write("            <img src=\"images/doctors logo.gif\"/>             \n");
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
}
