package class05;

import java.util.Scanner;

public class millasakilometros {
    public static void main(String [] args){
        System.out.println("Ingrese una distancia en millas:");
        Scanner millas = new Scanner(System.in);
        Double convertirAKilometro = (millas.nextInt() * 1.60934);
        System.out.println("La conversión de millas a KMs es: " + convertirAKilometro);
    }
}