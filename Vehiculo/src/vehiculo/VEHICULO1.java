/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author Uziel
 */
public class VEHICULO1 {
  
    private int CAPACIDAD;
    private int N_PASAJEROS;
    private int RUEDAS;
    private String FECHA_MATRICULACION;
    private String DESPLAZAMIENTO;
    private String COMBUSTIBLE;
    
  

    public VEHICULO1(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION, String DESPLAZAMIENTO, String COMBUSTIBLE) {
        this.CAPACIDAD = CAPACIDAD;
        this.N_PASAJEROS = N_PASAJEROS;
        this.RUEDAS = RUEDAS;
        this.FECHA_MATRICULACION = FECHA_MATRICULACION;
        this.DESPLAZAMIENTO = DESPLAZAMIENTO;
        this.COMBUSTIBLE = COMBUSTIBLE;
    
    }
    /*METODOS GET*/
    
    public int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public int getN_PASAJEROS() {
        return N_PASAJEROS;
    }

    public int getRUEDAS() {
        return RUEDAS;
    }

    public String getFECHA_MATRICULACION() {
        return FECHA_MATRICULACION;
    }

    public String getDESPLAZAMIENTO() {
        return DESPLAZAMIENTO;
    }

    public String getCOMBUSTIBLE() {
        return COMBUSTIBLE;
    }
    
}

