package lab3progra2josebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Progra2JoseBendaña {

    public static void main(String[] args) {
        // clases: Concesionaria, Clientes, Vehiculo, Carro, Camion de carga, bus, motocicleta, bici
        Scanner menu = new Scanner(System.in);
        ArrayList<Concesionaria> concesionarias = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        int opcion;
        do{
            System.out.println("""
                               1- CRUD Concesionaria
                               2- CRUD Clientes
                               3- CRUD Vehiculos
                               4- Compra/Venta de vehículos por parte de un cliente
                               5- Salir
                               """);
            System.out.print("Ingrese una opcion: ");
            opcion = menu.nextInt();
            switch(opcion){
                case 1:
                    concesionarias = concesionario(concesionarias);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendooooooooo.........");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo");
                    break;
            }
        }while(opcion != 5);
        System.out.println("Salio perfectamente");
    }
    public static ArrayList<Concesionaria> concesionario(ArrayList<Concesionaria> concesionarias){
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        int opcion;
        do{
                System.out.println("""
                                   1- crear
                                   2- modificar
                                   3- eliminar
                                   """);
                System.out.print("Ingrese una opcion: ");
                opcion = enteros.nextInt();
                switch(opcion){
                    case 1:
                        System.out.print("Ingrese el nombre de la concesionaria: ");
                        String nombre = orac.nextLine();
                        System.out.print("Ingrese la direccion de la concesionaria: ");
                        String direc = orac.nextLine();
                        System.out.print("Ingrese el saldo actual: ");
                        double saldo = dobles.nextDouble();
                        concesionarias.add(new Concesionaria(nombre, concesionarias.size()+1, direc, saldo));
                        System.out.println("Se ha aniadido la concesionaria perfectamente");
                        break;
                    case 2:
                        if (concesionarias.isEmpty()){
                            System.out.println("No hay ningun elemento dentro de esta lista");
                        }else{
                            int cual;
                            do{
                                for (Concesionaria f : concesionarias) {
                                    System.out.println(concesionarias.indexOf(f)+"- "+f);
                                }
                                System.out.print("Ingrese cual quiere modificar: ");
                                cual = enteros.nextInt();
                                if (cual>=concesionarias.size()||cual<0) {
                                    System.out.println("Opcion no valida");
                                }
                            }while(cual>=concesionarias.size()||cual<0);
                            System.out.print("Ingrese la nueva direccion: ");
                            String nuevadirec =  orac.nextLine();
                            concesionarias.get(cual).setDireccion(nuevadirec);
                            System.out.print("Ingrese el nuevo saldo: ");
                            double nuevosaldo = dobles.nextDouble();
                            concesionarias.get(cual).setSaldo(nuevosaldo);
                            System.out.println("Se ha modificado perfectamente");
                        }
                        break;
                    case 3:
                        if (concesionarias.isEmpty()){
                            System.out.println("No hay ningun elemento dentro de esta lista");
                        }else{
                            int quitar;
                            do{
                                for (Concesionaria f : concesionarias) {
                                    System.out.println(concesionarias.indexOf(f)+"- "+f);
                                }
                                System.out.print("Ingrese cual quiere eliminar: ");
                                quitar = enteros.nextInt();
                                if (quitar>=concesionarias.size()||quitar<0) {
                                    System.out.println("Opcion no valida");
                                }
                            }while(quitar>=concesionarias.size()||quitar<0);
                            concesionarias.remove(quitar);
                            System.out.println("Se ha borrado perfectamente");
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida, ingrese de nuevo");
                        break;
                }
        }while(opcion<1||opcion>3);
        return concesionarias;
    }
}
