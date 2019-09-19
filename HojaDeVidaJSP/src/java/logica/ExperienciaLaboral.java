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
public class ExperienciaLaboral {

    int nit;
    int codEmpleado;
    String nombreEmpresa;
    String tiempoCargo;
    String cargo;    
    String direccioEmpresa;    
    String fechaIngreso;
    String fechaRetiro;
    
    String nombreEmpresa2;
    String tiempoCargo2;
    String cargo2;    
    //String direccioEmpresa;    
    //String fechaIngreso;
    //String fechaRetiro;
    
    String nombreEmpresa3;
    String tiempoCargo3;
    String cargo3;    
    //String direccioEmpresa;    
    //String fechaIngreso;
    //String fechaRetiro;
    
    //boolean activo;

    public ExperienciaLaboral(int nit, int codEmpleado, String nombreEmpresa, 
            String tiempoCargo, String cargo, String direccioEmpresa, 
            String fechaIngreso, String fechaRetiro, String nombreEmpresa2, 
            String tiempoCargo2, String cargo2, String nombreEmpresa3, 
            String tiempoCargo3, String cargo3) {
        this.nit = nit;
        this.codEmpleado = codEmpleado;
        this.nombreEmpresa = nombreEmpresa;
        this.tiempoCargo = tiempoCargo;
        this.cargo = cargo;
        this.direccioEmpresa = direccioEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.nombreEmpresa2 = nombreEmpresa2;
        this.tiempoCargo2 = tiempoCargo2;
        this.cargo2 = cargo2;
        this.nombreEmpresa3 = nombreEmpresa3;
        this.tiempoCargo3 = tiempoCargo3;
        this.cargo3 = cargo3;
    }

    

    public ExperienciaLaboral() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTiempoCargo() {
        return tiempoCargo;
    }

    public void setTiempoCargo(String tiempoCargo) {
        this.tiempoCargo = tiempoCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreEmpresa2() {
        return nombreEmpresa2;
    }

    public void setNombreEmpresa2(String nombreEmpresa2) {
        this.nombreEmpresa2 = nombreEmpresa2;
    }

    public String getTiempoCargo2() {
        return tiempoCargo2;
    }

    public void setTiempoCargo2(String tiempoCargo2) {
        this.tiempoCargo2 = tiempoCargo2;
    }

    public String getCargo2() {
        return cargo2;
    }

    public void setCargo2(String cargo2) {
        this.cargo2 = cargo2;
    }

    public String getNombreEmpresa3() {
        return nombreEmpresa3;
    }

    public void setNombreEmpresa3(String nombreEmpresa3) {
        this.nombreEmpresa3 = nombreEmpresa3;
    }

    public String getTiempoCargo3() {
        return tiempoCargo3;
    }

    public void setTiempoCargo3(String tiempoCargo3) {
        this.tiempoCargo3 = tiempoCargo3;
    }

    public String getCargo3() {
        return cargo3;
    }

    public void setCargo3(String cargo3) {
        this.cargo3 = cargo3;
    }

    
    
    
}
