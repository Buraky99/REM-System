<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="tr">
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>İLETİŞİM | EMLAK</title>

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
  <body>

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
        </div>       
      </div>          
    </nav> 
  </section>
 
  <!-- End menu section -->
  <section id="aa-property-header">

    <div class="container">
      <div class="row">
        <div class="col-md-12">
  
          <div class="aa-property-header-inner">
          <h2>İLETİŞİM</h2>

          </div>
        </div>
      </div>
    </div>
  </section> 
  <!-- Start Proerty header  -->
   
  <section id="aa-property-header">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-property-header-inner">
              <footer id="aa-footer">
               <form action="EmailSendingServlet" method="post"> 
        <table border="0" width="35%" align="center">
            <caption><h2>Emailimiz ile iletişime geçebilirsiniz.</h2><br></br></caption>
            <tr>
            <td width="50%" style="color:white">EMAİL </td>
                <td><input type="hidden" name="recipient" size="50" value="burakkocatepe183@hotmail.com"/></td>
            </tr>
            <tr>
                <td style="color:white">BAŞLIK </td>
                <td><input type="text" name="subject" size="50"/></td>
            </tr>
            <tr>
                <td style="color:white">KONU </td>
                <td><textarea rows="10" cols="39" name="content"></textarea> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="GÖNDER"/></td>
            </tr>
        </table>
    </form>  
            <ol class="breadcrumb">
                        
           
          </ol>
           </footer>
          </div>
        </div>
      </div>
    </div>
  </section> 
       
  <!-- End Proerty header  -->





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