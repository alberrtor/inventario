<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

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

</head>
<body>

<div class="container">
	<s:textfield key="user" />
	<div class="row">
		<!-- Encabezado -->
		<div class="span12">
			<jsp:include page="commons/menutop.jsp" />
		</div>
	</div>

	<div class="row">
		<!-- Contenido -->
		<div class="span9">
		<jsp:include page="commons/pruebas.jsp" />
		</div>
		<!-- menu izquierdo -->
		<div class="span3">
			<jsp:include page="commons/menuright.jsp" />
		</div>
	</div>
</div>

</body>
</html>