<!DOCTYPE html>
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
          <span class="card-title">Girafales</span>
          <p>Professor</p>
        </div>
      </div>
      <li>
      	<ul class="collapsible" data-collapsible="accordion">
      		<li>
      			<div class="collapsible-header active">
      				<span class="white-text">Mensagens</span>
      			</div>
      			<div class="collapsible-body">
		    			<ul class="collection">
		    				<li class="collection-item"><a href="#">Enviar Mensagem</a></li>
		    				<li class="collection-item active orange accent-2"><a href="#">Mensagens Enviadas</a></li>
		    			</ul>
      			</div>
    			</li>
      	</ul>
      </li>
      <li><a href="#" class="white-text">Gerenciar Turmas</a></li>
      <li><a href="#" class="white-text">Dados Pessoais</a></li>
      <li><a href="#" class="white-text">Sair</a></li>
    </ul>
  </header>

  <main>
    <div class="container">
      <h3 class="light">Mensagens Enviadas</h3>
      <div class="row">

        <!-- SEARCH -->
        <div class="input-field col s12">
          <input id="search" placeholder="Pesquisar: digite o nome do aluno" autofocus type="text">
          <i class="prefix material-icons">search</i>
        </div>

        <!-- MESSAGES LIST -->
        <div class="col s12">
          <ul class="collapsible" data-collapsible="accordion">
            <li>
              <div class="collapsible-header">
              	<div class="row">
              	<div class="col s3">
              		<b>Huguinho da Silva</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[Início do conteúdo da mensag...]</span>
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
              		<b>Zezinho da Silva</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[Início do conteúdo da mensag...]</span>
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
              		<b>Luizinho da Silva</b>
              	</div>
              	<div class="col s6">
              		<span class="light">[Início do conteúdo da mensag...]</span>
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

      // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
      $('.modal-trigger').leanModal({
        dismissible: false
      });

    });
  </script>


  </body>
</html>
