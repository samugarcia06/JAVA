package org.politecnicomalaga;

import org.politecnicomalaga.model.Cliente;

import java.util.Scanner;

public class Main {
    private static Cliente cliente1;

    public static void main(String[] args) {
        System.out.println("Introduce tus datos");
        Cliente cliente1= new Cliente("Samuel", "f", "g" , "1","samu","ace" , "04", 18,"juandepito");
        MostrarDatos();

    }
    public static String LeerString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int LeerInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void MostrarDatos(){
        //informacion del cliente
        System.out.println("Información del cliente");
        System.out.println("DNI: " +cliente1.getsDni());
        System.out.println("Nombre :" + cliente1.getsNombre());
        System.out.println("Apellido1 : " + cliente1.getsApellido1());
        System.out.println("Apellido2 :" + cliente1.getsApellido2());
        System.out.println("Telefono :" + cliente1.getsTelefono());
        System.out.println("Dirección : " + cliente1.getsDireccion());
        System.out.println("Fecha Nacimiento : " + cliente1.getsFechaNacimiento());
        System.out.println("Edad : " + cliente1.getiEdad());
    }
    
}