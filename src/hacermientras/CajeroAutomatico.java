package hacermientras;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PIN_CORRECTO = 1234; // El PIN correcto
        int pinIngresado; // Variable para almacenar el PIN ingresado
        int intentos = 0; // Contador de intentos máximos
        final int INTENTOS_MAXIMOS = 3; // Máximo de intentos permitidos

        System.out.println("Bienvenido al cajero automático.");

        do {
            // Solicita el ingreso del PIN
            System.out.print("Por favor, ingresa tu PIN: ");
            pinIngresado = scanner.nextInt();
            intentos++; // Incrementa el contador de intentos

            // Verificación
            if (pinIngresado != PIN_CORRECTO) {
                System.out.println("PIN incorrecto. Intenta nuevamente.");
            }

            // Si los intentos superan el límite
            if (intentos == INTENTOS_MAXIMOS && pinIngresado != PIN_CORRECTO) {
                System.out.println("Has superado el número máximo de intentos. Cuenta bloqueada.");
                break;
            }

        } while (pinIngresado != PIN_CORRECTO);

        // Mensaje de éxito
        if (pinIngresado == PIN_CORRECTO) {
            System.out.println("PIN correcto. Accediendo a tu cuenta...");
        }

        scanner.close();
    }
}
