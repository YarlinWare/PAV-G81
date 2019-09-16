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
public class ExperienciaLaboralDetalle extends ExperienciaLaboral {

    String detalleFuncion;
    int idReferencia;

    public ExperienciaLaboralDetalle(String detalleFuncion, int idReferencia,
            int nit, int codEmpleado, String nombreEmpresa,
            String direccioEmpresa, String cargo, String fechaIngreso,
            String fechaRetiro, boolean activo) {
        super(nit, codEmpleado, nombreEmpresa, direccioEmpresa, cargo,
                fechaIngreso, fechaRetiro, activo);
        this.detalleFuncion = detalleFuncion;
        this.idReferencia = idReferencia;
    }

}
