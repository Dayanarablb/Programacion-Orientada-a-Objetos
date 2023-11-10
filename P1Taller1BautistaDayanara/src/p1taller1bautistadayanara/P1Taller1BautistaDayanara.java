/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1taller1bautistadayanara;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class P1Taller1BautistaDayanara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("******************************************");
        System.out.println("    PROGRAMACION ORIENTADA A OBJETOS      ");
        System.out.println("******************************************");
        System.out.println("         Nombre: Dayanara Bautista        ");
        System.out.println("         Carrera: ITIN                    ");
        System.out.println("         Taller 1                         ");
        System.out.println("         Docente: ING. VERONICA MARTINEZ  ");   
        System.out.println("******************************************");
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
        
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        
        // + Operador de concatenacion
        System.out.println("La suma del "+numero1+ " y " + numero2 + " es: "+suma);
        System.out.println("La resta del "+numero1+ " y " + numero2 + " es: "+resta);
        System.out.println("La multiplicacion del "+numero1+ " y " + numero2 + " es: "+multiplicacion);
        System.out.println("La division del "+numero1+ " y " + numero2 + " es: "+division);
        
        
    }
    
}
