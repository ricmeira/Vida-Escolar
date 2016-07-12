<!DOCTYPE html>
<html lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Vida Escolar - Cadastro de Professores</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body class="teal">
  <div class="container">
    <br><br>
    <div class="row">

      <!-- TEXT -->
      <div class="col s12 m6">
        <h3 class="center white-text">Cadastro no Vida Escolar</h3>
        <br><br>
        <h5 class="center light white-text">Professores,</h5>
        <p class="light white-text">
          o Vida Escolar foi criado para que pais e responsáveis possam acompanhar mais de perto a vida escolar de seus filhos. Você, Professor, é uma peça fundamental nesse projeto. Contamos com a sua ajuda para melhorar ainda mais o ensino da rede pública de Fortaleza!
        </p>
      </div>

      <!-- FORM -->
      <form>
        <div class="col s12 m6">
          <div class="row">
            <div class="input-field col s12">
              <input id="teacher-name" type="text" required />
              <label for="teacher-name">Nome completo</label>
            </div>
            <div class="input-field col s12">
              <input id="teacher-cpf" type="text" required />
              <label for="teacher-cpf">CPF</label>
            </div>
            <div class="input-field col s12">
              <input id="teacher-password" type="password" required/>
              <label for="teacher-password">Senha para acesso ao Vida Escolar</label>
            </div>
            <div class="input-field col s12">
              <input id="teacher-email" type="text" required />
              <label for="teacher-email">Email</label>
            </div>
            <div class="col s12">
              <label>Disciplina</label>
              <select class="browser-default" required >
                <option value="" disabled selected>Selecione uma opção</option>
              </select>
            </div>
            <div class="col s12">
              <label>Escola</label>
              <select class="browser-default" required >
                <option value="" disabled selected>Selecione uma opção</option>
              </select>
            </div>
          </div>

          <!-- BUTTON -->
          <div class="row">
            <div class="col s12">
                <button type="submit" id="register-button" 
                class="btn right waves-effect waves-light">Realizar Cadastro</button>
              </div>
          </div>

        </div>
      </form>

    </div>
  </div>
  

  <!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/bin/materialize.js"></script>

  </body>
</html>
