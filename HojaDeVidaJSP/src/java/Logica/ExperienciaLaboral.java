/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author estudiantes
 */
public class ExperienciaLaboral {

    int nit;
    int codEmpleado;
    String nombreEmpresa;
    String direccioEmpresa;
    String cargo;
    String fechaIngreso;
    String fechaRetiro;
    boolean activo;

    public ExperienciaLaboral(int nit, int codEmpleado, String nombreEmpresa, 
            String direccioEmpresa, String cargo, 
            String fechaIngreso, String fechaRetiro, boolean activo) {
        this.nit = nit;
        this.codEmpleado = codEmpleado;
        this.nombreEmpresa = nombreEmpresa;
        this.direccioEmpresa = direccioEmpresa;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.activo = activo;
    }

    public ExperienciaLaboral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccioEmpresa() {
        return direccioEmpresa;
    }

    public void setDireccioEmpresa(String direccioEmpresa) {
        this.direccioEmpresa = direccioEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
}
