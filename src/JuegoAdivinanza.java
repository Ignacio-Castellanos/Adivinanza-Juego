import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random rand = new Random();
        int numeroAdivinar = rand.nextInt(100) + 1;

        System.out.println("Bienvenido al juego de adivinanza de números. Adivina el número entre 1 y 100.");

        // Pedir al usuario que ingrese un número
        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        int intentosMaximos = 10;

        while (intento < intentosMaximos) {
            System.out.print("Intento " + (intento + 1) + ": ");
            int numeroIngresado = scanner.nextInt();

            // Comparar el número ingresado con el número a adivinar
            if (numeroIngresado == numeroAdivinar) {
                System.out.println("¡Felicitaciones! Adivinaste el número en " + (intento + 1) + " intentos.");
                return;
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }

            intento++;
        }

        System.out.println("Lo siento, no pudiste adivinar el número en " + intentosMaximos + " intentos. El número era " + numeroAdivinar + ".");
    }
}

