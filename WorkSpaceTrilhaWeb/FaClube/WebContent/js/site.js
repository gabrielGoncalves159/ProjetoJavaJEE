function validarCampos(){

	var nome = document.frmcadastro.txtnome.value;
	var expRegNome = new RegExp("^[A-zÀ-ü]{3,}([ ]{1}[A-zÀ-ü]{2,})+$");
	
	if(!expRegNome.test(nome)){
		alert("Preencha o campo Nome corretamente.");
		document.frmcadastro.txtnome.focus();
		return false;
	}
	
	if(document.frmcadastro.txtidade.value==""){
		alert("Preencha o campo Idade.");
		document.frmcadastro.txtidade.focus();
		return false
	}
	
	if(document.frmcadastro.selsexo.value==""){
		alert("Preencha o campo Sexo.");
		document.frmcadastro.selsexo.focus();
		return false
	}
	
	var fone = document.frmcadastro.txtfone.value;
	var expRegFone = new RegExp("^[(]{1}[1-9]{2}[)]{1}[0-9]{4,5}[-]{1}[0-9]{4}$");
	
	if(!expRegFone.test(fone)){
		alert("Preencha o compo Telefone corretamente.");
		document.frmcadastro.txtfone.focus();
		return false;
	}

	var email = document.frmcadastro.txtemail.value;
	var expRegEmail = new RegExp("^[a-z0-9]{1,}[@]{1}[a-z0-9]{1,}[.]{1}[a-z][.]{1}[a-z]$");
	
	if(!expRegEmail.test(email)){
		alert("Preencha o campo E-mail corretamente.");
		document.frmcadastro.txtemail.focus();
		return false
	}

	
	if(document.frmcadastro.txasugestao.value==""){
		alert("Preencha o campo Sugestão.");
		document.frmcadastro.txasugestao.focus();
		return false
	}
	
	
	return true;
}

$(document).ready(function() {
	$("header").load("/FaClube/pages/site/general/cabecalho.html");
	$("nav").load("/FaClube/pages/site/general/menu.html");
	$("footer").load("/FaClube/pages/site/general/rodape.html");
});