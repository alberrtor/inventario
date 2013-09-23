<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" jquerytheme="redmond" />

<s:url id="consultaUsuarios" action="listarUsuarios" />
<s:url id="editurl" action="guardaUsuario" />
<sjg:grid 
	id="gridusuarios" 
	caption="Usuarios" 
	dataType="json"
	href="%{consultaUsuarios}"
	editurl="%{editurl}"
	gridModel="usuarios" 
	pager="true" 
	rowNum="10" 
	rownumbers="true"
	rowList="10,20,30"
	autowidth="true"
	navigator="true"
	
	navigatorAdd="true"
	navigatorEdit="true"
	navigatorDelete="true" 
	navigatorRefresh="true"
	navigatorSearch="false"
	navigatorView="false" 
	viewrecords="false"
	
	navigatorAddOptions="{
    		closeAfterAdd: true,
    		reloadAfterSubmit:true,
		}"
	
	navigatorEditOptions="{
    		closeAfterEdit: true,
    		reloadAfterSubmit:true,
		}"
	
	>

	<sjg:gridColumn name="idusuario"  index="idusuario" search="false" key="true"
	 title="Id Usuario" sortable="true" editable="false" />
	<sjg:gridColumn name="login" align="left" index="login"
		editable="true" edittype="text" title="Login" sortable="true"  />
	<sjg:gridColumn name="password" align="left" index="password"
		editable="true" edittype="text" title="Password" sortable="true" />
	<sjg:gridColumn name="esadministrador" align="left" index="esadministrador"
		editable="true" title="Es administrador" sortable="true" 
		edittype="select" editoptions="{value:'SI:SI;NO:NO;'}"
		/>
</sjg:grid>
