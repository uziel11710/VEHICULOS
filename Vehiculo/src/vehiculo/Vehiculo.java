/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */

 public class Vehiculo {
     
      
    public static void main(String[] args) {
        
      for(int x=1; x<11; x++)   
      {
    String F,D,Co;
    int C,P,R
            ;

    Scanner teclado = new Scanner (System.in);
    System.out.print("\n\t******VEHICULO NUMERO  "+x+"******\n");
    
    
    System.out.print("FECHA MATRICULACION: ");
    F=teclado.nextLine();
    System.out.print("DESPLAZAMIENTO: ");
    D=teclado.nextLine();
    System.out.print("COMBUSTIBLE: ");
    Co=teclado.nextLine();
    System.out.print("CAPACIDAD: ");
    C=teclado.nextInt();
    System.out.print("PASAJEROS: ");
    P=teclado.nextInt(); 
    System.out.print("RUEDAS: ");
    R=teclado.nextInt();
    
    
    String V;
    
if(C==4 && (P>0 && P<5) && R==4)
        {
        
    COCHE a= new COCHE(C,P,R,F,D,Co);
    a.MostrarCoche();
        }


else if(C==2 && (P>0 && P<3) && R==2)
        {
            
    MOTO a= new MOTO(C,P,R,F,D,Co);
    a.MostrarMoto();

    }

else if(C==45 && (P>0 && P<46) && R==16)
        {
            
    AUTOBUS a= new AUTOBUS(C,P,R,F,D,Co);
    a.MostrarAutobus();
        
    }
       
else if(C==1 && (P>0 && P<2) && R==2)
        {
           
    BICICLETA a= new BICICLETA(C,P,R,F,D,Co);
    a.MostrarBicicleta();
        
    }

else if(C==5 && (P>0 && P<6) && R==0 && (D.equals("agua") || D.equals("AGUA") || D.equals("Agua")))
        {
           
    LANCHA a= new LANCHA(C,P,R,F,D,Co);
    a.MostrarLancha();
        
    }
else{
    System.out.print("\n\nESE VEHICULO NO ESTA EN MI BASE DE DATOS  :(");
}
    }
      
        }
    
      }
    
    
 
    
 
            
