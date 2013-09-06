
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<sj:head jqueryui="true" jquerytheme="redmond" />


<s:form id="frmUsuario" action="guardaUsuario" enctype="multipart/form-data" theme="bootstrap"
	cssClass="form-horizontal" label="Alta Usuario" method="get">
	<s:textfield label="Usuario" id="login" name="login"
		tooltip="Ingrese su nombre de usuario" />

	<s:textfield label="Password" id="password" name="password"
		tooltip="Ingrese su password" />

	<s:radio id="esadmin" tooltip="Es administrador"
             label="¿Es administrador?"
             labelposition="inline"
             list="{'Sí', 'No'}"
             name="esadmin" />


	<s:submit cssClass="btn" value="Guardar" />
</s:form>

