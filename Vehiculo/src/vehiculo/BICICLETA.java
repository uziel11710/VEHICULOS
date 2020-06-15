
package vehiculo;


    public class BICICLETA extends VEHICULO1 {
        
    int VELOCIDAD=20;

    public BICICLETA(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION,String DESPLAZAMIENTO, String COMBUSTIBLE){
        
    super(CAPACIDAD,N_PASAJEROS,RUEDAS,FECHA_MATRICULACION,DESPLAZAMIENTO,COMBUSTIBLE);
    this.VELOCIDAD=VELOCIDAD;
          
        }

    public void MostrarBicicleta()
    {
        int FA=getCAPACIDAD()-getN_PASAJEROS();
        System.out.print("\n----ES UNA BICICLETA----");
        System.out.print("\nUNA BICICLETA ALCANZA UNA VELOCIDAD DE "+VELOCIDAD+"km/h");
            
        System.out.println("\n\nFECHA DE LA MATRICULA:  "+getFECHA_MATRICULACION());
        System.out.println("DESPLAZAMIENTO:  "+getDESPLAZAMIENTO());
        System.out.println("TIPO DE COMBUSTIBLE:  "+getCOMBUSTIBLE());
        System.out.println("CAPACIDAD DEL VEHICULO:  "+getCAPACIDAD());
        System.out.println("NUMERO DE PASAJEROS A BORDO:  "+getN_PASAJEROS());
        System.out.println("NUMERO DE RUEDAS:  "+getRUEDAS());
        System.out.println("*A TU BICICLETA LE FALTAN "+FA+" PASAJEROS PARA LLENARSE");


      
    }
    
}
