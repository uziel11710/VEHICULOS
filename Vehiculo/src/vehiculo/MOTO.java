
package vehiculo;


public class MOTO extends VEHICULO1 {
    
     private int PESO=250;

    public MOTO(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION,String DESPLAZAMIENTO, String COMBUSTIBLE){
        
    super(CAPACIDAD,N_PASAJEROS,RUEDAS,FECHA_MATRICULACION,DESPLAZAMIENTO,COMBUSTIBLE);
    this.PESO=PESO;
     
    }
    
    public void MostrarMoto()
    {
        int FA=getCAPACIDAD()-getN_PASAJEROS();
        System.out.print("\n----ES UNA MOTOCICLETA----");
        System.out.print("\nUNA MOTOCICLETA PESA "+PESO+"kg");
        
        System.out.println("\n\nFECHA DE LA MATRICULA:  "+getFECHA_MATRICULACION());
        System.out.println("DESPLAZAMIENTO:  "+getDESPLAZAMIENTO());
        System.out.println("TIPO DE COMBUSTIBLE:  "+getCOMBUSTIBLE());
        System.out.println("CAPACIDAD DEL VEHICULO:  "+getCAPACIDAD());
        System.out.println("NUMERO DE PASAJEROS A BORDO:  "+getN_PASAJEROS());
        System.out.println("NUMERO DE RUEDAS:  "+getRUEDAS());
        System.out.println("*A TU MOTO LE FALTAN "+FA+" PASAJEROS PARA LLENARSE");


      
    }
    
    
}
