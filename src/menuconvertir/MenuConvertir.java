/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuconvertir;

import java.util.Scanner;
import static menuconvertir.opcion1.opc1;
import static menuconvertir.opcion2.opc2;

/**
 *
 * @author JADPA-04
 */
public class MenuConvertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        int a;
        boolean Salir = false;
        
        while(!Salir){
            System.out.println("Opciones de Convertidor");
              System.out.println("1. Convertir bytes a Kilobytes");
              System.out.println("2. Convertir Kilobytes a Megabytes");
              System.out.println("3. Salir");
            a = S.nextInt();
             
       
        
      switch(a){
                case 1:
                System.out.println("1. Convertir bytes a Kilobytes");
                opc1();
               
                break;
                
                case 2:
                System.out.println("2. Convertir Kilobytes a Megabytes");
                opc2();
                break;
                case 3:
                    
                    System.out.println("3. Salir");
                    Salir=true;
               
                
              
    
}

   
    }

  
    }
}