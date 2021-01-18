package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"tr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>GIRIS YAP | EMLAK</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">   \n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n");
      out.write("    <!-- price picker slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/nouislider.css\">\n");
      out.write("    <!-- Fancybox slider -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" /> \n");
      out.write("    <!-- Theme color -->\n");
      out.write("    <link id=\"switcher\" href=\"css/theme-color/default-theme.css\" rel=\"stylesheet\">     \n");
      out.write("\n");
      out.write("    <!-- Main style sheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">    \n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Vollkorn' rel='stylesheet' type='text/css'>    \n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  <script type=\"text/javascript\" \n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <section id=\"aa-signin\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-signin-area\">\n");
      out.write("            <div class=\"aa-signin-form\">\n");
      out.write("              <div class=\"aa-signin-form-title\">\n");
      out.write("                <a class=\"aa-property-home\" href=\"index.jsp\">ANA SAYFA</a>\n");
      out.write("                <h4>Hesabiniza giris yapin</h4>\n");
      out.write("              </div>\n");
      out.write("              <form class=\"contactform\" action=\"login\" method=\"post\" id=\"loginForm\">                                                 \n");
      out.write("                <div class=\"aa-single-field\">\n");
      out.write("                  <label for=\"email\">Email <span class=\"required\">*</span></label>\n");
      out.write("                  <input type=\"email\" required=\"required\" aria-required=\"true\" value=\"\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-single-field\">\n");
      out.write("                  <label for=\"password\">Password <span class=\"required\">*</span></label>\n");
      out.write("                  <input type=\"password\" name=\"password\"> \n");
      out.write("                      <br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-single-field\">\n");
      out.write("                <label>\n");
      out.write("                  <input type=\"checkbox\"> Beni Hatirla\n");
      out.write("                </label>                                                          \n");
      out.write("                </div> \n");
      out.write("                <div class=\"aa-single-submit\">\n");
      out.write("                  <input type=\"submit\" value=\"Giris Yap\" class=\"aa-browse-btn\" name=\"submit\">  \n");
      out.write("                  <p>Kayit olmak için <a href=\"register.jsp\">KAYIT OL</a></p>\n");
      out.write("                  <p>Anasayfaya dönmek için <a href=\"index.jsp\">ANASAYFA</a></p>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  \n");
      out.write("  <!-- jQuery library -->\n");
      out.write("  <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script> -->\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>   \n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>   \n");
      out.write("  <!-- slick slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/slick.js\"></script>\n");
      out.write("  <!-- Price picker slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/nouislider.js\"></script>\n");
      out.write("   <!-- mixit slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.mixitup.js\"></script>\n");
      out.write("  <!-- Add fancyBox -->        \n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.fancybox.pack.js\"></script>\n");
      out.write("  <!-- Custom js -->\n");
      out.write("  <script src=\"js/custom.js\"></script> \n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#loginForm\").validate({\n");
      out.write("\t\t\trules: {\n");
      out.write("\t\t\t\temail: {\n");
      out.write("\t\t\t\t\trequired: true,\n");
      out.write("\t\t\t\t\temail: true\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\n");
      out.write("\t\t\t\tpassword: \"required\",\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tmessages: {\n");
      out.write("\t\t\t\temail: {\n");
      out.write("\t\t\t\t\trequired: \"Please enter email\",\n");
      out.write("\t\t\t\t\temail: \"Please enter a valid email address\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tpassword: \"Please enter password\"\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
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
