<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Vida Escolar - Coordenador</title>

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
            <span class="card-title"><s:param name="CPF"/></span>
          <p>Coordenador</p>
        </div>
      </div>
      <li><a href="#" class="white-text">Alunos</a></li>
      <li class="active orange accent-2"><a href="#" class="white-text">Turmas</a></li>
      <li><a href="#" class="white-text">Dados Pessoais</a></li>
      <li><a href="#" class="white-text">Sair</a></li>
    </ul>
  </header>

  <main>
    <div class="container">
      <h3 class="light">Turmas</h3>
      <div class="row">

        <!-- ADD NEW CLASS BUTTON-->
        <div class="input-field col s12 center">
          <a class="waves-effect waves-light btn modal-trigger" href="#modal-add-class">
            <i class="material-icons right">add</i>
            Cadastrar nova Turma
          </a>
        </div>

        <!-- SEARCH -->
        <div class="input-field col s12">
          <input id="search" placeholder="Pesquisar: digite o nome da turma" autofocus type="text">
          <i class="prefix material-icons">search</i>
        </div>

        <!-- CLASSES LIST -->
        <div class="col s12">
          <ul class="collection">
            <li class="collection-item">
              Turma 1
              <div class="secondary-content">
                <a class="modal-trigger" href="#modal-edit-class" title="editar"><i class="material-icons">edit</i></a>
                &nbsp;&nbsp;
                <a class="modal-trigger" href="#modal-remove-class" title="excluir"><i class="material-icons">close</i></a>
              </div>
            </li>
            <li class="collection-item">
              Turma 2
              <div class="secondary-content">
                <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                &nbsp;&nbsp;
                <a href="#!" title="excluir"><i class="material-icons">close</i></a>
              </div>
            </li>
            <li class="collection-item">
              Turma 3
              <div class="secondary-content">
                <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                &nbsp;&nbsp;
                <a href="#!" title="excluir"><i class="material-icons">close</i></a>
              </div>
            </li>
          </ul>
        </div>
        <!-- END CLASSES LIST -->

      </div>
    </div>
  </main>

  <!-- MODALS -->

  <!-- MODAL ADD CLASS -->
  <div id="modal-add-class" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Cadastrar nova Turma</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <input id="class-name" type="text" required />
            <label for="class-name">Nome</label>
          </div>
          <div class="col s12">
            <label>Série</label>
            <select id="class-grade" class="browser-default" required>
              <option value="" disabled selected>Escolha uma opção</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col s12">
            <button type="submit" class="modal-action modal-close waves-effect waves-light btn right">Cadastrar</button>
          </div>
        </div>
      </form>
    </div>
  </div>

  <!-- MODAL EDIT CLASS -->
  <div id="modal-edit-class" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Editar dados da Turma</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <input id="edit-class-name" type="text" />
            <label for="edit-class-name" class="active">Nome</label>
          </div>
          <div class="col s12">
            <label>Série</label>
            <select id="edit-class-grade" class="browser-default" >
              <option value="" disabled selected>Escolha uma opção</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col s12">
            <button type="submit" class="modal-action modal-close waves-effect waves-light btn right">Salvar</button>
          </div>
        </div>
      </form>
    </div>
  </div>

  <!-- MODAL REMOVE CLASS -->
  <div id="modal-remove-class" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Excluir Turma</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <p>Tem certeza que deseja exluir a turma [nome da turma]?</p>
          </div>
        </div>
        <div class="row">
          <div class="col s12">
            <button type="submit" class="modal-action modal-close waves-effect waves-light btn right">Excluir</button>
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

    });
  </script>


  </body>
</html>
