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
    <title>GALERİ | EMLAK</title>
    
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
                     <a href="logout" >ÇIKIŞ YAP</a>
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
           <a class="navbar-brand aa-logo" href="index.jsp"> Ana Sayfa <span>Emlak</span></a>
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
  <section id="aa-slider">
    <div class="aa-slider-area"> 
      <!-- Top slider -->
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
      </div>
    </div>
  </section>
  <!-- End menu section -->

  <!-- Start Proerty header  -->

  <section id="aa-property-header">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-property-header-inner">
            <h2>Gallery</h2>
            <ol class="breadcrumb">
            <li><a href="#">HOME</a></li>            
            <li class="active">Gallery</li>
          </ol>
          </div>
        </div>
      </div>
    </div>
  </section> 
  <!-- End Proerty header  -->

  <section id="aa-gallery">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-gallery-area">
            <div class="aa-title">
              <h2>Gallery View</h2>
              <span></span>
               <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Excepturi commodi eum dolorem aut eos, debitis quaerat reiciendis, officiis consectetur ducimus atque suscipit ab at tempora!</p>
            </div>
            <!-- Start gallery -->
            <div class="aa-gallery-content">
              <div class="aa-gallery-top">
                <!-- Start gallery menu -->
                <ul>
                  <li data-filter="all" class="filter active">All</li>
                  <li data-filter=".apartment" class="filter">Apartment</li>
                  <li data-filter=".livingroom" class="filter">Living Room</li>
                  <li data-filter=".bedroom" class="filter">Bedroom</li>
                  <li data-filter=".kitchen" class="filter">Kitchen</li>
                  <li data-filter=".garage" class="filter">Garage</li>
                </ul>
              </div>
              <!-- Start gallery image -->
              <div id="mixit-container" class="aa-gallery-body">
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix apartment">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/1.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/1.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>                  
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix garage">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/2.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/2.jpg"><span class="fa fa-eye"></span></a>
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>                  

                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix livingroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/3.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/3.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix bedroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/4.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/4.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix apartment">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/5.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/5.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix livingroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/6.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/6.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix apartment">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/7.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/7.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>                  
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix garage">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/8.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/8.jpg"><span class="fa fa-eye"></span></a>
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>                  

                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix livingroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/9.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/9.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix bedroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/10.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/10.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix kitchen">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/11.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/11.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
                <!-- start single gallery image -->
                <div class="aa-single-gallery mix livingroom">                  
                  <div class="aa-single-gallery-item">
                    <div class="aa-single-gallery-img">
                      <a href="#"><img src="img/gallery/small/12.jpg" alt="img"></a>
                    </div>
                    <div class="aa-single-gallery-info">
                      <a class="fancybox" data-fancybox-group="gallery" href="img/gallery/big/12.jpg"><span class="fa fa-eye">
                      <a class="aa-link" href="#"><span class="fa fa-link"></span></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>


  
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