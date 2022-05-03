COLDIGO.marca = new Object();

$(document).ready(function(){
	
	COLDIGO.marca.cadastrarMarca = function(){
		
		var marca = new Object();
		
		marca.nome = document.frmMarca.nomeMarca.value;
		
		if(marca.nome == "") {
			COLDIGO.exibirAviso("Preencher o campo Nome!");
		}else {
			
			$.ajax({
				type: "POST",
				url: COLDIGO.PATH + "marca/inserir",
				data: JSON.stringify(marca),
				success: function (msg){
					COLDIGO.exibirAviso(msg);
					COLDIGO.marca.buscarMarca();
					
					$("#frmAdicionarMarca").trigger("reset");
				},
				error: function (into){
					COLDIGO.exibirAviso("Erro ao cadastrar nova marca: "+ info.status + " - " +info.statusText);
				}
			});
			
		}
	}
	
	COLDIGO.marca.buscarMarca = function(){
		
		var valorBusca = $("#campoBuscarMarca").val();
		
		$.ajax({
			type: "GET",
			url: COLDIGO.PATH + "marca/buscarMarca",
			data: "valorBusca="+valorBusca,
			success: function(dados){
				
				dados = JSON.parse(dados);
				
				/*console.log(dados);*/
				
				$("#listaDeMarcas").html(COLDIGO.marca.exibirMarca(dados));	
			},
			error: function(info){
				COLDIGO.exibirAviso("Erro ao consultar as marcas: "+ info.status + " - " +info.statusText);
			}
		});
	
	};
	
	COLDIGO.marca.exibirMarca = function(listaDeMarcas){
		
		var tabelaMarcas = "<table>" +
				"<tr>" +
				"<th>Marca</th>" +
				"<th class='acoesMarca'>Ações</th>" +
				"</tr>" 
				
		if(listaDeMarcas != undefined && listaDeMarcas.length > 0){
			
			for (var i=0; i<listaDeMarcas.length; i++){
				tabelaMarcas += "<tr>" +
						"<td>"+listaDeMarcas[i].nome+"</td>" +
						"<td>" +
							"<a onclick=\"COLDIGO.marca.exibirEdicaoMarca('"+listaDeMarcas[i].id+"')\"><img src='../../imgs/edit.png' alt='Editar marca'></a>" +
							"<a onclick=\"COLDIGO.marca.modalExcluirMarca('"+listaDeMarcas[i].id+"')\"><img src='../../imgs/delete.png' alt='Excluir marca'></a>" +
						"</td>" +
						"</tr>"
			}
		}else if (listaDeMarcas == ""){
			tabelaMarcas+= "<tr><td colspan='6'>Nenhum registro< encontrado/td></tr>"
		}
		tabelaMarcas += "</table>";
		
		return tabelaMarcas;
	};
	
	COLDIGO.marca.buscarMarca();
	
	COLDIGO.marca.modalExcluirMarca = function(id){
		
		var id = id;
		var modalExcluirMarca = {
				title: "Aviso",
				height: 200,
				width: 400,
				modal: true,
				buttons: {
					"Ok": function() {
						COLDIGO.marca.excluirMarca(id);
					},
					"Cancelar": function() {
						$(this).dialog("close");
					}
				},
				close: function(){
					
				},
				
		}
		$("#modalExcluirMarca").dialog(modalExcluirMarca);
	}
	
	COLDIGO.marca.excluirMarca = function(id) {
		$.ajax({
			type: "DELETE",
			url: COLDIGO.PATH + "marca/excluir/"+id,
			success: function(msg){
				COLDIGO.exibirAviso(msg);
				COLDIGO.marca.buscarMarca();
				$("#modalExcluirMarca").dialog("close");
			},
			error: function(info){
				COLDIGO.exibirAviso("Erro ao consultar marcas" + info.status + " - " + info.statusText);
				$("#modalExcluirMarca").dialog("close");
			}
		});
		
	}
	
	
	COLDIGO.marca.exibirEdicaoMarca = function(id){
		
		$.ajax({
			type:"GET",
			url: COLDIGO.PATH + ("marca/buscarPorId"),
			data: "id="+id,
			success: function(marca){
				
				console.log(marca);
				document.frmEditaMarca.idMarca.value = marca.id;
				document.frmEditaMarca.nomeMarca.value = marca.nome;
				
				var modalEditaMarca = {
					title: "Editar Marca",
					height: 200,
					width: 400,
					modal: true,
					buttons:{
						"Salvar": function(){
							COLDIGO.marca.editarMarca();
						},
						"Cancelar": function(){
							$(this).dialog("close");
						}
					},
					close: function(){
					
					}
				}
				
				$("#modalEditaMarca").dialog(modalEditaMarca);
			},
			
			error: function(){
				COLDIGO.exibirAviso("Erro ao buscar para edição: "+ info.status + " - " + info.statusText);
			}
		});
		
	};
	
	COLDIGO.marca.editarMarca = function(){
	
		var marca = new Object();
		marca.id = document.frmEditaMarca.idMarca.value;
		marca.nome = document.frmEditaMarca.nomeMarca.value;
		
		console.log(marca)
		
		$.ajax({
			type: "PUT",
			url: COLDIGO.PATH + "marca/alterar",
			data: JSON.stringify(marca),
			success: function(msg){
				COLDIGO.exibirAviso(msg);
				COLDIGO.marca.buscarMarca();
				$("#modalEditaMarca").dialog("close");
			},
			error: function(info){
				COLDIGO.exibirAviso("Erro ao editar marca: "+ info.status +" - "+ info.statusText )
			}
		});
	
	};
	
});

