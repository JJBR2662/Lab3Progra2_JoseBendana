package lab3progra2josebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Progra2JoseBendaña {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        // clases: Concesionaria, Clientes, Vehiculo, Carro, Camion de carga, bus, motocicleta, bici
        ArrayList<Concesionaria> concesionarias = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        int opcion;
        do {
            System.out.println("""
                               1- CRUD Concesionaria
                               2- CRUD Clientes
                               3- CRUD Vehiculos
                               4- Compra/Venta de vehículos por parte de un cliente
                               5- Salir
                               """);
            System.out.print("Ingrese una opcion: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    concesionarias = concesionario(concesionarias);
                    break;
                case 2:
                    int client;
                    do {
                        System.out.println("""
                                           1- Crear Cliente
                                           2- Eliminar Cliente""");
                        System.out.println("Ingrese una opcion");
                        client = enteros.nextInt();
                        switch (client) {
                            case 1:
                                System.out.print("Ingrese el nombre: ");
                                String name = orac.nextLine();
                                System.out.print("Ingrese el saldo: ");
                                double saldo = dobles.nextDouble();
                                clientes.add(new Cliente(clientes.size() + 1, name, saldo));
                                System.out.println("Se ha aniadido el cliete correctamente");
                                break;
                            case 2:
                                if (clientes.isEmpty()) {
                                    System.out.println("Esta lista esta vacia");
                                } else {
                                    int op;
                                    do {
                                        for (Cliente f : clientes) {
                                            System.out.println(clientes.indexOf(f) + "- " + f);
                                        }
                                        System.out.println("Ingrese que cliente quiere eliminar: ");
                                        op = enteros.nextInt();
                                        if (op >= clientes.size() || op < 0) {
                                            System.out.println("Opcion no valida, ingrese una correcta");
                                        }
                                    } while (op >= clientes.size() || op < 0);
                                    clientes.remove(op);
                                    System.out.println("Se ha borrado correctamente");
                                }
                                break;

                            default:
                                System.out.println("Opcion no valida, ingrese de nuevo");
                                break;
                        }
                    } while (client > 2 || client < 1);
                    break;
                case 3:
                    int cual;
                    do {
                        System.out.println("""
                               1- Crear Vehiculo
                               2- Modificar Vehiculo
                               3- Eliminar Vehiculo""");
                        System.out.print("Ingrese una opcion: ");
                        cual = enteros.nextInt();
                        switch (cual) {
                            case 1:
                                if (concesionarias.isEmpty()) {
                                    System.out.println("No se puede crear carro, no hay donde tirarlo");
                                } else {
                                    System.out.print("Ingrese el color del vehiculo: ");
                                    String color = orac.nextLine();
                                    System.out.print("Ingrese la marca del vehiculo: ");
                                    String marca = orac.nextLine();
                                    System.out.print("Ingrese el modelo del vehiculo: ");
                                    String modelo = orac.nextLine();
                                    System.out.print("Ingrese el anio de fabricacion: ");
                                    int anio = enteros.nextInt();
                                    System.out.print("Ingrese el precio del vehiculo: ");
                                    double precio = dobles.nextDouble();
                                    int cantllantas;
                                    do {
                                        System.out.print("Ingrese la cantidad de llantas [2 o 4]: ");
                                        cantllantas = enteros.nextInt();
                                        if (cantllantas > 4 || cantllantas == 3 || cantllantas < 2) {
                                            System.out.println("Cantidad de llantas no valida");
                                        }
                                    } while (cantllantas > 4 || cantllantas == 3 || cantllantas < 2);
                                    if (cantllantas == 2) {
                                        int dos;
                                        do {
                                            System.out.println("""
                                                               1- Motocicleta
                                                               2- Bicicleta""");
                                            System.out.print("Ingrese que vehiculo de dos llantas desea crear: ");
                                            dos = enteros.nextInt();
                                            switch (dos) {
                                                case 1:
                                                    System.out.print("Ingrese el desplazamiento del motor: ");
                                                    String desp = orac.nextLine();
                                                    char resp;
                                                    do {
                                                        System.out.print("Es electrica [s/n]? ");
                                                        resp = car.next().charAt(0);
                                                        if (resp != 's' || resp != 'S' || resp != 'n' || resp != 'N') {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (resp != 's' || resp != 'S' || resp != 'n' || resp != 'N');
                                                    boolean seraelectrica;
                                                    if (resp == 's' || resp == 'S') {
                                                        seraelectrica = true;
                                                    } else {
                                                        seraelectrica = false;
                                                    }
                                                    vehiculos.add(new Motocicleta(desp, seraelectrica, color, marca, modelo, anio, precio, cantllantas));
                                                    int quecon;
                                                    do {
                                                        for (Concesionaria f : concesionarias) {
                                                            System.out.println(concesionarias.indexOf(f) + "- " + f);
                                                        }
                                                        System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                                        quecon = enteros.nextInt();
                                                        if (quecon >= concesionarias.size() || quecon < 0) {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (quecon >= concesionarias.size() || quecon < 0);
                                                    concesionarias.get(quecon).getCarros().add(new Motocicleta(desp, seraelectrica, color, marca, modelo, anio, precio, cantllantas));

                                                    System.out.println("Se ha agregado la motocicleta perfectamente");
                                                    break;
                                                case 2:
                                                    System.out.print("Ingrese la descrpcion de la bicicleta: ");
                                                    String desc = orac.nextLine();
                                                    System.out.print("Ingrese el radio de la rueda: ");
                                                    double radio = dobles.nextDouble();
                                                    int cual2;
                                                    do {
                                                        System.out.println("""
                                                                           1- BMX
                                                                           2- De Calle""");
                                                        System.out.print("Ingrese el tipo de bicicleta: ");
                                                        cual2 = enteros.nextInt();
                                                        if (cual2 > 2 || cual2 < 1) {
                                                            System.out.println("Opcionno valida, ingrese una correcta");
                                                        }
                                                    } while (cual2 > 2 || cual2 < 1);
                                                    String tipo;
                                                    if (cual2 == 1) {
                                                        tipo = "BMX";
                                                    } else {
                                                        tipo = "De calle";
                                                    }
                                                    vehiculos.add(new Bicicleta(desc, radio, color, marca, modelo, anio, precio, cantllantas, tipo));
                                                    int quecon2;
                                                    do {
                                                        for (Concesionaria f : concesionarias) {
                                                            System.out.println(concesionarias.indexOf(f) + "- " + f);
                                                        }
                                                        System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                                        quecon2 = enteros.nextInt();
                                                        if (quecon2 >= concesionarias.size() || quecon2 < 0) {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (quecon2 >= concesionarias.size() || quecon2 < 0);
                                                    concesionarias.get(quecon2).getCarros().add(new Bicicleta(desc, radio, color, marca, modelo, anio, precio, cantllantas, tipo));
                                                    System.out.println("Se ha agregado la bicicleta perfectamente");
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida, ingrese de nuevo");
                                                    break;
                                            }
                                        } while (dos > 2 || dos < 1);
                                    } else {
                                        int op3;
                                        do {
                                            System.out.println("""
                                                               1- Carro
                                                               2- Camion de carga
                                                               3- Bus""");
                                            System.out.print("Ingrese que vahiculo de 4 ruedas quiere agregar: ");
                                            op3 = enteros.nextInt();
                                            switch (op3) {
                                                case 1:
                                                    System.out.print("Ingrese la cantidad de puertas: ");
                                                    int cantpuertas = enteros.nextInt();
                                                    System.out.print("Ingrese la descripcion del motor: ");
                                                    String descmotor = orac.nextLine();
                                                    System.out.print("Ingrese la velocidad: ");
                                                    int vel = enteros.nextInt();
                                                    vehiculos.add(new Carro(cantpuertas, descmotor, vel, color, marca, modelo, anio, precio, cantllantas));
                                                    int quecon3;
                                                    do {
                                                        for (Concesionaria f : concesionarias) {
                                                            System.out.println(concesionarias.indexOf(f) + "- " + f);
                                                        }
                                                        System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                                        quecon3 = enteros.nextInt();
                                                        if (quecon3 >= concesionarias.size() || quecon3 < 0) {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (quecon3 >= concesionarias.size() || quecon3 < 0);
                                                    concesionarias.get(quecon3).getCarros().add(new Carro(cantpuertas, descmotor, vel, color, marca, modelo, anio, precio, cantllantas));
                                                    System.out.println("Se ha agregado correctmente");
                                                    break;
                                                case 2:
                                                    char resp3;
                                                    System.out.println("Ingrese el volumen máximo de carga: ");
                                                    int volmax = enteros.nextInt();
                                                    System.out.println("Ingrese la altura: ");
                                                    int altura = enteros.nextInt();
                                                    do {
                                                        System.out.println("Tiene retroexcavadora[s/n]: ");
                                                        resp3 = car.next().charAt(0);
                                                        if (resp3 != 's' || resp3 != 'S' || resp3 != 'n' || resp3 != 'N') {
                                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                                        }
                                                    } while (resp3 != 's' || resp3 != 'S' || resp3 != 'n' || resp3 != 'N');
                                                    boolean tieneretro;
                                                    if (resp3 == 's' || resp3 == 'S') {
                                                        tieneretro = true;
                                                    } else {
                                                        tieneretro = false;
                                                    }
                                                    vehiculos.add(new Camion(volmax, altura, tieneretro, color, marca, modelo, anio, precio, cantllantas));
                                                    int quecon4;
                                                    do {
                                                        for (Concesionaria f : concesionarias) {
                                                            System.out.println(concesionarias.indexOf(f) + "- " + f);
                                                        }
                                                        System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                                        quecon4 = enteros.nextInt();
                                                        if (quecon4 >= concesionarias.size() || quecon4 < 0) {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (quecon4 >= concesionarias.size() || quecon4 < 0);
                                                    concesionarias.get(quecon4).getCarros().add(new Camion(volmax, altura, tieneretro, color, marca, modelo, anio, precio, cantllantas));
                                                    System.out.println("Se ha agregado correctamente");
                                                    break;
                                                case 3:
                                                    System.out.print("Ingrese la cantidad de pasajeros: ");
                                                    int cantpa = enteros.nextInt();
                                                    vehiculos.add(new Bus(cantpa, color, marca, modelo, anio, precio, cantllantas));
                                                    int quecon5;
                                                    do {
                                                        for (Concesionaria f : concesionarias) {
                                                            System.out.println(concesionarias.indexOf(f) + "- " + f);
                                                        }
                                                        System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                                        quecon5 = enteros.nextInt();
                                                        if (quecon5 >= concesionarias.size() || quecon5 < 0) {
                                                            System.out.println("Opcion no valida, intente de nuevo");
                                                        }
                                                    } while (quecon5 >= concesionarias.size() || quecon5 < 0);
                                                    concesionarias.get(quecon5).getCarros().add(new Bus(cantpa, color, marca, modelo, anio, precio, cantllantas));
                                                    System.out.println("Se ha agregado correctamente");
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida, ingrese de nuevo");
                                                    break;

                                            }
                                        } while (op3 > 3 || op3 < 1);
                                    }
                                }
                                break;
                            case 2:
                                int quecon6;
                                do {
                                    for (Concesionaria f : concesionarias) {
                                        System.out.println(concesionarias.indexOf(f) + "- " + f);
                                    }
                                    System.out.print("Ingrese a que concesionario lo quiere agregar: ");
                                    quecon6 = enteros.nextInt();
                                    if (quecon6 >= concesionarias.size() || quecon6 < 0) {
                                        System.out.println("Opcion no valida, intente de nuevo");
                                    }
                                } while (quecon6 >= concesionarias.size() || quecon6 < 0);
                                int queve;
                                do {
                                    for (Vehiculo h : concesionarias.get(quecon6).getCarros()) {
                                        System.out.println(concesionarias.get(quecon6).getCarros().indexOf(h) + "- " + h);
                                    }
                                    System.out.print("Ingrese que carro desea modificar: ");
                                    queve = enteros.nextInt();
                                } while (queve >= concesionarias.get(quecon6).getCarros().size() || queve < 0);
                                if (concesionarias.get(quecon6).getCarros().get(queve) instanceof Carro) {
                                    System.out.print("Ingrese la nueva cantidad de puertas: ");
                                    int cantpuertas = enteros.nextInt();
                                    ((Carro) (concesionarias.get(quecon6).getCarros().get(queve))).setCantpuertas(cantpuertas);
                                    System.out.print("Ingrese la descripcion del motor: ");
                                    String descmotorn = orac.nextLine();
                                    ((Carro) (concesionarias.get(quecon6).getCarros().get(queve))).setDescmotor(descmotorn);
                                    System.out.print("Ingrese la nueva velocidad: ");
                                    int nuevavel = enteros.nextInt();
                                    ((Carro) (concesionarias.get(quecon6).getCarros().get(queve))).setVelocidad(nuevavel);
                                } else if (concesionarias.get(quecon6).getCarros().get(queve) instanceof Camion) {

                                    System.out.print("Ingrese el nuevo volumen maximo: ");
                                    int volmax = enteros.nextInt();
                                    ((Camion) (concesionarias.get(quecon6).getCarros().get(queve))).setVolumenmax(volmax);
                                    System.out.print("Ingrese la nueva altura: ");
                                    int altura = enteros.nextInt();
                                    ((Camion) (concesionarias.get(quecon6).getCarros().get(queve))).setAltura(altura);
                                    char resp4;
                                    do {
                                        System.out.println("Tiene retroexcavadora[s/n]: ");
                                        resp4 = car.next().charAt(0);
                                        if (resp4 != 's' || resp4 != 'S' || resp4 != 'n' || resp4 != 'N') {
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    } while (resp4 != 's' || resp4 != 'S' || resp4 != 'n' || resp4 != 'N');
                                    boolean tieneretro;
                                    if (resp4 == 's' || resp4 == 'S') {
                                        tieneretro = true;
                                    } else {
                                        tieneretro = false;
                                    }
                                    ((Camion) (concesionarias.get(quecon6).getCarros().get(queve))).setTieneexc(tieneretro);

                                } else if (concesionarias.get(quecon6).getCarros().get(queve) instanceof Bus) {
                                    System.out.print("Ingrese la cantidad de pasajeros: ");
                                    int cantpas = enteros.nextInt();
                                    ((Bus) (concesionarias.get(quecon6).getCarros().get(queve))).setCantpas(cantpas);
                                } else if (concesionarias.get(quecon6).getCarros().get(queve) instanceof Motocicleta) {
                                    System.out.println("Ingrese el nuevo desplazamiento del motor: ");
                                    String despmotor = orac.nextLine();
                                    ((Motocicleta) (concesionarias.get(quecon6).getCarros().get(queve))).setDespmotor(despmotor);
                                    char resp;
                                    do {
                                        System.out.print("Es electrica [s/n]? ");
                                        resp = car.next().charAt(0);
                                        if (resp != 's' || resp != 'S' || resp != 'n' || resp != 'N') {
                                            System.out.println("Opcion no valida, intente de nuevo");
                                        }
                                    } while (resp != 's' || resp != 'S' || resp != 'n' || resp != 'N');
                                    boolean seraelectrica;
                                    if (resp == 's' || resp == 'S') {
                                        seraelectrica = true;
                                    } else {
                                        seraelectrica = false;
                                    }
                                    ((Motocicleta) (concesionarias.get(quecon6).getCarros().get(queve))).setElectrica(seraelectrica);
                                } else if (concesionarias.get(quecon6).getCarros().get(queve) instanceof Bicicleta) {
                                    System.out.print("Ingrese una nueva descripcion: ");
                                    String desc = orac.nextLine();
                                    ((Bicicleta) (concesionarias.get(quecon6).getCarros().get(queve))).setDesc(desc);
                                    System.out.print("Ingrese el radio de la rueda: ");
                                    double radio = dobles.nextDouble();
                                    ((Bicicleta) (concesionarias.get(quecon6).getCarros().get(queve))).setRadiorueda(radio);
                                    int cual2;
                                    do {
                                        System.out.println("""
                                                                           1- BMX
                                                                           2- De Calle""");
                                        System.out.print("Ingrese el tipo de bicicleta: ");
                                        cual2 = enteros.nextInt();
                                        if (cual2 > 2 || cual2 < 1) {
                                            System.out.println("Opcion no valida, ingrese una correcta");
                                        }
                                    } while (cual2 > 2 || cual2 < 1);
                                    String tipo;
                                    if (cual2 == 1) {
                                        tipo = "BMX";
                                    } else {
                                        tipo = "De calle";
                                    }
                                    ((Bicicleta) (concesionarias.get(quecon6).getCarros().get(queve))).setTipo(tipo);

                                }
                                break;
                            case 3:
                                int cualcon;
                                int elim;
                                do {
                                    for (Concesionaria f : concesionarias) {
                                        System.out.print(concesionarias.indexOf(f) + "- " + f);
                                    }
                                    System.out.print("Ingrese a que concesionario: ");
                                    cualcon = enteros.nextInt();
                                } while (cualcon >= concesionarias.size() || cualcon < 0);
                                do {
                                    for (Vehiculo f : concesionarias.get(cualcon).getCarros()) {
                                        System.out.println(concesionarias.get(cualcon).getCarros().indexOf(f) + "- " + f);
                                    }
                                    System.out.print("Ingrese que carro quiere eliminar: ");
                                    elim = enteros.nextInt();
                                    if (elim >= concesionarias.get(cualcon).getCarros().size() || elim < 0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                } while (elim >= concesionarias.get(cualcon).getCarros().size() || elim < 0);
                                concesionarias.get(cualcon).getCarros().remove(elim);
                                System.out.println("Se ha eliminado perfectamente");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese de nuevo");
                                break;
                        }

                    } while (opcion > 3 || opcion < 1);
                    break;
                case 4:
                    int cual4;
                    do {
                        System.out.println("""
                                           1- Compra
                                           2- Venta de vehiculos por parte de un cliente""");
                        System.out.print("Ingrese opcion: ");
                        cual4 = enteros.nextInt();
                        switch (cual4) {
                            case 1:
                                int cualcli; 
                                do{
                                    for (Cliente c : clientes) {
                                        System.out.println(clientes.indexOf(c)+"- "+c);
                                    }
                                    System.out.print("Ingrese que cliente quiere comprar: ");
                                    cualcli = enteros.nextInt();
                                    if (cualcli>=clientes.size()||cualcli<0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                }while(cualcli>=clientes.size()||cualcli<0);
                                int quecons;
                                do{
                                    for (Concesionaria j : concesionarias) {
                                        System.out.println(concesionarias.indexOf(j)+"- "+j);
                                    }
                                    System.out.println("Ingrese que consecionario quiere visitar: ");
                                    quecons = enteros.nextInt();
                                    if (quecons>=concesionarias.size()||quecons<0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                }while(quecons>=concesionarias.size()||quecons<0);
                                int queveh;
                                if(concesionarias.get(quecons).getCarros().isEmpty()){
                                    System.out.println("Este concesionario esta vacio");
                                }else{
                                    do{
                                        for (Vehiculo a : concesionarias.get(quecons).getCarros()) {
                                            System.out.println(concesionarias.get(quecons).getCarros().indexOf(a)+"- "+a);
                                        }
                                        System.out.print("Ingrese el vehiculo que quiere comprar: ");
                                        queveh = enteros.nextInt();
                                        if (queveh>=concesionarias.get(quecons).getCarros().size()||queveh<0){
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    }while(queveh>=concesionarias.get(quecons).getCarros().size()||queveh<0);
                                    if (clientes.get(cualcli).getSaldo()>= concesionarias.get(quecons).getCarros().get(queveh).getPrecio()+(concesionarias.get(quecons).getCarros().get(queveh).getPrecio()*0.075)) {
                                        clientes.get(cualcli).setSaldo(clientes.get(cualcli).getSaldo()- concesionarias.get(quecons).getCarros().get(queveh).getPrecio()-(concesionarias.get(quecons).getCarros().get(queveh).getPrecio()*0.075));
                                        clientes.get(cualcli).getCarrosobtenidos().add(concesionarias.get(quecons).getCarros().get(queveh));
                                        concesionarias.get(quecons).setSaldo(concesionarias.get(quecons).getSaldo()+concesionarias.get(quecons).getCarros().get(queveh).getPrecio()+(concesionarias.get(quecons).getCarros().get(queveh).getPrecio()*0.075));
                                        concesionarias.get(quecons).getCarros().remove(queveh);
                                        concesionarias.get(quecons).getClientes().add(clientes.get(cualcli));
                                    }else{
                                        System.out.println("El cliente no tiene suficiente dinero");
                                    }
                                }
                                break;
                            case 2:
                                int quecons2;
                                do{
                                    for (Concesionaria j : concesionarias) {
                                        System.out.println(concesionarias.indexOf(j)+"- "+j);
                                    }
                                    System.out.println("Ingrese que consecionario quiere comprar: ");
                                    quecons2 = enteros.nextInt();
                                    if (quecons2>=concesionarias.size()||quecons2<0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                }while(quecons2>=concesionarias.size()||quecons2<0);
                                int cualcli2; 
                                do{
                                    for (Cliente c : clientes) {
                                        System.out.println(clientes.indexOf(c)+"- "+c);
                                    }
                                    System.out.print("Ingrese que cliente quiere vender: ");
                                    cualcli2 = enteros.nextInt();
                                    if (cualcli2>=clientes.size()||cualcli2<0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                }while(cualcli2>=clientes.size()||cualcli2<0);
                                int queveh2;
                                if (clientes.get(cualcli2).getCarrosobtenidos().isEmpty()){
                                    System.out.println("Este cliente no tiene vehiculos");
                                }else{
                                    do{
                                        for (Vehiculo a : concesionarias.get(quecons2).getCarros()) {
                                            System.out.println(concesionarias.get(quecons2).getCarros().indexOf(a)+"- "+a);
                                        }
                                        System.out.print("Ingrese el vehiculo que quiere comprar: ");
                                        queveh2 = enteros.nextInt();
                                        if (queveh2>=concesionarias.get(quecons2).getCarros().size()||queveh2<0){
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    }while(queveh2>=concesionarias.get(quecons2).getCarros().size()||queveh2<0);
                                    if (concesionarias.get(quecons2).getSaldo()>=clientes.get(cualcli2).getCarrosobtenidos().get(queveh2).getPrecio()){
                                        concesionarias.get(quecons2).setSaldo(concesionarias.get(quecons2).getSaldo()-clientes.get(cualcli2).getCarrosobtenidos().get(queveh2).getPrecio());
                                        concesionarias.get(quecons2).getCarros().add(clientes.get(cualcli2).getCarrosobtenidos().get(queveh2));
                                        clientes.get(cualcli2).setSaldo( clientes.get(cualcli2).getSaldo()+ clientes.get(cualcli2).getCarrosobtenidos().get(queveh2).getPrecio());
                                        clientes.get(cualcli2).getCarrosobtenidos().remove(queveh2);
                                    }
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese de nuevo");
                                break;

                        }
                    } while (cual4 > 2 || cual4 < 1);
                    break;
                case 5:
                    System.out.println("Saliendooooooooo.........");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo");
                    break;
            }

        } while (opcion != 5);
        System.out.println("Salio perfectamente");
    }

    public static ArrayList<Concesionaria> concesionario(ArrayList<Concesionaria> concesionarias) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                                   1- crear
                                   2- modificar
                                   3- eliminar
                                   """);
            System.out.print("Ingrese una opcion: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la concesionaria: ");
                    String nombre = orac.nextLine();
                    System.out.print("Ingrese la direccion de la concesionaria: ");
                    String direc = orac.nextLine();
                    System.out.print("Ingrese el saldo actual: ");
                    double saldo = dobles.nextDouble();
                    concesionarias.add(new Concesionaria(nombre, concesionarias.size() + 1, direc, saldo));
                    System.out.println("Se ha aniadido la concesionaria perfectamente");
                    break;
                case 2:
                    if (concesionarias.isEmpty()) {
                        System.out.println("No hay ningun elemento dentro de esta lista");
                    } else {
                        int cual;
                        do {
                            for (Concesionaria f : concesionarias) {
                                System.out.println(concesionarias.indexOf(f) + "- " + f);
                            }
                            System.out.print("Ingrese cual quiere modificar: ");
                            cual = enteros.nextInt();
                            if (cual >= concesionarias.size() || cual < 0) {
                                System.out.println("Opcion no valida");
                            }
                        } while (cual >= concesionarias.size() || cual < 0);
                        System.out.print("Ingrese la nueva direccion: ");
                        String nuevadirec = orac.nextLine();
                        concesionarias.get(cual).setDireccion(nuevadirec);
                        System.out.println("Se ha modificado perfectamente");
                    }
                    break;
                case 3:
                    if (concesionarias.isEmpty()) {
                        System.out.println("No hay ningun elemento dentro de esta lista");
                    } else {
                        int quitar;
                        do {
                            for (Concesionaria f : concesionarias) {
                                System.out.println(concesionarias.indexOf(f) + "- " + f);
                            }
                            System.out.print("Ingrese cual quiere eliminar: ");
                            quitar = enteros.nextInt();
                            if (quitar >= concesionarias.size() || quitar < 0) {
                                System.out.println("Opcion no valida");
                            }
                        } while (quitar >= concesionarias.size() || quitar < 0);
                        concesionarias.remove(quitar);
                        System.out.println("Se ha borrado perfectamente");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo");
                    break;
            }
        } while (opcion < 1 || opcion > 3);
        return concesionarias;
    }
}
