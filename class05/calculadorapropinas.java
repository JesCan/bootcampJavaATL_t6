package class05;

import java.util.Scanner;

public class calculadorapropinas {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cuenta de restaurante: ");
        double cuentaRestaurante = dato.nextDouble();
        System.out.println("Ingrese el porcentaje de propina: ");
        double porcentajePropina = dato.nextDouble();
        double montoPropina = cuentaRestaurante * (porcentajePropina/100);
        System.out.println("Monto de cuenta: " + cuentaRestaurante);
        System.out.println("Porcentaje de propina: " + porcentajePropina);
        System.out.println("Monto de propina es: " + montoPropina);

    }
}
