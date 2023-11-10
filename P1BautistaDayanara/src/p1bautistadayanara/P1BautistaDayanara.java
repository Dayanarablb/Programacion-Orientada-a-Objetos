/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1bautistadayanara;

import java.util.Scanner;

/**
 *
 * @author DAYANARA BAUTISTA
 * FECHA: 08/11/2023
 */
public class P1BautistaDayanara {
//Opcion 1
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();
        
        double suma = numero1 + numero2;
        
        System.out.println("La suma del "+numero1+ " y " + numero2 + "es: "+suma);
        
        
    }
    
}
