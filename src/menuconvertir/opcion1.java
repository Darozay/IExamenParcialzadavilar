/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuconvertir;

import java.util.Scanner;

/**
 *
 * @author JADPA-04
 */
public class opcion1 {
    public static void opc1 (){
        Scanner S=new Scanner(System.in);
        double num1, resultado;
        int num2= 1000;
        
        System.out.println("Digite los Kilobyte: ");
        num1=S.nextInt();
        
        resultado =num1 / num2;
        System.out.println("Los byte son: "+resultado);
    }
}
