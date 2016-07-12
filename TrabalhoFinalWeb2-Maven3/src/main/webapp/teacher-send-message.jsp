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
		    				<li class="collection-item active orange accent-2"><a href="#">Enviar Mensagem</a></li>
		    				<li class="collection-item"><a href="#">Mensagens Enviadas</a></li>
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
      <h3 class="light">Enviar Mensagem</h3>
      <div class="row">

        <!-- SEARCH -->
        <div class="input-field col s12">
          <input id="search" placeholder="Pesquisar: digite o nome do aluno" autofocus type="text">
          <i class="prefix material-icons">search</i>
        </div>

        <!-- STUDENTS LIST -->
        <div class="col s12">
          <ul class="collapsible" data-collapsible="accordion">
            <li>
              <div class="collapsible-header"><b>Turma 1</b></div>
              <div class="collapsible-body">
                <ul class="collection">
                  <li class="collection-item">
                    Huguinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <div class="collapsible-header"><b>Turma 2</b></div>
              <div class="collapsible-body">
                <ul class="collection">
                  <li class="collection-item">
                    Huguinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <div class="collapsible-header"><b>Turma 3</b></div>
              <div class="collapsible-body">
                <ul class="collection">
                  <li class="collection-item">
                    Huguinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a class="modal-trigger" href="#modal-send-message" title="escrever mensagem"><i class="material-icons">message</i></a>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
          </ul>
        </div>
        <!-- END STUDENTS LIST -->

      </div>
    </div>
  </main>

  <!-- MODALS -->

  <!-- MODAL SEND MESSAGE -->
  <div id="modal-send-message" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Enviar Mensagem</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <input value="[Nome do Aluno]" id="student-name" type="text" disabled />
          	<label for="student-name" class="active">Aluno</label>
          </div>
          <div class="input-field col s12">
		        <textarea id="textarea-message" class="materialize-textarea"></textarea>
		        <label for="textarea-message">Mensagem</label>
	        </div>
        </div>
        <div class="row">
          <div class="col s12">
            <button type="submit" class="modal-action modal-close waves-effect waves-light btn right">Enviar<i class="material-icons right">send</i></button>
          </div>
        </div>
      </form>
    </div>
  </div>

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

      $('.datepicker').pickadate({
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 25, // Creates a dropdown of 15 years to control year
        max: 'now',
        today: false,
        clear: 'Cancelar',
        close: 'Selecionar'
      });

    });
  </script>


  </body>
</html>
