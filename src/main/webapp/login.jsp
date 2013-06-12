<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jqueryui="true" jquerytheme="redmond" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="jquery/jquery-1.10.0.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>

<title>Login Page</title>
</head>
<body>
	<br>
	<h4>Bienvenido al sistema de inventario</h4>
	<br>
	<form id="frmLogin" class="form-horizontal" action="login" method="post">
		<div class="control-group">
			<label class="control-label" for="usuario">Usuario</label>
			<div class="controls">
				<input type="text" name="usuario" id="usuario" placeholder="Escribe tu usuario">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password">Password</label>
			<div class="controls">
				<input type="password" name="password" id="password" placeholder="Escribe tu password">
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button id="accesar" type="submit" class="btn btn-primary">Accesar</button>
			</div>
		</div>
	</form>
	<p>${mensaje}</p>
	
<script type="text/javascript">
/*
$(document).ready(function() {
  $("#accesar").click(function() {
    $.ajax({
      type: 'GET',
      url: 'login',
      data: $("#frmLogin").serialize(),
      dataType: 'html',
      success: function(data) {
    	  $.get("secure.jsp");
      }
    });
    return false;
  });
});
*/
</script>
</body>
</html>