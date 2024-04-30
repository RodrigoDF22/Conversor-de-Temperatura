
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la Temperatura en Grados Celsius: ");
        double celsius = scanner.nextDouble();

//En el siguiente codigo utilizaremos la formula de conversor de temperatura de celsius a fahrenheit.
        int fahrenheit = (int) Math.round ((celsius * 1.8) + 32);


// Imprimra el consola los grados convertidos a Fahrenheit.
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}