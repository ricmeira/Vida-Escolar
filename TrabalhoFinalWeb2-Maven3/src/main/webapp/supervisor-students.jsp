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
          <span class="card-title">Fulano</span>
          <p>Coordenador</p>
        </div>
      </div>
      <li class="active orange accent-2"><a href="#" class="white-text">Alunos</a></li>
      <li>
        <s:url action="toClassesSupervisor" var="urlTag"></s:url>
        <a href="<s:property value="#urlTag" />" class="white-text" >Turmas</a>
      </li>
      <li><a href="#" class="white-text">Dados Pessoais</a></li>
      <li>
          <s:url action="logoutSupervisor" var="urlSairTag"></s:url>
          <a href="<s:property value="#urlSairTag" />" class="white-text" >Sair</a>
      </li>

    </ul>
  </header>

  <main>
    <div class="container">
      <h3 class="light">Alunos</h3>
      <div class="row">

        <!-- ADD NEW STUDENT BUTTON-->
        <div class="input-field col s12 center">
          <a class="waves-effect waves-light btn modal-trigger" href="#modal-add-student">
            <i class="material-icons right">add</i>
            Cadastrar novo Aluno
          </a>
        </div>

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
                      <a class="modal-trigger" href="#modal-edit-student" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a class="modal-trigger" href="#modal-remove-student" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
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
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
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
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Zezinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
                    </div>
                  </li>
                  <li class="collection-item">
                    Luizinho da Silva
                    <div class="secondary-content">
                      <a href="#!" title="editar"><i class="material-icons">edit</i></a>
                      &nbsp;&nbsp;
                      <a href="#!" title="excluir"><i class="material-icons">close</i></a>
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

  <!-- MODAL ADD STUDENT -->
  <div id="modal-add-student" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Cadastrar novo Aluno</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <input id="student-name" type="text" required />
            <label for="student-name">Nome</label>
          </div>
          <div class="input-field col s12">
            <input id="student-birthdate" type="date" class="datepicker" required />
            <label for="student-birthdate" class="active">Data de Nascimento</label>
          </div>
          <div class="col s12">
            <label>Turma</label>
            <select id="student-class" class="browser-default" required>
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

  <!-- MODAL EDIT STUDENT -->
  <div id="modal-edit-student" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Editar dados do Aluno</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <input id="edit-student-name" type="text" />
            <label for="edit-student-name" class="active">Nome</label>
          </div>
          <div class="input-field col s12">
            <input id="edit-student-birthdate" type="date" class="datepicker" />
            <label for="edit-student-birthdate" class="active">Data de Nascimento</label>
          </div>
          <div class="col s12">
            <label>Turma</label>
            <select id="edit-student-class" class="browser-default" >
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

  <!-- MODAL REMOVE STUDENT -->
  <div id="modal-remove-student" class="modal">
    <div class="modal-content">
      <a href="#!" class="modal-action modal-close black-text right" title="fechar"><i class="material-icons">close</i></a>
      <h4 class="light">Excluir Aluno</h4>
      <form>
        <div class="row">
          <div class="input-field col s12">
            <p>Tem certeza que deseja exluir o aluno [nome do aluno]?</p>
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
