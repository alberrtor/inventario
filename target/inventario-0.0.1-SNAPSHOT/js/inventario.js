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
	});

	
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
