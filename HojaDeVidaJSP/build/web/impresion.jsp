<%-- 
    Document   : impresion
    Created on : 12-sep-2019, 10:52:18
    Author     : estudiantes

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="curriculum" scope="request" class="logica.Persona" />
<jsp:useBean id="explabor" scope="request" class="logica.ExperienciaLaboral" />
<jsp:useBean id="estudios" scope="request" class="logica.Estudios" />
<!DOCTYPE html>
<html>
    <head>
        <title>Imprimi</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style_imprimir.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Indie+Flower|Teko|Yanone+Kaffeesatz&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <br>	
            <div class="encabezado">		
                <span id="name"><jsp:getProperty name="curriculum" property="nombre" /> </span> <span id="lastname1"><jsp:getProperty name="curriculum" property="apellido1" /></span> <span id="lastname2"><jsp:getProperty name="curriculum" property="apellido2" /></span>			
                <br>
                <div class="info-adicional">
                    <span id="document"></span>:<span id="numberdocument"><jsp:getProperty name="curriculum" property="identificacion" /></span>
                    <br>
                    <strong>Tel:</strong><span id="tel"><jsp:getProperty name="curriculum" property="celular" /></span>					
                    <br>
                    <strong>E-mail:</strong><span id="correo"><jsp:getProperty name="curriculum" property="correo" /></span>				
                </div>

                <div class="img-perfil">
                    <img src="img/perfil.jpg" alt="">
                </div>
            </div>
            <h3 class="input-header">Datos personales</h3>
            <hr>

            <table class="info-complemento1">
                <tr rowspan="7" class="borde-left"></tr>
                <tbody>

                    <tr>
                        <th class="input-header">Nacionalidad</th>
                        <th class="input-header">País Residencia</th>
                    </tr>
                    <tr rowspan="2">

                        <td class="info-user" id="nacionalidad"><jsp:getProperty name="curriculum" property="nacionalidad" /></td>
                        <td class="info-user" id="pais_origen"><jsp:getProperty name="curriculum" property="paisResidencia" /></td>
                    </tr>
                    <tr>
                        <th class="input-header" colspan="2">Fecha y lugar de nacimiento</th>
                        <th class="input-header" colspan="2">Dirección de correspondencia</th>
                    </tr>
                    <tr>
                        <th class="input-header-sub" rowspan="1">Fecha</td>
                        <td class="info-user" rowspan="1" id="date_nac"><jsp:getProperty name="curriculum" property="fecha_nac" /></td>	
                        <td class="info-user" colspan="2" id="direccion-correspondencia"><jsp:getProperty name="curriculum" property="dirCorrespondencia" /></td>							
                    </tr>
                    <tr>
                        <th class="input-header-sub" >Pais</td>
                        <td class="info-user" id="pais_nac"><jsp:getProperty name="curriculum" property="paisNac" /></td>
                        <th class="input-header-sub" >Pais</td>
                        <td class="info-user" id="pais_corresp"><jsp:getProperty name="curriculum" property="paisCorres" /></td>					
                    </tr>
                    <tr>
                        <td class="input-header-sub">Depto</td>
                        <td class="info-user" id="depto_nac"><jsp:getProperty name="curriculum" property="departamentoNac" /></td>	
                        <td class="input-header-sub">Depto</td>
                        <td class="info-user" id="depto_corresp"><jsp:getProperty name="curriculum" property="departamentoCorres" /></td>				
                    </tr>
                    <tr>
                        <td class="input-header-sub">Municipio</td>
                        <td class="info-user" id="muni_nac"><jsp:getProperty name="curriculum" property="municipioNac" /></td>
                        <td class="input-header-sub">Municipio</td>
                        <td class="info-user" id="municipio_corresp"><jsp:getProperty name="curriculum" property="municipioCorres" /></td>
                    </tr>


                </tbody>
            </table>
            <h3 class="input-header">Información Académica</h3>
            <hr>
            <table>
                <tbody>
                    <tr><span class="input-header">Educación Superior</span></tr>
                <tr>
                    <th class="input-header-sub">Instituto</th>
                    <td class="info-user" id="instituto1"><jsp:getProperty name="estudios" property="nombreInstituto" /></td>
                    <td class="input-header-sub">Título obtenido</td>
                    <td class="info-user" id="titulo1" ><jsp:getProperty name="estudios" property="titulo" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Inicio</td>
                    <td class="info-user" id="fechInicio1"><jsp:getProperty name="estudios" property="inicioCarrera" /></td>
                    <td class="input-header-sub">Estado</td>
                    <td class="info-user" id="estado1"><jsp:getProperty name="estudios" property="estadoActual" /></td>				
                </tr><br>
                <tr>
                    <th class="input-header-sub">Instituto</th>
                    <td class="info-user" id="instituto2"><jsp:getProperty name="estudios" property="nombreInstituto2" /></td>
                    <td class="input-header-sub">Título obtenido</td>
                    <td  class="info-user" id="titulo2"><jsp:getProperty name="estudios" property="titulo2" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Inicio</td>
                    <td class="info-user" id="fechInicio2" ><jsp:getProperty name="estudios" property="inicioCarrera2" /></td>
                    <td class="input-header-sub">Estado</td>
                    <td class="info-user" id="estado2"><jsp:getProperty name="estudios" property="estadoActual2" /></td>				
                </tr><br>
                <tr>
                    <th class="input-header-sub">Instituto</th>
                    <td class="info-user" id="instituto3"><jsp:getProperty name="estudios" property="nombreInstituto3" /></td>
                    <td class="input-header-sub">Título obtenido</td>
                    <td class="info-user" id="titulo3" ><jsp:getProperty name="estudios" property="titulo3" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Inicio</td>
                    <td class="info-user" id="fechInicio3" ><jsp:getProperty name="estudios" property="inicioCarrera3" /></td>
                    <td class="input-header-sub">Estado</td>
                    <td class="info-user" id="estado3"><jsp:getProperty name="estudios" property="estadoActual3" /></td>				
                </tr>
                </tbody>
            </table>
            <br>
            <h3 class="input-header">Experiencia laboral</h3>
            <hr>
            <table>
                <tr>
                    <th class="input-header-sub">Empresa</th>
                    <td class="info-user" colspan="3" id="Empresa1"><jsp:getProperty name="explabor" property="nombreEmpresa" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Tiempo laborado</td>
                    <td class="info-user" id="tiempo_labor1" ><jsp:getProperty name="explabor" property="tiempoCargo" /></td>
                    <td class="input-header-sub">Cargo</td>
                    <td class="info-user" id="cargo1"><jsp:getProperty name="explabor" property="cargo" /></td>				
                </tr>
                <tr><th class="input-header-sub">Empresa</th>
                    <td class="info-user" colspan="3" id="Empresa2"><jsp:getProperty name="explabor" property="nombreEmpresa2" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Tiempo laborado</td>
                    <td class="info-user" id="tiempo_labor2"><jsp:getProperty name="explabor" property="tiempoCargo2" /></td>
                    <td class="input-header-sub">Cargo</td>
                    <td class="info-user" id="cargo2"><jsp:getProperty name="explabor" property="cargo2" /></td>				
                </tr>
                <tr>
                    <th class="input-header-sub">Empresa</th>
                    <td class="info-user" colspan="3" id="Empresa3"><jsp:getProperty name="explabor" property="nombreEmpresa3" /></td>
                </tr>
                <tr>
                    <td class="input-header-sub">Tiempo laborado</td>
                    <td class="info-user" id="tiempo_labor3"><jsp:getProperty name="explabor" property="tiempoCargo3" /></td>
                    <td class="input-header-sub">Cargo</td>
                    <td class="info-user" id="cargo3"><jsp:getProperty name="explabor" property="cargo3" /></td>				
                </tr>			
            </table>
            <br>
            <!--
                    LocalStorage
                    <script type='text/javascript' src="js/capturando.js"></script>
            -->
            <!--<script type='text/javascript' src="js/capturando2.js"></script>
            <script></script>-->
    </body>
</html>
