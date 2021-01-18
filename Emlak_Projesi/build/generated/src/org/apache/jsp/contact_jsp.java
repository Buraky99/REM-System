package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"tr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>İLETİŞİM | EMLAK</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
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
      out.write("  \n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <!-- Pre Loader -->\n");
      out.write("  <div id=\"aa-preloader-area\">\n");
      out.write("    <div class=\"pulse\"></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("  <!-- END SCROLL TOP BUTTON --> \n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Start header section -->\n");
      out.write("  <header id=\"aa-header\">  \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-header-area\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"aa-header-left\">\n");
      out.write("                  <div class=\"aa-telephone-no\">\n");
      out.write("                      <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b>\n");
      out.write("                    <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b>\n");
      out.write("                     <a href=\"logout\" >ÇIKIŞ YAP</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>              \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"aa-header-right\">\n");
      out.write("                  <a href=\"register.jsp\" class=\"aa-register\">KAYIT OL</a>\n");
      out.write("                  <a href=\"signin.jsp\" class=\"aa-login\">GİRİŞ YAP</a>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <!-- End header section -->\n");
      out.write("  <!-- Start menu section -->\n");
      out.write("  <section id=\"aa-menu-area\">\n");
      out.write("    <nav class=\"navbar navbar-default main-navbar\" role=\"navigation\">  \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <!-- LOGO -->                                               \n");
      out.write("          <!-- Text based logo -->\n");
      out.write("          <a class=\"navbar-brand aa-logo\" href=\"index.jsp\"> Ana Sayfa <span>Emlak</span></a>\n");
      out.write("          <!-- Image based logo -->\n");
      out.write("          <!-- <a class=\"navbar-brand aa-logo-img\" href=\"index.html\"><img src=\"img/logo.png\" alt=\"logo\"></a> -->                     \n");
      out.write("        </div>\n");
      out.write("               <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right aa-main-nav\">\n");
      out.write("            <li class=\"active\"><a href=\"index.jsp\">ANA SAYFA</a></li>\n");
      out.write("             <li class=\"dropdown\">\n");
      out.write("                <li><a href=\"properties.jsp\">EMLAK</a></li>                       \n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"gallery.jsp\">GALERİ</a></li>                                         \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <ul class=\"dropdown-menu\">                                       \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"contact.jsp\">İLETİŞİM</a></li>\n");
      out.write("           <li><a href=\"profile.jsp\">PROFİL</a></li>\n");
      out.write("          </ul>                            \n");
      out.write("        </div>       \n");
      out.write("      </div>          \n");
      out.write("    </nav> \n");
      out.write("  </section>\n");
      out.write("  <section id=\"aa-slider\">\n");
      out.write("    <div class=\"aa-slider-area\"> \n");
      out.write("      <!-- Top slider -->\n");
      out.write("     \n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- End menu section -->\n");
      out.write("\n");
      out.write("  <!-- Start Proerty header  -->\n");
      out.write("  <section id=\"aa-property-header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-property-header-inner\">\n");
      out.write("              \n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                     <form action=\"EmailSendingServlet\" method=\"post\">\n");
      out.write("        <table border=\"0\" width=\"35%\" align=\"center\">\n");
      out.write("            <caption><h2>Send New E-mail</h2></caption>\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"50%\">Recipient address </td>\n");
      out.write("                <td><input type=\"text\" name=\"recipient\" size=\"50\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Subject </td>\n");
      out.write("                <td><input type=\"text\" name=\"subject\" size=\"50\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Content </td>\n");
      out.write("                <td><textarea rows=\"10\" cols=\"39\" name=\"content\"></textarea> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Send\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("         \n");
      out.write("    </form>       \n");
      out.write("           \n");
      out.write("          </ol>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section> \n");
      out.write("  <!-- End Proerty header  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
