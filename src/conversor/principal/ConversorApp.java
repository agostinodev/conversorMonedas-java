package conversor.principal;

import conversor.modelo.Conversion;
import conversor.servicio.ConsultarMoneda;
import conversor.util.Mensaje;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConversorApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        boolean continuar = true;

        while (continuar) {

            System.out.println("---------- MENU ----------");
            System.out.println("1 - Dólar => Peso argentino");
            System.out.println("2 - Peso argentina => Dólar");
            System.out.println("3 - Dólar  => Peso brasileño");
            System.out.println("4 - Peso brasileño => Dólar");
            System.out.println("5 - Dólar => Peso chileno");
            System.out.println("6 - Peso chileno => Dólar");
            System.out.println("7 - Salir");
            System.out.println("Elija una opción válida:");
            int opc = sc.nextInt();


            switch (opc) {
                case 1: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("USD", "ARS");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                    break;
                }
                case 2: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("ARS", "USD");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                    break;
                }
                case 3: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("USD", "BRL");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                    break;
                }
                case 4: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("BRL", "USD");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                    break;
                }
                case 5: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("USD", "CLP");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                }
                case 6: {
                    ConsultarMoneda consulta = new ConsultarMoneda();
                    Conversion conversion = consulta.conversion("CLP", "USD");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double monto = sc.nextDouble();

                    Mensaje msj = new Mensaje();
                    msj.mostrarInfo(conversion, monto);

                }
                case 7: {
                    continuar = false;
                    System.out.println("Programa finalizado.");
                    break;
                }
                default: {
                    System.out.println("La opción es incorrecta.");
                }


            }
        }
    }
}