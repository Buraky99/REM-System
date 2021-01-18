package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public final class properties_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
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
      out.write("    <title>ANA SAYFA | EMLAK</title>\n");
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
      out.write("  \n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body class=\"aa-price-range\">   \n");
      out.write("  <!-- Pre Loader -->\n");
      out.write("  <div id=\"aa-preloader-area\">\n");
      out.write("    <div class=\"pulse\"></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("  <!-- END SCROLL TOP BUTTON -->\n");
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
      out.write("                  <div class=\"aa-telephone-no\">          \n");
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
      out.write("             <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right aa-main-nav\">\n");
      out.write("            <li><a href=\"index.jsp\">ANA SAYFA</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"properties.jsp\">EMLAK</a></li>     \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"gallery.jsp\">GALERİ</a></li>                                         \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <ul class=\"dropdown-menu\">                                       \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"contact.jsp\">İLETİŞİM</a></li>\n");
      out.write("           <li><a href=\"profile.jsp\">PROFİL</a></li>\n");
      out.write("          </ul>                            \n");
      out.write("        </div>      \n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      </div>          \n");
      out.write("    </nav> \n");
      out.write("  </section> \n");
      out.write("      <!-- Top slider -->\n");
      out.write(" <section id=\"aa-slider\">\n");
      out.write("    <div class=\"aa-slider-area\"> \n");
      out.write("      <!-- Top slider -->\n");
      out.write("      <div class=\"aa-top-slider\">\n");
      out.write("        <!-- Top slider single slide -->\n");
      out.write("        <div class=\"aa-top-slider-single\">\n");
      out.write("          <img src=\"https://images4.alphacoders.com/829/thumb-1920-829688.jpg\" alt=\"img\">\n");
      out.write("          <!-- Top slider content -->\n");
      out.write("          <div class=\"aa-top-slider-content\">\n");
      out.write("            <span class=\"aa-top-slider-catg\">Dublex</span>\n");
      out.write("            <h2 class=\"aa-top-slider-title\">300 Metrekare</h2>\n");
      out.write("            <p class=\"aa-top-slider-location\"><i class=\"fa fa-map-marker\"></i>Fethiye,Muğla</p>\n");
      out.write("            <span class=\"aa-top-slider-off\">30% İndirim</span>\n");
      out.write("            <p class=\"aa-top-slider-price\">2,300,000 TL</p>\n");
      out.write("            <a href=\"#\" class=\"aa-top-slider-btn\">Daha fazlası için <span class=\"fa fa-angle-double-right\"></span></a>\n");
      out.write("          </div>\n");
      out.write("          <!-- / Top slider content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("        <!-- Top slider single slide -->\n");
      out.write("        <div class=\"aa-top-slider-single\">\n");
      out.write("          <img src=\"https://cdn.wallpapersafari.com/27/74/XtkN6u.jpg\" alt=\"img\">\n");
      out.write("          <!-- Top slider content -->\n");
      out.write("          <div class=\"aa-top-slider-content\">\n");
      out.write("            <span class=\"aa-top-slider-catg\">Dublex</span>\n");
      out.write("            <h2 class=\"aa-top-slider-title\">350 Metrekare</h2>\n");
      out.write("            <p class=\"aa-top-slider-location\"><i class=\"fa fa-map-marker\"></i>Kaş,Antalya (USA)</p>\n");
      out.write("            <span class=\"aa-top-slider-off\">20% İndirim</span>\n");
      out.write("            <p class=\"aa-top-slider-price\">2.700.000 TL</p>\n");
      out.write("            <a href=\"#\" class=\"aa-top-slider-btn\">Daha fazlası için <span class=\"fa fa-angle-double-right\"></span></a>\n");
      out.write("          </div>\n");
      out.write("          <!-- / Top slider content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("        <!-- Top slider single slide -->\n");
      out.write("   \n");
      out.write("        <!-- / Top slider single slide -->       \n");
      out.write("         <!-- Top slider single slide -->\n");
      out.write("          <!-- / Top slider content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- / Top slider single slide -->        \n");
      out.write("         <!-- Top slider single slide -->\n");
      out.write("       \n");
      out.write("         \n");
      out.write("          <!-- / Top slider content -->\n");
      out.write("    \n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("         <!-- Top slider single slide -->\n");
      out.write("       \n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("         \n");
      out.write("          <!-- / Top slider content -->\n");
      out.write("    \n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("         <!-- Top slider single slide -->\n");
      out.write("       \n");
      out.write("        <!-- / Top slider single slide -->\n");
      out.write("  \n");
      out.write("  <!-- End menu section -->\n");
      out.write("\n");
      out.write("  <!-- Start Proerty header  -->\n");
      out.write("\n");
      out.write("  <section id=\"aa-property-header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-property-header-inner\">\n");
      out.write("            <h2>EMLAK SAYFASI</h2>\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"#\">ANA SAYFA</a></li>            \n");
      out.write("            <li class=\"active\">EMLAK</li>\n");
      out.write("          </ol>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section> \n");
      out.write("  <!-- End Proerty header  -->\n");
      out.write("\n");
      out.write("  <!-- Start Properties  -->\n");
      out.write("  <section id=\"aa-properties\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("          <div class=\"aa-properties-content\">\n");
      out.write("            <!-- start properties content head -->\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"aa-latest-property-area\">\n");
      out.write(" \n");
      out.write("                  \n");
      out.write("        </div>\n");
      out.write("        <div class=\"aa-latest-properties-content\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/Lakeside-Cottage-2-850x650.jpg\" />\n");
      out.write("                </a>\n");
      out.write("                <div class=\"aa-tag for-sale\">\n");
      out.write("                  Satılık\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak Odası</span>\n");
      out.write("                    <span>2 Banyo</span>\n");
      out.write("                    <span>180 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Melih</a></h3>\n");
      out.write("                                   \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      600.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar İçin</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/Twin-Peaks-1-850x650.jpg\" alt=\"img\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"aa-tag for-rent\">\n");
      out.write("                  Kiralık\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak odası</span>\n");
      out.write("                    <span>3 Banyo</span>\n");
      out.write("                    <span>180 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Ali</a></h3>\n");
      out.write("                                          \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      800.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar için</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/New-England-Sound-5-850x650.jpg\" alt=\"img\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"aa-tag sold-out\">\n");
      out.write("                  Satıldı\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak Odası</span>\n");
      out.write("                    <span>3 Banyo</span>\n");
      out.write("                    <span>180 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Burak</a></h3>\n");
      out.write("                               \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      700.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar için</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/Morning-Star-4-550x730.jpg\" alt=\"img\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"aa-tag for-sale\">\n");
      out.write("                  Satıldı\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak Odası</span>\n");
      out.write("                    <span>3 Banyo</span>\n");
      out.write("                    <span>210 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Mert</a></h3>                    \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      850.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar İçin</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/Cragburn-11-550x730.jpg\" alt=\"img\">\n");
      out.write("                </a>                \n");
      out.write("                <div class=\"aa-tag sold-out\">\n");
      out.write("                  Satıldı\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak Odası</span>\n");
      out.write("                    <span>3 Banyo</span>\n");
      out.write("                    <span>185 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Ayşe</a></h3>\n");
      out.write("                                       \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      890.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar İçin</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <article class=\"aa-properties-item\">\n");
      out.write("                <a href=\"#\" class=\"aa-properties-item-img\">\n");
      out.write("                  <img src=\"http://www.auroraarch.com/wp-content/uploads/2017/11/Cottage-on-the-Bluffs-5-550x730.jpg\" alt=\"img\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"aa-tag for-rent\">\n");
      out.write("                  Kiralık\n");
      out.write("                </div>\n");
      out.write("                <div class=\"aa-properties-item-content\">\n");
      out.write("                  <div class=\"aa-properties-info\">\n");
      out.write("                    <span>5 Oda</span>\n");
      out.write("                    <span>2 Yatak Odası</span>\n");
      out.write("                    <span>3 Banyo</span>\n");
      out.write("                    <span>215 Metrekare</span>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-about\">\n");
      out.write("                    <h3><a href=\"#\">Leyla</a></h3>\n");
      out.write("                                        \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-properties-detial\">\n");
      out.write("                    <span class=\"aa-price\">\n");
      out.write("                      1.000.000 TL\n");
      out.write("                    </span>\n");
      out.write("                    <a href=\"#\" class=\"aa-secondary-btn\">Detaylar İçin</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- / Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
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
      out.write("\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("emlak");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listEmlak}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr style=\"background-color:buttonhighlight\">\n");
          out.write("                    <td style=\"background-color:burlywood\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    \n");
          out.write("                    <td style=\"background-color:burlywood\">\n");
          out.write("                    \t<a style=\"background-color:goldenrod\" href=\"edit1?id=");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Yönet</a>\n");
          out.write("                    \t&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("                    \t<a style=\"background-color:goldenrod\" href=\"delete1?id=");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Sil</a>                    \t\n");
          out.write("                    </td>\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.il}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.ilce}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.fiyat}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.ozellik}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emlak.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }
}
