<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="jquery/jquery-1.10.0.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="js/inventario.js"></script>

</head>
<body>

	<div class="container">
		<div class="row">
			<!-- Encabezado -->
			<div class="span12">
				<jsp:include page="commons/menutop.jsp" />
			</div>
		</div>

		<div class="row">
			<!-- menu administrador -->
			<div class="span12">
				<s:if test="%{usuario.esadministrador}">
					<jsp:include page="commons/menutop2.jsp" />
				</s:if>
			</div>
		</div>

		<div class="row">
			<!-- Contenido -->
			<div class="span12">
				<div id="principal">${mensajeUsuario}</div>
			</div>
		</div>
	</div>

</body>
</html>