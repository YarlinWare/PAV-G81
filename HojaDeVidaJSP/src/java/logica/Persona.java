/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author estudiantes
 */
public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    int identificacion;
    int celular; 
    String correo;
    String ciudad;
    String barrio;
    String direccion;
    String fecha_nac; 
    String estado_civil;
    
    String nacionalidad;
    String dirCorrespondencia;
    
    String paisResidencia;
    String paisNac;
    String paisCorres;
    
    String departamentoNac;
    String departamentoCorres;
    String municipioNac;
    String municipioCorres;

    public Persona(String nombre, String apellido1, String apellido2, int identificacion, int celular, String correo, String ciudad, String barrio, String direccion, String fecha_nac, String estado_civil, String nacionalidad, String dirCorrespondencia, String paisResidencia, String paisNac, String paisCorres, String departamentoNac, String departamentoCorres, String municipioNac, String municipioCorres) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificacion = identificacion;
        this.celular = celular;
        this.correo = correo;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
        this.estado_civil = estado_civil;
        this.nacionalidad = nacionalidad;
        this.dirCorrespondencia = dirCorrespondencia;
        this.paisResidencia = paisResidencia;
        this.paisNac = paisNac;
        this.paisCorres = paisCorres;
        this.departamentoNac = departamentoNac;
        this.departamentoCorres = departamentoCorres;
        this.municipioNac = municipioNac;
        this.municipioCorres = municipioCorres;
    }
    
    
    
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDirCorrespondencia() {
        return dirCorrespondencia;
    }

    public void setDirCorrespondencia(String dirCorrespondencia) {
        this.dirCorrespondencia = dirCorrespondencia;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getPaisNac() {
        return paisNac;
    }

    public void setPaisNac(String paisNac) {
        this.paisNac = paisNac;
    }

    public String getPaisCorres() {
        return paisCorres;
    }

    public void setPaisCorres(String paisCorres) {
        this.paisCorres = paisCorres;
    }

    public String getDepartamentoNac() {
        return departamentoNac;
    }

    public void setDepartamentoNac(String departamentoNac) {
        this.departamentoNac = departamentoNac;
    }

    public String getDepartamentoCorres() {
        return departamentoCorres;
    }

    public void setDepartamentoCorres(String departamentoCorres) {
        this.departamentoCorres = departamentoCorres;
    }

    public String getMunicipioNac() {
        return municipioNac;
    }

    public void setMunicipioNac(String municipioNac) {
        this.municipioNac = municipioNac;
    }

    public String getMunicipioCorres() {
        return municipioCorres;
    }

    public void setMunicipioCorres(String municipioCorres) {
        this.municipioCorres = municipioCorres;
    }
   
    
}
