/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author pafra
 */
import java.util.Scanner;
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();
        System.out.println("¿Cuál es su hobbie?");
        String hobbie = scan.nextLine();
        System.out.println("¿Cuál es su editor de código preferido?");
        String editor_cod = scan.nextLine();
        System.out.println("¿Que Sistema Operativo utiliza?");
        String so = scan.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scan.nextShort();
        
        
        System.out.println("\nNombre: "+ nombre +"\nApellido: " + apellido +"\nEdad: "+ edad +"\nSu hobbie es: " + hobbie +"\nSu editor de código preferido es: "+editor_cod +"\nEl Sistema Operativo que usa es: "+ so);
        
    }
    
}
