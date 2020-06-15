
package vehiculo;



public class COCHE extends VEHICULO1 {
    private float ANCHO=(float) 2.5; 
      private int LARGO=5;

    public COCHE(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION,String DESPLAZAMIENTO, String COMBUSTIBLE){
        
    super(CAPACIDAD,N_PASAJEROS,RUEDAS,FECHA_MATRICULACION,DESPLAZAMIENTO,COMBUSTIBLE);
    this.ANCHO=ANCHO;
    this.LARGO=LARGO;

    }
    
    public void MostrarCoche()
    {
        int FA=getCAPACIDAD()-getN_PASAJEROS();
        System.out.print("\n----ES UN AUTO----");
        System.out.print("\nUN AUTO MIDE "+LARGO+"m DE LARGO Y "+ANCHO+"m DE ANCHO");
        
        System.out.println("\n\nFECHA DE LA MATRICULA:  "+getFECHA_MATRICULACION());
        System.out.println("DESPLAZAMIENTO:  "+getDESPLAZAMIENTO());
        System.out.println("TIPO DE COMBUSTIBLE:  "+getCOMBUSTIBLE());
        System.out.println("CAPACIDAD DEL VEHICULO:  "+getCAPACIDAD());
        System.out.println("NUMERO DE PASAJEROS A BORDO:  "+getN_PASAJEROS());
        System.out.println("NUMERO DE RUEDAS:  "+getRUEDAS());
        System.out.println("*A TU COCHE LE FALTAN "+FA+" PASAJEROS PARA LLENARSE");


      
    }
    
}
