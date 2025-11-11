import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (true) {
            System.out.println("***********************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda");
            System.out.println("\n1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Dólar => Peso mexicano");
            System.out.println("8) Peso mexicano => Dólar");
            System.out.println("9) Salir");
            System.out.print("Elija una opción válida: ");
            System.out.println("\n***********************************");

            int opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 9) {
                System.out.println("Opción inválida. Debe ingresar un número entre 1 y 9.\n");
                continue;
            }


            if (opcion == 9) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            String from = "", to = "";

            switch (opcion) {
                case 1 -> { from = "USD"; to = "ARS"; }
                case 2 -> { from = "ARS"; to = "USD"; }
                case 3 -> { from = "USD"; to = "BRL"; }
                case 4 -> { from = "BRL"; to = "USD"; }
                case 5 -> { from = "USD"; to = "COP"; }
                case 6 -> { from = "COP"; to = "USD"; }
                case 7 -> { from = "USD"; to = "MXN"; }
                case 8 -> { from = "MXN"; to = "USD"; }
                default -> {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue;
                }
            }

            try {
                double resultado = conversor.convertir(from, to, monto);
                System.out.printf("%.2f %s = %.2f %s%n", monto, from, resultado, to);
            } catch (Exception e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}
