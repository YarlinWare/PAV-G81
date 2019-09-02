/*Almacenando datos*/
Form1.addEventListener('submit', function (event) {

	/* Declarando variables*/
	//Datos personales
	var lastname1 = document.getElementById('lastname1').value;	
	localStorage.setItem('lastname1',lastname1);
	var lastname2 = document.getElementById('lastname2').value;	
	localStorage.setItem('lastname2',lastname2);
	var name = document.getElementById('name').value;	
	localStorage.setItem('name',name);

	var cc = document.getElementById('cc').value;	
	localStorage.setItem('cc',cc);
	var ce = document.getElementById('ce').value;	
	localStorage.setItem('ce',ce);
	var passport = document.getElementById('passport').value;	
	localStorage.setItem('passport',passport);

	var numberdocument = document.getElementById('number-document').value;	
	localStorage.setItem('numberdocument',numberdocument);
	var nacionalidad = document.getElementById('nacionalidad').value;	
	localStorage.setItem('nacionalidad',nacionalidad);
	var pais_origen = document.getElementById('pais_origen').value;	
	localStorage.setItem('pais_origen',pais_origen);

	var date_nac = document.getElementById('date_nac').value;	
	localStorage.setItem('date_nac',date_nac);
	var direccion_correspondencia = document.getElementById('direccion-correspondencia').value;	
	localStorage.setItem('direccion_correspondencia',direccion_correspondencia);
	var pais_nac = document.getElementById('pais_nac').value;	
	localStorage.setItem('pais_nac',pais_nac);
	var pais_corresp = document.getElementById('pais_corresp').value;	
	localStorage.setItem('pais_corresp',pais_corresp);
	var depto_nac = document.getElementById('depto_nac').value;	
	localStorage.setItem('depto_nac',depto_nac);
	var depto_corresp = document.getElementById('depto_corresp').value;	
	localStorage.setItem('depto_corresp',depto_corresp);
	var muni_nac = document.getElementById('muni_nac').value;	
	localStorage.setItem('muni_nac',muni_nac);
	var municipio_corresp = document.getElementById('municipio_corresp').value;	
	localStorage.setItem('municipio_corresp',municipio_corresp);
	var tel = document.getElementById('tel').value;	
	localStorage.setItem('tel',tel);
	var correo = document.getElementById('correo').value;	
	localStorage.setItem('correo',correo);	

	//Información Académica

	//Experiencia laboral

	//Imagen de perfil

}, false);

