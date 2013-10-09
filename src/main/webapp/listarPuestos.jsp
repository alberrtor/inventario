<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>





<sj:head jqueryui="true" jquerytheme="redmond" />


<s:url id="consultaPuestos" action="listarPuestos" />
<s:url id="editurl" action="guardaPuesto" />
<s:url id="comboareas" action="comboAreas" />



<sjg:grid 
	id="gridpuestos" 
	caption="Puestos" 
	dataType="json"
	href="%{consultaPuestos}"
	editurl="%{editurl}"
	gridModel="puestos" 
	pager="true" 
	rowNum="30" 
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

	<sjg:gridColumn name="idpuesto"  index="idpuesto" search="false" key="true"
	 title="Id Puesto" sortable="true" editable="false" searchoptions="{sopt:['eq','lt','gt']}"/>
	<sjg:gridColumn name="descripcion" align="left" index="descripcion"
		editable="true" edittype="text" title="Descripcion" sortable="true"  />
   <sjg:gridColumn name="area.idarea" align="left" index="area.idarea"
		editable="true" edittype="select" title="Area" sortable="true"  editoptions="%{comboareas}" /> 
 

 <%-- <sjg:gridColumn name="esadministrador" align="left" index="esadministrador"
		editable="true" title="Es administrador" sortable="true" 
		edittype="select" editoptions="{value:'SI:SI;NO:NO;'}"
		/>--%>
		
	</sjg:grid>
	
	   
	
	