/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_gabrielamontes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Lab3P2_GabrielaMontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        ArrayList<Concesionaria> concesionarias = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        menu(vehiculos, concesionarias, clientes);
        // TODO code application logic here
    }
    
    static void menu(ArrayList<Vehiculo> vehiculos, ArrayList<Concesionaria> concesionarias, ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--menu--");
        System.out.println("1. CRUD Concesionaria");
        System.out.println("2. CRUD Clientes");
        System.out.println("3. CRUD Vehiculos");
        System.out.println("4. Compra/venta");
        System.out.println("5. Salir");
        int op = entrada.nextInt();
        while (op != 5) {
            switch (op) {
                case 1:
                    concesionaria(concesionarias);
                    //concesionaria
                    break;
                case 2:
                    //clientes
                    break;
                case 3:
                    //vehiculos
                    break;
                case 4:
                    //compra y venta
                    break;
            }
            System.out.println("--menu--");
            System.out.println("1. CRUD Concesionaria");
            System.out.println("2. CRUD Clientes");
            System.out.println("3. CRUD Vehiculos");
            System.out.println("4. Compra/venta");
            System.out.println("5. Salir");
            op = entrada.nextInt();
        }
    }

    //consecionaria
    static void concesionaria(ArrayList<Concesionaria> concesionarias) {
        Scanner entrada = new Scanner(System.in);
        int op1 = 0;
        while (op1 != 2) {
            System.out.println("--menu--");
            System.out.println("1. Crear");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    crear(concesionarias);
                    //crear
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    if (concesionarias.size() < 1) {
                        System.out.println("No hay concesionarias para modificar");
                    } else {
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion que quiere modificar:");
                        int pos = entrada.nextInt();
                        System.out.println("Que desea modificar: ");
                        System.out.println("1. Saldo: ");
                        System.out.println("2. Direccion: ");
                        int modop = entrada.nextInt();
                        switch (modop) {
                            case 1:
                                System.out.println("Ingrese el nuevo saldo: ");
                                double sal = entrada.nextInt();
                                concesionarias.get(pos).setSaldo(sal);
                                break;
                            case 2:
                                System.out.println("Ingrese la nueva direccion : ");
                                String direccion = entrada.nextLine();
                                concesionarias.get(pos).setDireccion(direccion);
                                break;
                        }
                        
                    }
                    //modificar
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    //listar
                    listarcons(concesionarias);
                    System.out.println("Que posicion desea eliminar");
                    int remove = entrada.nextInt();
                    concesionarias.remove(remove);
                    //eliminar
                    break;
            }
            System.out.println("--menu--");
            System.out.println("1. CRUD Concesionaria");
            System.out.println("2. Salir");
            op1 = entrada.nextInt();
        }
    }
    
    static void crear(ArrayList<Concesionaria> concesionarias) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        while (op != 2) {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String nom = entrada.nextLine();
            int id = concesionarias.size() + 1;
            System.out.println("Ingrese la direccion: ");
            String dir = entrada.nextLine();
            System.out.println("Ingrese el saldo: ");
            double sal = entrada.nextInt();
            Concesionaria c = new Concesionaria(nom, id, dir, sal);
            concesionarias.add(c);
            System.out.println("--menu--");
            System.out.println("1. Crear");
            System.out.println("2. Salir");
            op = entrada.nextInt();
        }
    }
    
    static void listarcons(ArrayList<Concesionaria> concesionarias) {
        for (Concesionaria c : concesionarias) {
            System.out.println("" + concesionarias.indexOf(c) + " " + c);
        }
    }
    
    
}
