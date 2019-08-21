function getVarsUrl(){
    var url= location.search.replace("?", "");
    var arrUrl = url.split("&");
    var urlObj={};   
    for(var i=0; i<arrUrl.length; i++){
	var x= arrUrl[i].split("=");
	urlObj[x[0]]=x[1]
    }
    return urlObj;
}
var misVariablesGet = getVarsUrl();   

var Nombre= document.getElementById('getnombre');
Nombre.innerHTML= misVariablesGet.nombre;
var Apellido= document.getElementById('getapellido');
Apellido.innerHTML=misVariablesGet.apellido;
var Edad=document.getElementById('getedad');
Edad.innerHTML=misVariablesGet.edad;

var Nombre2= document.getElementById('getnombre2');
Nombre2.innerHTML= misVariablesGet.nombre2;
var Apellido2= document.getElementById('getapellido2');
Apellido2.innerHTML=misVariablesGet.apellido2;
var Edad2=document.getElementById('getedad2');
Edad2.innerHTML=misVariablesGet.edad2;

var Nombre3= document.getElementById('getnombre3');
Nombre3.innerHTML= misVariablesGet.nombre3;
var Apellido3= document.getElementById('getapellido3');
Apellido3.innerHTML=misVariablesGet.apellido3;
var Edad3=document.getElementById('getedad3');
Edad3.innerHTML=misVariablesGet.edad3;

var Nombre4= document.getElementById('getnombre4');
Nombre4.innerHTML= misVariablesGet.nombre4;
var Apellido4= document.getElementById('getapellido4');
Apellido4.innerHTML=misVariablesGet.apellido4;
var Edad4=document.getElementById('getedad4');
Edad4.innerHTML=misVariablesGet.edad4;

var Nombre5= document.getElementById('getnombre5');
Nombre5.innerHTML= misVariablesGet.nombre5;
var Apellido5= document.getElementById('getapellido5');
Apellido5.innerHTML=misVariablesGet.apellido5;
var Edad5=document.getElementById('getedad5');
Edad5.innerHTML=misVariablesGet.edad5;

function validar(){
    if(document.getElementById('nombre').value==""){
	/*alert('el nombre no puede ser vacio');*/
		return;
    }
    if(document.getElementById('apellido').value==""){
	/*alert('el nombre no puede ser vacio');*/
		return;
    }
    if(document.getElementById('edad').value==""){
	/*alert('el nombre no puede ser vacio');*/
		return;
    }
    /*alert("Formulario completo");*/
}