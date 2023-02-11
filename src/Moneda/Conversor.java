package Moneda;

import java.util.Scanner;

public class Conversor {
    public static void main (String [] args){
        Scanner datos = new Scanner(System.in);
        float cantidad;
        String moneda;
        double conversion;

        System.out.println("CONVERSOR DE MONEDAS");

        System.out.println("La monedas a convertir son: 1.-CAD- DOLAR CANADIENSE\n 2.-AFN- PESO ARGENTINO\n 3.-BOB-PESO BOLIVIANO\n" +
                " 4.-SGD- DOLAR DE SINGAPURE\n 5.-CHF- FRANCO SUIZO");


        System.out.println("Ingrese la abreviatura de moneda a convertir");
        moneda=datos.nextLine();

        System.out.println("Ingrese la cantidad a convertir");
        cantidad=datos.nextFloat();
        if(cantidad>=0){
            switch (moneda){
                case "USD":{
                    System.out.println("La cantidad a convertir es:" + cantidad + "a" + moneda);
                    conversion= (cantidad*1.34);
                    System.out.println("Su moneda es igual a" + conversion + "dolares canadienses");
                }
                case "AFN":{
                    System.out.println("La cantidad a convertir es:" + cantidad + "a" + moneda);
                    conversion=(cantidad*189.11);
                    System.out.println("Su moneda es igual a " + conversion + "pesos Argentinos");
                }
                case "BOB":{
                    System.out.println("La cantidad a convertir es:" + cantidad + "a" + moneda);
                    conversion=(cantidad*34.54);
                    System.out.println("Su moneda es igual a " + conversion + "Boliviano");
                }
                case "SGD":{
                    System.out.println("La cantidad a convertir es:" + cantidad + "a" + moneda);
                    conversion=(cantidad*1.33);
                    System.out.println("Su moneda es igual a" + conversion + "dolares Singapurenses");
                }
                case "CHF":{
                    System.out.println("La cantidad a convertir es:" + cantidad + "a" + moneda);
                    conversion=(cantidad*0.93);
                    System.out.println("Su moneda es igual a" + conversion + " francos Suizos");
                }
                default:System.out.println("Ingrese correctamente la moneda a convertir");
            }
        }else{
            System.out.println("Ingrese una cantidad real");
        }

    }}

