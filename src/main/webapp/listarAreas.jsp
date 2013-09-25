<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<sj:head jqueryui="true" jquerytheme="redmond" />

<s:url id="consultaAreas" action="listarAreas" />
<s:url id="editurl" action="guardaArea" />
<sjg:grid 
	id="gridareas" 
	caption="Areas" 
	dataType="json"
	href="%{consultaAreas}"
	editurl="%{editurl}"
	gridModel="areas" 
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
	navigatorSearch="true"
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

	<sjg:gridColumn name="idarea"  index="idarea" search="false" key="true"
	 title="Id Area" sortable="true" editable="false" searchoptions="{sopt:['eq','lt','gt']}"/>
	<sjg:gridColumn name="descripcion" align="left" index="descripcion"
		editable="true" edittype="text" title="Descripcion" sortable="true"  />
	</sjg:grid>
