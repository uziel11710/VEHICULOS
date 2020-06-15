
package vehiculo;


public class LANCHA extends VEHICULO1 { 
      private int PRECIO=65000;

    public LANCHA(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION,String DESPLAZAMIENTO, String COMBUSTIBLE){
        
    super(CAPACIDAD,N_PASAJEROS,RUEDAS,FECHA_MATRICULACION,DESPLAZAMIENTO,COMBUSTIBLE);
   this.PRECIO=PRECIO;

    }
    
    public void MostrarLancha()
    {
        int FA=getCAPACIDAD()-getN_PASAJEROS();
        System.out.print("\n----ES UNA LANCHA----");
        System.out.print("\nUNA LANCHA CUESTA APROXIMADAMENTE $"+PRECIO);
        
        System.out.println("\n\nFECHA DE LA MATRICULA:  "+getFECHA_MATRICULACION());
        System.out.println("DESPLAZAMIENTO:  "+getDESPLAZAMIENTO());
        System.out.println("TIPO DE COMBUSTIBLE:  "+getCOMBUSTIBLE());
        System.out.println("CAPACIDAD DEL VEHICULO:  "+getCAPACIDAD());
        System.out.println("NUMERO DE PASAJEROS A BORDO:  "+getN_PASAJEROS());
        System.out.println("NUMERO DE RUEDAS:  "+getRUEDAS());
        System.out.println("*A TU LANCHA LE FALTAN "+FA+" PASAJEROS PARA LLENARSE");


      
    }
    
}
