package class05;

import java.util.Scanner;

public class calculardescuento {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        Double precioProducto = dato.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        Double porcentajeDescuento = dato.nextDouble();
        Double precioFinal = precioProducto - (precioProducto * porcentajeDescuento/100);
        System.out.println("El precio del producto es: " + precioProducto);
        System.out.println("El porcentaje de descuento del producto es: " + (porcentajeDescuento/100));
        System.out.println("El precio final del producto es: "+precioFinal);
    }
}
