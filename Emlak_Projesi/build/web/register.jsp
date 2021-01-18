<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="tr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>KAYIT OL | EMLAK</title>

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
  <section id="aa-signin">
   <div align="center">
       <c:if test="${user == null}">
			<form action="insert" method="post">
        </c:if>
                            <c:if test="${user != null}">
        			<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        		</c:if> 
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-signin-area">
            <div class="aa-signin-form">
              <div class="aa-signin-form-title">
                <a class="aa-property-home" href="index.jsp">Property Home</a>
                <h4>Create your account and Stay with us</h4>
              </div>
              <form class="contactform">                                                 
                <div class="aa-single-field">
                  <label for="name">Name <span class="required">*</span></label>
                  <td>
                	<input type="text" name="fullname" size="5"
                			value="<c:out value='${user.fullname}' />"
                	/>
                </td>
                </div>
                <div class="aa-single-field">
                  <label for="email">Email <span class="required">*</span></label>
                  
                  <td>
                	<input type="text" name="email" size="45"
                			value="<c:out value='${user.email}' />"
                		/>
                </td>
                </div>
                <div class="aa-single-field">
                  <label for="password">Password <span class="required">*</span></label>
                   <td>
                	<input type="text" name="password" size="45"
                			value="<c:out value='${user.password}' />"
                	/>
                </td>
                </div>
                <div class="aa-single-submit">
                  <td colspan="2" align="center">
            		<input type="submit" href="x.jsp" value="Save" />
            	</td>                   
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
                        </div>
  </section> 


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