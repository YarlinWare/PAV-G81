/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import logica.ExperienciaLaboral;
import logica.Persona;
import logica.Estudios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rapterpakfa
 */
@WebServlet(name = "Insertar", urlPatterns = {"/Insertar"})
public class InsertarDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
            //explabor.insertarContacto(person);
            request.getRequestDispatcher("impresion.jsp")
                    .forward(request, response);
            //response.sendRedirect("Inicio");
        } finally {
            out.close();
        }*/
        
            Persona person = new Persona();
            ExperienciaLaboral explabor = new ExperienciaLaboral();
            Estudios estudios= new Estudios();

            person.setNombre(request.getParameter("name"));
            person.setApellido1(request.getParameter("lastname1"));
            person.setApellido2(request.getParameter("lastname2"));
            
            //person.setTipoId(request.getParameterValues(""));
            person.setIdentificacion(Integer.parseInt(request.getParameter("numberdocument")));
            System.out.println(Integer.parseInt(request.getParameter("numberdocument")));
            person.setNacionalidad(request.getParameter("nacionalidad"));
            person.setPaisResidencia(request.getParameter("pais_origen"));
            
            person.setFecha_nac(request.getParameter("date_nac"));
            person.setDirCorrespondencia(request.getParameter("direccioncorrespondencia"));            
            person.setPaisNac(request.getParameter("pais_nac"));
            person.setPaisCorres(request.getParameter("pais_corresp"));            
            person.setDepartamentoNac(request.getParameter("depto_nac"));
            person.setDepartamentoCorres(request.getParameter("depto_corresp"));            
            person.setMunicipioNac(request.getParameter("muni_nac"));
            person.setMunicipioCorres(request.getParameter("municipio_corresp"));
            person.setCelular(Integer.parseInt(request.getParameter("tel")));
            person.setCorreo(request.getParameter("correo"));
            
            //person.setCiudad(request.getParameter(""));
            //person.setBarrio(request.getParameter(""));
            person.setDireccion(request.getParameter("direccioncorrespondencia"));
            person.setFecha_nac(request.getParameter("date_nac"));
            
            
            estudios.setNombreInstituto(request.getParameter("instituto1"));
            estudios.setInicioCarrera(request.getParameter("fechInicio1"));
            estudios.setEstadoActual(request.getParameter("estado2"));
            estudios.setTitulo(request.getParameter("titulo1"));
            
            
            estudios.setNombreInstituto2(request.getParameter("instituto2"));
            estudios.setInicioCarrera2(request.getParameter("fechInicio2"));
            estudios.setEstadoActual2(request.getParameter("estado2"));
            estudios.setTitulo2(request.getParameter("titulo2"));
            
            
            estudios.setNombreInstituto3(request.getParameter("instituto3"));
            estudios.setInicioCarrera3(request.getParameter("fechInicio3"));
            estudios.setEstadoActual3(request.getParameter("estado3"));
            estudios.setTitulo3(request.getParameter("titulo3"));
            

            //explabor.setNit(Integer.parseInt(request.getParameter("")));
            //explabor.setCodEmpleado(Integer.parseInt(request.getParameter("")));
            //explabor.setDireccioEmpresa(request.getParameter(""));
            //explabor.setFechaIngreso(request.getParameter(""));
            //explabor.setActivo(true);
            explabor.setNombreEmpresa(request.getParameter("Empresa1"));
            explabor.setCargo(request.getParameter("cargo1"));
            explabor.setTiempoCargo(request.getParameter("tiempo_labor1"));
            
            explabor.setNombreEmpresa2(request.getParameter("Empresa2"));
            explabor.setCargo2(request.getParameter("cargo2"));
            explabor.setTiempoCargo2(request.getParameter("tiempo_labor2"));
            
            explabor.setNombreEmpresa3(request.getParameter("Empresa3"));
            explabor.setCargo3(request.getParameter("cargo3"));
            explabor.setTiempoCargo3(request.getParameter("tiempo_labor3"));
            
            request.setAttribute("curriculum", person);
            request.setAttribute("explabor", explabor);
            request.setAttribute("estudios", estudios);
            //request.getRequestDispatcher("impresion.jsp").forward(request, response);

            request.getRequestDispatcher("impresion.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        Persona person = new Persona();
        ExperienciaLaboral explabor = new ExperienciaLaboral();

        person.setNombre(request.getParameter("name"));
        person.setApellido1(request.getParameter("lastname1"));
        person.setApellido2(request.getParameter("lastname2"));
        person.setIdentificacion(Integer.parseInt(request.getParameter("numberdocument")));
        person.setCorreo(request.getParameter("correo"));
        person.setCelular(Integer.parseInt(request.getParameter("tel")));
        person.setCiudad(request.getParameter(""));
        person.setBarrio(request.getParameter(""));
        person.setDireccion(request.getParameter("direccioncorrespondencia"));
        person.setFecha_nac(request.getParameter("date_nac"));
        person.setEstado_civil(request.getParameter(""));

        explabor.setNit(Integer.parseInt(request.getParameter("")));
        explabor.setNombreEmpresa(request.getParameter("Empresa1"));
        explabor.setCargo(request.getParameter("cargo1"));
        explabor.setCodEmpleado(Integer.parseInt(request.getParameter("")));
        explabor.setDireccioEmpresa(request.getParameter(""));
        explabor.setFechaIngreso(request.getParameter(""));
        explabor.setFechaRetiro(request.getParameter("tiempo_labor1"));
        explabor.setActivo(true);

        
        processRequest(request, response);*/
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
