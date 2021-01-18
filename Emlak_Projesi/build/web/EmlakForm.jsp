
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
    <title>PROFİL | EMLAK</title>

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
 
      <!-- Top slider -->
     
        <!-- / Top slider single slide -->
      </div>
    </div>
  </section>
  <!-- End menu section -->

  <section id="aa-property-header">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
              <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-property-header-inner">
            <ol class="breadcrumb">
          <div class="aa-property-header-inner">
                     <div align="center">
		<c:if test="${emlak != null}">
			<form action="update1" method="post">
        </c:if>
        <c:if test="${emlak == null}">
			<form action="insert1" method="post">
        </c:if>
        <table border="1" cellpadding="5">
          
        		<c:if test="${emlak != null}">
        			<input type="hidden" name="id" value="<c:out value='${emlak.id}' />" />
        		</c:if>     
            <tr>
                <th style="color:white"> IL: <br></br></th>
                <td>
                	<input type="text" name="il" size="45"
                			value="<c:out value='${emlak.il}' />"
                		/> <br></br>
                </td>
            </tr>
            <tr>
                <th style="color:white"> ILCE: <br></br></th>
                <td>
                	 <input  type="text" name="ilce" size="45" 
                			value="<c:out value='${emlak.ilce}' />"
                	/> <br></br>
                </td>
            </tr>
            <tr>
                <th style="color:white"> FIYAT: <br></br></th>
                <td>
                	<input type="text" name="fiyat" size="45"
                			value="<c:out value='${emlak.fiyat}' />"
                	/> <br></br>
                </td>
            </tr>
             <tr>
                <th style="color:white"> OZELLIK: <br></br></th>
                <td>
                	<input type="text" name="ozellik" size="45"
                			value="<c:out value='${emlak.ozellik}' />"
                	/> <br></br>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
    
    </div>	
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-property-header-inner">
        
            <ol class="breadcrumb">
                        
           
          </ol>
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