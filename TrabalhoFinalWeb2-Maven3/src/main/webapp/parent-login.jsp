<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Vida Escolar - Entrar</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body class="teal darken-1">
  <div class="container">
    <br><br>
    <h1 class="header center white-text">Vida Escolar</h1>
    <div class="row center">
      <h5 class="header col s12 light white-text">Pai ou responsável, seja bem-vindo!</h5>
    </div>

    <div class="row center">
        <s:form name="loginForm" action="loginParent">
            <div class="input-field col s12 m4 offset-m4">
                <s:textfield name="CPF" placeholder="CPF"></s:textfield>
            </div>
            <div class="input-field col s12 m4 offset-m4">
                <s:password name="Senha" placeholder="Senha"></s:password>
            </div>
            <div class="col s12 m4 offset-m4">
                <s:submit value="Entrar" name="Entrar" class="btn waves-effect waves-light orange accent-3"></s:submit> 
            </div>
        </s:form>        
    </div>
    
    <div class="col s12 m4 offset-m4  right-align">
        <a href="parent-registration.jsp" id="forget-password" class="white-text">Esqueceu sua senha?</a>
    </div>
    <br><br>
    <div class="col s12 center">
      <a href="parent-registration.jsp" id="register" class="white-text">Cadastre-se</a>
    </div>

  </div>

  <!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/materialize.js"></script>
  <!--<script src="js/init.js"></script> -->

  </body>
</html>

