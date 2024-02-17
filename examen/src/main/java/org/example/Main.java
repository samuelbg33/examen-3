package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //

        String cedula;
        LocalDate fecha = LocalDate.now();
        String nombreCliente;

        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="rigo";
        String contrasenaEmpleadoBD="admin444";

        Integer opcion;
        Scanner lea = new Scanner(System.in);

        System.out.println("*****groceria*****");
        System.out.println("Apreciado empleado, inicie sesion por favor: ");
        boolean loginExitoso = false;

        while (!loginExitoso){
            System.out.print("Digite su usuario: ");
            nombreEmpleado=lea.nextLine();
            System.out.print("Digite su contraseña: ");
            contrasenaEmpleado=lea.nextLine();


            //login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)){
                System.out.println("Cargando sistema....");
                loginExitoso = true;
            }else {
                System.out.println("Usuario o contraseña incorrectos");
            }

        }


        do {
            System.out.println("\n ....groceria....");
            System.out.println("1. ingrese orden ");
            System.out.println("2. modificar orden");
            System.out.println("3. terminar orden y calcular todo");
            System.out.println("4. SALIR");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt();

            Integer entradadecangrejodeurrao = 28000;
            Integer escalopesalarigo=35000;
            Integer filetetourdeFrancia = 150000;
            Integer Corvinaderigo = 80000;
            Integer coctelmichelle = 20000;
            Integer jugosdeurrao = 18500;
           /* Integer totalSinPropina;*/
            Integer totalconPropina;

            Integer productoSeleccionado;

            switch (opcion){
                case 1:
                    System.out.println("1. entrada de cangrejo de urrao ($28000");
                    System.out.println("2. escalopes a la rigo ($35000)");
                    System.out.println("3. filete tour de Francia ($150000)");
                    System.out.println("4. Corvina de rigo ($80000)");
                    System.out.println("5. coctel michelle ($20000)");
                    System.out.println("6. jugos de urrao ($18500)");
                    System.out.println("7. terminar pedido");
                    System.out.println("..........................");

                    do {
                        System.out.println("Digite producto deseado: ");
                        productoSeleccionado=lea.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                System.out.print("Digita cuantos entrada de cangrejo de urrao  desea: ");
                                entradadecangrejodeurrao=lea.nextInt();
                                break;
                            case 2:
                                System.out.print("Digita cuantos escalopes a la rigo  desea: ");
                                escalopesalarigo=lea.nextInt();
                                break;
                            case 3:
                                System.out.print("Digita cuantos filete tour de Francia desea: ");
                                filetetourdeFrancia=lea.nextInt();
                                break;
                            case 4:
                                System.out.print("Digita cuantos Corvina de rigo  desea: ");
                                Corvinaderigo=lea.nextInt();
                                break;
                            case 5:
                                System.out.print("Digita cuantas coctel michelle desea: ");
                                coctelmichelle=lea.nextInt();
                                break;
                            case 6:
                                System.out.println("dijita cuantas jugos de urrao desea: ");
                                jugosdeurrao=lea.nextInt();
                                break;
                            case 7:
                                System.out.println("pedido terminado");
                                break;
                            default:
                                System.out.println("Producto no encontrado");
                                break;

                        }
                    }while (productoSeleccionado!= 7);


                    break;
                case 3:
                    Integer totalSinPropina=((entradadecangrejodeurrao*28000)+(escalopesalarigo*35000)+
                            (filetetourdeFrancia*150000)+(Corvinaderigo*80000)+(coctelmichelle*20000)+(jugosdeurrao*18500));

                    System.out.println("Incluye propina");

                    Double totalConPropina=((totalSinPropina)+(totalSinPropina*0.5));


                    System.out.print("Total servicio: "+totalSinPropina);
                    System.out.print("Total Propina: "+totalConPropina);
                    break;


            }
        }while (opcion != 4);





    }
}



