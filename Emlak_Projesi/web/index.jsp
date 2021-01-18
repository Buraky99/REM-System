<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<html lang="tr">
  <head>
      
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>ANA SAYFA | EMLAK</title>
    
    <!-- Favicon -->
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">

    <!-- Font awesome -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">   
    <!-- slick slider -->
    <link rel="stylesheet" type="text/css" href="css/slick.css">
    <!-- price picker slider -->
    <link rel="stylesheet" type="text/css" href="css/nouislider.css">
    <!-- Fancybox slider -->
    <link rel="stylesheet" href="css/jquery.fancybox.css" type="text/css" media="screen" /> 
    <!-- Theme color -->
    <link id="switcher" href="css/theme-color/default-theme.css" rel="stylesheet">     

    <!-- Main style sheet -->
    <link href="css/style.css" rel="stylesheet">    

   
    <!-- Google Font -->
    <link href='https://fonts.googleapis.com/css?family=Vollkorn' rel='stylesheet' type='text/css'>    
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>
  <body class="aa-price-range">  
  <!-- Pre Loader -->
  <div id="aa-preloader-area">
    <div class="pulse"></div>
  </div>
  <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-angle-double-up"></i></a>
  <!-- END SCROLL TOP BUTTON -->

  <!-- Start header section -->
  <header id="aa-header">  
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-header-area">
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-6">
                <div class="aa-header-left">
                  <div class="aa-telephone-no">
                      <b>${user.fullname} ${user.email}</b>
                    <b>${admin.fullname} ${admin.email}</b>
                     <a href="logout" >ÇIKIŞ</a>
                  </div>
                </div>              
              </div>
              <div class="col-md-6 col-sm-6 col-xs-6">
                <div class="aa-header-right">
                  <a href="register.jsp" class="aa-register">KAYIT OL</a>
                  <a href="signin.jsp" class="aa-login">GİRİŞ YAP</a>
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
  <!-- End header section -->

  <!-- Start menu section -->
  <section id="aa-menu-area">
    <nav class="navbar navbar-default main-navbar" role="navigation">  
      <div class="container">
        <div class="navbar-header">
          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- LOGO -->                                               
          <!-- Text based logo -->
           <a class="navbar-brand aa-logo" href="index.jsp"> ANA SAYFA <span>EMLAK</span></a>
           <!-- Image based logo -->
           <!-- <a class="navbar-brand aa-logo-img" href="index.html"><img src="img/logo.png" alt="logo"></a> -->
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul id="top-menu" class="nav navbar-nav navbar-right aa-main-nav">
            <li class="active"><a href="index.jsp">ANA SAYFA</a></li>
             <li class="dropdown">
                <li><a href="list">EMLAK</a></li>                       
            </li>
            <li><a href="gallery.jsp">GALERİ</a></li>                                         
            <li class="dropdown">
              <ul class="dropdown-menu">                                       
              </ul>
            </li>
            <li><a href="contact.jsp">İLETİŞİM</a></li>
           <li><a href="profile.jsp">PROFİL</a></li>
          </ul>                            
        </div><!--/.nav-collapse -->       
      </div>          
    </nav> 
  </section>
  <!-- End menu section -->

  <!-- Start slider  -->
  <section id="aa-slider">
    <div class="aa-slider-area"> 
      <!-- Top slider -->
      <div class="aa-top-slider">
        <!-- Top slider single slide -->
        <div class="aa-top-slider-single">
          <img src="https://images4.alphacoders.com/829/thumb-1920-829688.jpg" alt="img">
          <!-- Top slider content -->
          <div class="aa-top-slider-content">
            <span class="aa-top-slider-catg">Dublex</span>
            <h2 class="aa-top-slider-title">300 Metrekare</h2>
            <p class="aa-top-slider-location"><i class="fa fa-map-marker"></i>Fethiye,Muğla</p>
            <span class="aa-top-slider-off">30% İndirim</span>
            <p class="aa-top-slider-price">2,300,000 TL</p>
            <a href="#" class="aa-top-slider-btn">Daha fazlası için <span class="fa fa-angle-double-right"></span></a>
          </div>
          <!-- / Top slider content -->
        </div>
        <!-- / Top slider single slide -->
        <!-- Top slider single slide -->
        <div class="aa-top-slider-single">
          <img src="https://cdn.wallpapersafari.com/27/74/XtkN6u.jpg" alt="img">
          <!-- Top slider content -->
          <div class="aa-top-slider-content">
            <span class="aa-top-slider-catg">Dublex</span>
            <h2 class="aa-top-slider-title">350 Metrekare</h2>
            <p class="aa-top-slider-location"><i class="fa fa-map-marker"></i>Kaş,Antalya (USA)</p>
            <span class="aa-top-slider-off">20% İndirim</span>
            <p class="aa-top-slider-price">2.700.000 TL</p>
            <a href="#" class="aa-top-slider-btn">Daha fazlası için <span class="fa fa-angle-double-right"></span></a>
          </div>
          <!-- / Top slider content -->
        </div>
        <!-- / Top slider single slide -->
        <!-- Top slider single slide -->
   
        <!-- / Top slider single slide -->       
         <!-- Top slider single slide -->
          <!-- / Top slider content -->
        </div>
        <!-- / Top slider single slide -->        
         <!-- Top slider single slide -->
       
         
          <!-- / Top slider content -->
    
        <!-- / Top slider single slide -->
         <!-- Top slider single slide -->
       
        <!-- / Top slider single slide -->
      </div>
    </div>
  </section>
  <!-- End slider  -->

  <!-- Advance Search -->
  <section id="aa-advance-search">
    <div class="container">
      <div class="aa-advance-search-area">
        <div class="form">
         <div class="aa-advance-search-top">
            <div class="row">
              <div class="col-md-6">
                <div class="aa-single-advance-search">
                  <input type="text" placeholder="Konumunuz">
                </div>
              </div>
              <div class="col-md-3">
                <div class="aa-single-advance-search">
                  <select>
                   <option value="0" selected>Kategori</option>
                    <option value="1">Daire</option>
                    <option value="2">Arazi</option>
                    <option value="3">Arsa</option>
                    <option value="4">Ticari</option>
                  </select>
                </div>
              </div>
             
         
              <div class="col-md-3">
                <div class="aa-single-advance-search">
                  <input class="aa-search-btn" type="submit" value="Ara">
                </div>
              </div>
            </div>
          </div>
         <div class="aa-advance-search-bottom">
           <div class="row">
            <div class="col-md-6">
              <div class="aa-single-filter-search">
                <span>ALAN (M2)</span>
                <span>:</span>
                <span id="skip-value-lower" class="example-val">30.00</span>
                <span>-</span>
                <span id="skip-value-upper" class="example-val">100.00</span>
                <div id="aa-sqrfeet-range" class="noUi-target noUi-ltr noUi-horizontal noUi-background">
                </div>                  
              </div>
            </div>
            <div class="col-md-6">
              <div class="aa-single-filter-search">
                <span>FİYAT (₺)</span>
                <span>:</span>
                <span id="skip-value-lower2" class="example-val">30.00</span>
                <span>-</span>
                <span id="skip-value-upper2" class="example-val">100.00</span>
                <div id="aa-price-range" class="noUi-target noUi-ltr noUi-horizontal noUi-background">
                </div>      
              </div>
            </div>
          </div>  
         </div>
        </div>
      </div>
    </div>
  </section>
  <!-- / Advance Search -->

  <!-- About us -->
  <section id="aa-about-us">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-about-us-area">
            <div class="row">
              <div class="col-md-5">
                <div class="aa-about-us-left">
                  <img src="https://www.auroraarch.com/wp-content/uploads/2019/05/IMG_2457-370x220.jpg" alt="image">
                </div>
              </div>
              <div class="col-md-7">
                <div class="aa-about-us-right">
                  <div class="aa-title">
                    <h2>HAKKIMIZDA</h2>
                    <span></span>
                  </div>
                  <p>Emlak sayfamız sizlerin kolayca ve rahatlıkla mülk almanıza ve satmanıza yardımcı olucaktır. Vakit kaybetmeden ve basit bir kullanımıyla dikkat çeken sayfamıza hoşgeldiniz</p>                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- / About us -->

  <!-- Latest property -->
  <section id="aa-latest-property">
    <div class="container">
      <div class="aa-latest-property-area">
        <div class="aa-title">
          <h2>Son Eklenenler</h2>
          <span></span>
                  
        </div>
        <div class="aa-latest-properties-content">
          <div class="row">
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/Lakeside-Cottage-2-850x650.jpg" />
                </a>
                <div class="aa-tag for-sale">
                  Satılık
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak Odası</span>
                    <span>2 Banyo</span>
                    <span>180 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Melih</a></h3>
                                   
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      600.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar İçin</a>
                  </div>
                </div>
              </article>
            </div>
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/Twin-Peaks-1-850x650.jpg" alt="img">
                </a>
                <div class="aa-tag for-rent">
                  Kiralık
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak odası</span>
                    <span>3 Banyo</span>
                    <span>180 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Ali</a></h3>
                                          
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      800.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar için</a>
                  </div>
                </div>
              </article>
            </div>
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/New-England-Sound-5-850x650.jpg" alt="img">
                </a>
                <div class="aa-tag sold-out">
                  Satıldı
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak Odası</span>
                    <span>3 Banyo</span>
                    <span>180 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Burak</a></h3>
                               
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      700.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar için</a>
                  </div>
                </div>
              </article>
            </div>
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/Morning-Star-4-550x730.jpg" alt="img">
                </a>
                <div class="aa-tag for-sale">
                  Satıldı
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak Odası</span>
                    <span>3 Banyo</span>
                    <span>210 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Mert</a></h3>                    
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      850.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar İçin</a>
                  </div>
                </div>
              </article>
            </div>
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/Cragburn-11-550x730.jpg" alt="img">
                </a>                
                <div class="aa-tag sold-out">
                  Satıldı
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak Odası</span>
                    <span>3 Banyo</span>
                    <span>185 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Ayşe</a></h3>
                                       
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      890.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar İçin</a>
                  </div>
                </div>
              </article>
            </div>
            <div class="col-md-4">
              <article class="aa-properties-item">
                <a href="#" class="aa-properties-item-img">
                  <img src="http://www.auroraarch.com/wp-content/uploads/2017/11/Cottage-on-the-Bluffs-5-550x730.jpg" alt="img">
                </a>
                <div class="aa-tag for-rent">
                  Kiralık
                </div>
                <div class="aa-properties-item-content">
                  <div class="aa-properties-info">
                    <span>5 Oda</span>
                    <span>2 Yatak Odası</span>
                    <span>3 Banyo</span>
                    <span>215 Metrekare</span>
                  </div>
                  <div class="aa-properties-about">
                    <h3><a href="#">Leyla</a></h3>
                                        
                  </div>
                  <div class="aa-properties-detial">
                    <span class="aa-price">
                      1.000.000 TL
                    </span>
                    <a href="#" class="aa-secondary-btn">Detaylar İçin</a>
                  </div>
                </div>
              </article>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- / Latest property -->



  <!-- Footer -->
  <footer id="aa-footer">
 
  </footer>
  <!-- / Footer -->

 
  
  <!-- jQuery library -->
  <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
  <script src="js/jquery.min.js"></script>   
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.js"></script>   
  <!-- slick slider -->
  <script type="text/javascript" src="js/slick.js"></script>
  <!-- Price picker slider -->
  <script type="text/javascript" src="js/nouislider.js"></script>
   <!-- mixit slider -->
  <script type="text/javascript" src="js/jquery.mixitup.js"></script>
  <!-- Add fancyBox -->        
  <script type="text/javascript" src="js/jquery.fancybox.pack.js"></script>
  <!-- Custom js -->
  <script src="js/custom.js"></script> 

  </body>
</html>