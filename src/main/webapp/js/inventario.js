$(document).ready(function() {

	$('#usuario').click(function() {
		$('#principal').html('');
		$.ajax({
			url : 'listarUsuarios.jsp',
			dataType : 'html',
			type : 'GET',
			success : function(data) {
				$('#principal').html(data);
			}
		});
	});

	$('#areas').click(function() {
		$('#principal').html('');
		$.ajax({
			url : 'listarAreas.jsp',
			dataType : 'html',
			type : 'GET',
			success : function(data) {
				$('#principal').html(data);
			}
		});
	});

	$('#puest').click(function() {
		$('#principal').html('');
		$.ajax({
			url : 'listarPuestos.jsp',
			dataType : 'html',
			type : 'GET',
			success : function(data) {
				$('#principal').html(data);
			}
		});
	});
	
	//Ya no se ocupa se deja como ejemplo
	$('#btnAltaUsuario').click(function() {
		$('#principal').html('');
		$.ajax({
			url : 'altaUsuario.jsp',
			dataType : 'html',
			type : 'GET',
			success : function(data) {
				$('#principal').html(data);
			}
		});
	});
	
});
