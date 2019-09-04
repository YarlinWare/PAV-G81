function validar(){
	if(document.getElementById('name').value==""){
	    alert("El nombre no puede ser vacio");
	    return;
	}
	if(document.getElementById('lastname1').value==""){
	    alert("El nombre no puede ser vacio");
	    return;
	}
	if(document.getElementById('lastname2').value==""){
	    alert("El nombre no puede ser vacio");
	    return;
	}
	alert("Formulario completo " + document.getElementById("nombre").value);

}
