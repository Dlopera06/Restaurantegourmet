import java.util.Scanner;

public class Restaurantegourmet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Almuerzo");
        System.out.println("2. Cena");
        System.out.println("3. Reservar evento");
        System.out.print("Seleccione una opción (1-3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: 
                scanner.nextLine(); 
                System.out.print("Ingrese el día de la semana: ");
                String dia = scanner.nextLine().toLowerCase();

                System.out.print("Ingrese el valor de la cuenta: ");
                double valorAlmuerzo = scanner.nextDouble();

                double descuentoAlmuerzo = 0;

                if (dia.equals("lunes") || dia.equals("miércoles") || dia.equals("viernes")) {
                    descuentoAlmuerzo += 0.10;
                }

                if (valorAlmuerzo > 100000) {
                    descuentoAlmuerzo += 0.05; 
                }

                double totalAlmuerzo = valorAlmuerzo * (1 - descuentoAlmuerzo);
                System.out.println("Total a pagar por el almuerzo: $" + totalAlmuerzo);
                break;

            case 2: 
                System.out.print("Ingrese la hora (formato 24h, solo hora entera, por ejemplo 21): ");
                int hora = scanner.nextInt();

                System.out.print("Ingrese el valor de la cuenta: ");
                double valorCena = scanner.nextDouble();

                double totalCena = valorCena;

                if (hora > 20) {
                    totalCena += valorCena * 0.10;
                }

                if (valorCena > 150000) {
                    totalCena -= valorCena * 0.08; 
                }

                System.out.println("Total a pagar por la cena: $" + totalCena);
                break;

            case 3:
                System.out.print("Ingrese el número de invitados: ");
                int invitados = scanner.nextInt();

                System.out.print("Ingrese el valor total base del evento: ");
                double valorEvento = scanner.nextDouble();

                double descuentoEvento = 0;

                if (invitados > 30) {
                    descuentoEvento = 0.15; 
                                } else if (invitados <= 10) {
                    descuentoEvento = 0; 
                }

                double totalEvento = valorEvento * (1 - descuentoEvento);
                System.out.println("Total a pagar por el evento: $" + totalEvento);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
