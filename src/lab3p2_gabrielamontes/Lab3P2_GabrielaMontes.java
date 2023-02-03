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
                    cliente(clientes);
                    //clientes
                    break;
                case 3:
                    if (concesionarias.size() > 0) {

                    } else {
                        System.out.println("Opcion no disponible hasta que se creen concesionarias. ");
                    }
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
    //comprar y vender
    static void compraryvender(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--menu--");
        System.out.println("1. Comprar");
        System.out.println("2. Vender");
        System.out.println("3. Salir");;
        int op = entrada.nextInt();
        while (op != 3) {
            switch (op) {
                case 1:
                    
                    //comprar
                    break;
                case 2:
                    //vender
                    break;
    }
             System.out.println("--menu--");
        System.out.println("1. Comprar");
        System.out.println("2. Vender");
        System.out.println("3. Salir");;
        op = entrada.nextInt();
        }
    }
    static void comprar (ArrayList<Concesionaria> concesionarias, ArrayList<Cliente> clientes){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Clientes");
        listarclientes(clientes);
        System.out.println("Ingrese la posicion del clientes");
        int poscliente = entrada.nextInt();
        if (poscliente<clientes.size()) {
        listarcons(concesionarias);
        System.out.println("Escriba la posición de la concesionaria que quiere elegir. ");
         int op = entrada.nextInt();
        if (op<concesionarias.size()) {
            for (Object o : concesionarias.get(op).getVehiculos()) {
                System.out.println("" + concesionarias.get(op).getVehiculos().indexOf(o) + " " + o);
            }
            System.out.println("Ingrese la posicion del vehiculo que quiere comprar ");
            int pos = entrada.nextInt();
            if (pos<concesionarias.get(op).getVehiculos().size()) {
                if (clientes.get(poscliente).getSaldo()>=concesionarias.get(op).getVehiculos().get(pos).getPrecio()) {
                    double nsaldo=((clientes.get(poscliente).getSaldo())-(concesionarias.get(op).getVehiculos().get(pos).getPrecio()));
                    clientes.get(poscliente).setSaldo(nsaldo);
                    double ncons=nsaldo*0.075;
                    double nsaldocons=concesionarias.get(op).getSaldo()+ncons;
                    concesionarias.get(op).setSaldo(nsaldocons);
                    concesionarias.get(op).getClientes().add(clientes.get(poscliente));
                    clientes.get(poscliente).getVehiculos().add(concesionarias.get(op).getVehiculos().get(pos));
                }
            }
        }else{
            System.out.println("Posicion no valida");
        }
        }else{
            System.out.println("Posicion de cliente no valida");
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
                        System.out.println("Solo se puede modificar la direccion");
                        System.out.println("Ingrese la nueva direccion : ");
                        String direccion = entrada.nextLine();
                        concesionarias.get(pos).setDireccion(direccion);

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
            double sal = entrada.nextDouble();
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

    //clientes
    static void cliente(ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        int op1 = 0;
        while (op1 != 2) {
            System.out.println("--menu--");
            System.out.println("1. Crear");
            System.out.println("2. Eliminar");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    crearcliente(clientes);
                    //crear
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    //listar
                    listarclientes(clientes);
                    System.out.println("Que posicion desea eliminar");
                    int remove = entrada.nextInt();
                    clientes.remove(remove);
                    //eliminar
                    break;
            }
            System.out.println("--menu--");
            System.out.println("1. CRUD Concesionaria");
            System.out.println("2. Salir");
            op1 = entrada.nextInt();
        }
    }

    static void crearcliente(ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        while (op != 2) {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String nom = entrada.nextLine();
            int id = clientes.size() + 1;
            System.out.println("Ingrese el saldo: ");
            double sal = entrada.nextDouble();
            Cliente c = new Cliente(id, nom, sal);
            clientes.add(c);
            System.out.println("--menu--");
            System.out.println("1. Crear");
            System.out.println("2. Salir");
            op = entrada.nextInt();
        }
    }

    static void listarclientes(ArrayList<Cliente> clientes) {
        for (Cliente c : clientes) {
            System.out.println("" + clientes.indexOf(c) + " " + c);
        }
    }

    //vehiculos
    static void vehiculo(ArrayList<Vehiculo> vehiculos, ArrayList<Concesionaria> concesionarias) {
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
                    crearveh(vehiculos, concesionarias);
                    //crear
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    if (vehiculos.size() < 1) {
                        System.out.println("No hay vehiculos para modificar");
                    } else {
                        listarveh(vehiculos);
                        System.out.println("Que desea modificar: 1. Carros, 2. Camiones, 3. Buses, 4. Motocicletas, 5. Bicicletas ");
                        int modop = entrada.nextInt();
                        switch (modop) {
                            case 1:
                                modificarcarros(vehiculos);
                            case 2:
                                modificamiones(vehiculos);
                                break;
                            case 3:
                                modificabus(vehiculos);
                                break;
                            case 4:
                                 modificamoto(vehiculos);
                                break;
                            case 5:
                                modificabici(vehiculos);
                                break;
                        }

                    }
                    //modificar
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    //listar
                    listarveh(vehiculos);
                    System.out.println("Que posicion desea eliminar");
                    int remove = entrada.nextInt();
                    vehiculos.remove(remove);
                    //eliminar
                    break;
            }
            System.out.println("--menu--");
            System.out.println("1. CRUD Vehiculo");
            System.out.println("2. Salir");
            op1 = entrada.nextInt();
        }
    }

    static void crearveh(ArrayList<Vehiculo> vehiculos, ArrayList<Concesionaria> concesionarias) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        while (op != 2) {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese el color: ");
            String col = entrada.nextLine();
            System.out.println("Ingrese la marca: ");
            String mar = entrada.nextLine();
            System.out.println("Ingrese el modelo: ");
            String mod = entrada.nextLine();
            System.out.println("Ingrese el año: ");
            int año = entrada.nextInt();
            System.out.println("Ingrese el precio: ");
            double precio = entrada.nextDouble();
            System.out.println("Ingrese la cantidad de llantas: ");
            int cantidadll = entrada.nextInt();
            while (!((cantidadll == 2) || (cantidadll == 4))) {
                System.out.println("Cabtidad no valida");
                System.out.println("Ingrese la cantidad de llantas: ");
                cantidadll = entrada.nextInt();
            }
            if (cantidadll == 2) {
                System.out.println("1. Motocicleta, 2. Bicicleta");
                int op1 = entrada.nextInt();
                switch (op1) {
                    case 1:
                        System.out.println("Ingrese el desplazamiento del motor:");
                        String dez = entrada.nextLine();
                        System.out.println("Es electrica: 1. si, 2. no");
                        int el = entrada.nextInt();
                        boolean e;
                        if (el == 1) {
                            e = true;
                        } else {
                            e = false;
                        }
                        Motocicleta m = new Motocicleta(dez, e, col, mar, mod, año, precio, cantidadll);
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion de la concesionaria a la cual va a agregar el vehiculo: ");
                        int consmot = entrada.nextInt();
                        concesionarias.get(consmot).getVehiculos().add(m);
                        break;

                    case 2:
                        System.out.println("Ingrese la descripcion:");
                        String des = entrada.nextLine();
                        System.out.println("Ingrese el radio: ");
                        int rad = entrada.nextInt();
                        System.out.println("Tipo: 1. BMX 2. de calle");
                        int tip = entrada.nextInt();
                        String tipo = "";
                        if (tip == 1) {
                            tipo = "BMX";
                        } else {
                            tipo = "de calle";
                        }
                        Bicicleta b = new Bicicleta(des, rad, tipo, col, mar, mod, año, precio, cantidadll);
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion de la concesionaria a la cual va a agregar el vehiculo: ");
                        int consbic = entrada.nextInt();
                        concesionarias.get(consbic).getVehiculos().add(b);
                        break;
                }
            } else {
                System.out.println("1. Carro, 2. Camion, 3. Bus");
                int op3 = entrada.nextInt();
                switch (op3) {
                    case 1:
                        System.out.println("--Carro--");
                        System.out.println("Ingrese la descripcion del motor:");
                        String motor = entrada.nextLine();
                        System.out.println("Ingrese la cantidad de puertas: ");
                        int puer = entrada.nextInt();
                        System.out.println("Ingrese la velocidad maxima : ");
                        int vel = entrada.nextInt();
                        Carro car = new Carro(puer, motor, vel, col, mar, mod, año, precio, cantidadll);
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion de la concesionaria a la cual va a agregar el vehiculo: ");
                        int conscar = entrada.nextInt();
                        concesionarias.get(conscar).getVehiculos().add(car);
                        break;
                    case 2:
                        System.out.println("--Camion--");
                        System.out.println("Ingrese el volumen maximo de carga:");
                        int vol = entrada.nextInt();
                        System.out.println("Ingrese la altura:");
                        int alt = entrada.nextInt();
                        System.out.println("Tiene retroexcavadora: 1. si, 2. no");
                        int re = entrada.nextInt();
                        boolean r;
                        if (re == 1) {
                            r = true;
                        } else {
                            r = false;
                        }
                        Camion cam = new Camion(vol, alt, r, col, mar, mod, año, precio, cantidadll);
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion de la concesionaria a la cual va a agregar el vehiculo: ");
                        int conscam = entrada.nextInt();
                        concesionarias.get(conscam).getVehiculos().add(cam);
                        break;
                    case 3:
                        System.out.println("--Bus--");
                        System.out.println("Ingrese la cantidad de pasajeros:");
                        int cantpas = entrada.nextInt();
                        Bus b = new Bus(cantpas, col, mar, mod, año, precio, cantidadll);
                        listarcons(concesionarias);
                        System.out.println("Ingrese la posicion de la concesionaria a la cual va a agregar el vehiculo: ");
                        int consbus = entrada.nextInt();
                        concesionarias.get(consbus).getVehiculos().add(b);
                        break;
                }

                System.out.println("--menu--");
                System.out.println("1. Crear");
                System.out.println("2. Salir");
                op = entrada.nextInt();
            }
        }
    }

    static void listarveh(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            System.out.println("" + vehiculos.indexOf(v) + " " + v);
        }
    }

    static void modificarcarros(ArrayList<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Carro--");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Carro) {
                System.out.println("" + vehiculos.indexOf(v) + " " + v);
            }
        }
        System.out.println("Ingrese la posicion que quiere modificar:");
        int pos = entrada.nextInt();
        System.out.println("Que desea modificar 1. descripcion del motor, 2. cantidad de puertas,3. velocidad maxima");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese la nueva descripcion del motor:");
                String motor = entrada.nextLine();
                ((Carro) vehiculos.get(pos)).setMotor(motor);
                break;

            case 2:
                System.out.println("Ingrese la cantidad de puertas: ");
                int puer = entrada.nextInt();
                ((Carro) vehiculos.get(pos)).setPuertas(puer);
                break;
            case 3:
                System.out.println("Ingrese la velocidad maxima : ");
                int vel = entrada.nextInt();
                ((Carro) vehiculos.get(pos)).setVelocidad(vel);
                break;
        }

    }

    static void modificamiones(ArrayList<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Camion--");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                System.out.println("" + vehiculos.indexOf(v) + " " + v);
            }
        }
        System.out.println("Ingrese la posicion que quiere modificar:");
        int pos = entrada.nextInt();
        System.out.println("Que desea modificar 1. volumen de carga, 2. Altura ,3. Retroexcavadora ");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el volumen maximo de carga:");
                int vol = entrada.nextInt();
                ((Camion) vehiculos.get(pos)).setCarga(vol);
                break;

            case 2:
                System.out.println("Ingrese la altura:");
                int alt = entrada.nextInt();
                ((Camion) vehiculos.get(pos)).setAltura(alt);
                break;
            case 3:
                System.out.println("Tiene retroexcavadora: 1. si, 2. no");
                int re = entrada.nextInt();
                boolean r;
                if (re == 1) {
                    r = true;
                } else {
                    r = false;
                }
                ((Camion) vehiculos.get(pos)).setRetroexcavadora(r);
                break;
        }

    }

    static void modificabus(ArrayList<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Bus--");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Bus) {
                System.out.println("" + vehiculos.indexOf(v) + " " + v);
            }
        }
        System.out.println("Ingrese la posicion que quiere modificar:");
        int pos = entrada.nextInt();
        System.out.println("Ingrese la cantidad de pasajeros:");
        int cantpas = entrada.nextInt();
        ((Bus) vehiculos.get(pos)).setPasajeros(pos);

    }

    static void modificamoto(ArrayList<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Motocicleta--");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Motocicleta) {
                System.out.println("" + vehiculos.indexOf(v) + " " + v);
            }
        }
        System.out.println("Ingrese la posicion que quiere modificar:");
        int pos = entrada.nextInt();
        System.out.println("Que desea modificar: 1. Desplazamiento del motor, 2. Es electrica o no");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el desplazamiento del motor:");
                String dez = entrada.nextLine();
                ((Motocicleta) vehiculos.get(pos)).setDesplazamientomotor(dez);
                break;

            case 2:
                System.out.println("Es electrica: 1. si, 2. no");
                int el = entrada.nextInt();
                boolean e;
                if (el == 1) {
                    e = true;
                } else {
                    e = false;
                }
                ((Motocicleta) vehiculos.get(pos)).setElectrica(e);
                break;

        }
    }

    static void modificabici(ArrayList<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Bicicleta--");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Bicicleta) {
                System.out.println("" + vehiculos.indexOf(v) + " " + v);
            }
        }
        System.out.println("Ingrese la posicion que quiere modificar:");
        int pos = entrada.nextInt();
        System.out.println("Que desea modificar: 1.Descripcion, 2. Radio, 3. Tipo");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese la descripcion:");
                String des = entrada.nextLine();
                ((Bicicleta) vehiculos.get(pos)).setDescripcion(des);
                break;

            case 2:
                System.out.println("Ingrese el radio: ");
                int rad = entrada.nextInt();
                ((Bicicleta) vehiculos.get(pos)).setRadio(rad);
                break;
            case 3:
               entrada = new Scanner(System.in);
                System.out.println("Tipo: 1. BMX 2. de calle");
                int tip = entrada.nextInt();
                String tipo = "";
                if (tip == 1) {
                    tipo = "BMX";
                } else {
                    tipo = "de calle";
                }
                 ((Bicicleta) vehiculos.get(pos)).setTipo(tipo);

        }

    }


}