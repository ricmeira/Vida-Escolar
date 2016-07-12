<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Vida Escolar - Cadastro de Pais e Responsáveis</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body class="teal darken-1">
  <div class="container">
  <br><br>
    <div class="row">

      <!-- TEXT -->
      <div class="col s12 m6">
        <h3 class="center white-text">Cadastro no Vida Escolar</h3>
        <br><br>
        <h5 class="center light white-text">Pais e Responsáveis,</h5>
        <p class="light white-text">
          acompanhar a vida escolar do seu filho é de extrema importância 
          para ele e para nós. Contamos com a sua ajuda para melhorar o ensino da rede
          pública de Fortaleza!
        </p>
      </div>
        <!-- Struts FORM -->
        <s:form name="registerForm" action="registerParent">
            <div class="col s12 m6">
                <div class="row">
                    <div class="input-field col s12">
                        <s:textfield name="name" id="parent_name"></s:textfield>
                        <label for="parent_name">Nome Completo</label>
                    </div>
                    <div class="input-field col s12">
                        <s:textfield name="CPF" id="parent_cpf"></s:textfield>
                        <label for="parent_cpf">CPF</label>
                    </div>
                    <div class="input-field col s12">
                        <s:password name="Senha" id="parent_password"></s:password>
                        <label for="parent_password">Senha para acesso ao Vida Escolar</label>
                    </div>
                    <div class="input-field col s12">
                        <s:textfield name="email" id="parent_email"></s:textfield>
                        <label for="parent_email">Email</label>
                    </div>
                    <div class="input-field col s12">
                        <s:textfield name="address" id="parent_address"></s:textfield>
                        <label for="parent_address">Endereço</label>
                    </div>
                    <div class="input-field col s4">
                        <s:textfield name="number" id="parent_number"></s:textfield>
                        <label for="parent_number">Numero</label>
                    </div>
                    <div class="input-field col s8">
                        <s:textfield name="student" id="parent_student"></s:textfield>
                        <label for="parent_student">Nome completo do aluno</label>
                    </div>
                    <div class="input-field col s12">
                        <s:textfield name="cep" id="parent_cep"></s:textfield>
                        <label for="parent_cep">CEP</label>
                    </div>
                    <div class="input-field col s12">
                        <s:textfield name="birthday" id="parent_birthday" class="datepicker" type="date" required="true" placeholder="Data de Nascimento do aluno"></s:textfield>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <s:submit value="Realizar Cadastro" name="Realizar Cadastro" class="btn right waves-effect waves-light"></s:submit> 
                    </div>
                </div>
            </div>
        </s:form>   

    </div>
  </div>

  <!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/bin/materialize.js"></script>
  <script type="text/javascript">
    $( document ).ready(function(){

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
