package class05;

import java.util.Scanner;

public class juegonumero {
    public static void main(String[] args){
        System.out.println("Ingrese un número del 1 al 100");
        Scanner cargarNumero = new Scanner(System.in);
        int numero = cargarNumero.nextInt();

        int numeroAleatorio = (int) (Math.random()*99) + 1;

        if(numero != numeroAleatorio){
            System.out.println("El número que ingresaste es: " + numero);
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("No haz acertado");
        } else {
            System.out.println("El número que ingresaste es: " + numero);
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            System.out.println("¡Felicidades! haz acertado con el número aleatorio");
        }
    }
}
