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
public class ExperienciaLaboralDetalle extends ExperienciaLaboral {

    String detalleFuncion;
    int idReferencia;

    public ExperienciaLaboralDetalle(String detalleFuncion, int idReferencia, int nit, int codEmpleado, String nombreEmpresa, String tiempoCargo, String cargo, String direccioEmpresa, String fechaIngreso, String fechaRetiro, String nombreEmpresa2, String tiempoCargo2, String cargo2, String nombreEmpresa3, String tiempoCargo3, String cargo3) {
        super(nit, codEmpleado, nombreEmpresa, tiempoCargo, cargo, direccioEmpresa, fechaIngreso, fechaRetiro, nombreEmpresa2, tiempoCargo2, cargo2, nombreEmpresa3, tiempoCargo3, cargo3);
        this.detalleFuncion = detalleFuncion;
        this.idReferencia = idReferencia;
    }   

    public ExperienciaLaboralDetalle() {
       
        this.detalleFuncion = detalleFuncion;
        this.idReferencia = idReferencia;
    }

}
