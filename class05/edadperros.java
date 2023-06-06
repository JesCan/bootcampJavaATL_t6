package class05;

import java.util.Scanner;

public class edadperros {
    public static void main(String[] args){
        System.out.println("Ingrese la edad de su perro: ");
        Scanner edad = new Scanner(System.in);
        Integer calcularEdad = edad.nextInt() * 7;
        System.out.println("La edad del perro es: " + calcularEdad);
    }
}
