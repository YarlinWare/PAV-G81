var mensaje = document.getElementById('mensaje');
var contmsg = document.getElementById('cont-msg');
var boton= document.getElementById("btnAceptar");

/*Ocultando el botón*/
//boton.style.display="none";

//Tipo input
document.getElementById('edad').type="number";
document.getElementById('edad2').type="number";
document.getElementById('edad3').type="number";
document.getElementById('edad4').type="number";
document.getElementById('edad5').type="number";

function validar(input){
 	mensaje.innerHTML = ""
  	contmsg.style.background='none';
  	mensaje.style.color = "#FFF";
	const min=parseInt(input.dataset.lengthmin); 
	if(input.value.length>=min){
		input.style.borderColor="#33CB0F";
    	mensaje.innerHTML = "Dato ingresado válido";
    	contmsg.style.background='#a0deb6';
      	mensaje.style.color = "#000"; 	
		return true;
	}else{
		input.style.borderColor="#ff0000";
    	mensaje.innerHTML = "Dato ingresado inválido";      
    	contmsg.style.background='#ff7588';    	
		return false;
	}	

}


function validarFormulario(formulario)
{	
	let result=true;
	var input=formulario.querySelectorAll("input[type=text]");
	//var input_number=formulario.querySelectorAll("input[type=number]");
	
	for (i of input) {
		if (validar(i)==false) {
			result=false;
		}
	}
	/*for (i of input_number) {
		if (validar(i)==false) {
			result=false;
		}				
	}	*/	

	return result;			
}

//LocalStorage 
//Set -> guardando
//Get -> Obteniendo
Form1.addEventListener('submit', function (event) {

	//event.preventDefault();	/* Declarando variables*/
	//Usuario1
	var nombre = document.getElementById('nombre').value ;
	var apellido = document.getElementById('apellido').value;
	var edad = document.getElementById('edad').value ;
	//Usuario2
	var nombre2 = document.getElementById('nombre2').value;
	var apellido2 = document.getElementById('apellido2').value ;
	var edad2 = document.getElementById('edad2').value ;
	//Usuario3
	var nombre3 = document.getElementById('nombre3').value ;
	var apellido3 = document.getElementById('apellido3').value ;
	var edad3= document.getElementById('edad3').value;
	//Usuario4
	var nombre4 = document.getElementById('nombre4').value;
	var apellido4 = document.getElementById('apellido4').value;
	var edad4 = document.getElementById('edad4').value;
	//Usuario5
	var nombre5 = document.getElementById('nombre5').value;
	var apellido5 = document.getElementById('apellido5').value;
	var edad5 = document.getElementById('edad5').value;

		
	localStorage.setItem('nombre',nombre);
	localStorage.setItem('apellido',apellido);
	localStorage.setItem('edad',edad);
		
	localStorage.setItem('nombre2',nombre2);
	localStorage.setItem('apellido2',apellido2);
	localStorage.setItem('edad2',edad2);
	
	localStorage.setItem('nombre3',nombre3);
	localStorage.setItem('apellido3',apellido3);
	localStorage.setItem('edad3',edad3);
	
	localStorage.setItem('nombre4',nombre4);
	localStorage.setItem('apellido4',apellido4);
	localStorage.setItem('edad4',edad4);
	
	localStorage.setItem('nombre5',nombre5);
	localStorage.setItem('apellido5',apellido54);
	localStorage.setItem('edad5',edad5);

}, false);

/*En desarrollo: Validación de todos los campos*/
/*if (document.getElementById('edad5').value==true) {	
    boton.style.display="initial";     
}*/