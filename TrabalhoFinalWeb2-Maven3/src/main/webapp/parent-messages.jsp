<!DOCTYPE html
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Vida Escolar - Professor</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>

  <header>
    <nav>
	<div class="nav-wrapper teal">
            <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
            <a href="#" class="brand-logo center">Vida Escolar</a>
	</div>
    </nav>
    <ul id="mobile-demo" class="side-nav fixed teal">
      <div class="card">
        <div class="card-content center">
          <span class="card-title">Dona Florinda</span>
          <p>Pai/Respons�vel</p>
        </div>
      </div>
      <li>
      <li class="active orange accent-2"><a href="#" class="white-text">Mensagens</a></li>
      <li><a href="#" class="white-text">Dados Pessoais</a></li>
      <li><a href="#" class="white-text">Sair</a></li>
      <s:form name="registerForm" action="registerParent">
            <s:submit value="Sair" name="Sair" class="btn right waves-effect waves-light"></s:submit> 
      </s:form>  
    </ul>
  </header>

  <main>
    <div class="container">
      <h3 class="light">Mensagens Recebidas</h3>
      <div class="row">

        <!-- SEARCH -->
        <div class="input-field col s12">
          <input id="search" placeholder="Pesquisar" autofocus type="text">
          <i class="prefix material-icons">search</i>
        </div>

        <!-- MESSAGES LIST -->
        <div class="col s12">
          <ul class="collapsible" data-collapsible="accordion">
            <li>
              <div class="collapsible-header">
              	<div class="row">
              	<div class="col s3">
              		<b>Prof. Girafales</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[In�cio do conte�do da mensag...]</span>
            		</div>
              	<div class="col s3">	
              		<span class="right">27/06/2016 16:43</span>
            		</div>
            		</div>
            	</div>
              <div class="collapsible-body">
                <p class="light">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
              </div>
            </li>
            <li>
              <div class="collapsible-header">
              	<div class="row">
              	<div class="col s3">
              		<b>Prof. Kurt G�del</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[In�cio do conte�do da mensag...]</span>
            		</div>
              	<div class="col s3">	
              		<span class="right">26/06/2016 16:43</span>
            		</div>
            		</div>
            	</div>
              <div class="collapsible-body">
                <p class="light">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
              </div>
            </li>
            <li>
              <div class="collapsible-header">
              	<div class="row">
              	<div class="col s3">
              		<b>Prof. Rachel de Queiroz</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[In�cio do conte�do da mensag...]</span>
            		</div>
              	<div class="col s3">	
              		<span class="right">25/06/2016 16:43</span>
            		</div>
            		</div>
            	</div>
              <div class="collapsible-body">
                <p class="light">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
              </div>
            </li>
          </ul>
        </div>
        <!-- END STUDENTS LIST -->

      </div>
    </div>
  </main>


  <!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/bin/materialize.js"></script>
  <script type="text/javascript">
    $( document ).ready(function(){
    
      $(".button-collapse").sideNav();
      
    });
  </script>


  </body>
</html>
