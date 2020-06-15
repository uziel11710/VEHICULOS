
package vehiculo;

    public class AUTOBUS extends VEHICULO1 {
    private int L=60; 
      

    public AUTOBUS(int CAPACIDAD, int N_PASAJEROS, int RUEDAS, String FECHA_MATRICULACION,String DESPLAZAMIENTO, String COMBUSTIBLE){
        
    super(CAPACIDAD,N_PASAJEROS,RUEDAS,FECHA_MATRICULACION,DESPLAZAMIENTO,COMBUSTIBLE);
    this.L=L;
    }
    
    public void MostrarAutobus()
    {
        int FA=getCAPACIDAD()-getN_PASAJEROS();
        System.out.print("\n----ES UN AUTOBUS----");
        System.out.print("\nUN AUTOBUS CONSUME "+L+"L DE GASOLINA APROXIMADAMENTE");
        
        System.out.println("\n\nFECHA DE LA MATRICULA:  "+getFECHA_MATRICULACION());
        System.out.println("DESPLAZAMIENTO:  "+getDESPLAZAMIENTO());
        System.out.println("TIPO DE COMBUSTIBLE:  "+getCOMBUSTIBLE());
        System.out.println("CAPACIDAD DEL VEHICULO:  "+getCAPACIDAD());
        System.out.println("NUMERO DE PASAJEROS A BORDO:  "+getN_PASAJEROS());
        System.out.println("NUMERO DE RUEDAS:  "+getRUEDAS());
        System.out.println("*A TU AUTOBUS LE FALTAN "+FA+" PASAJEROS PARA LLENARSE");


      
    }
    
}
    

