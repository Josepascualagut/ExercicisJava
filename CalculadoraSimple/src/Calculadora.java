import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1-sumar\n2-restar\n3-multiplicar\n4-dividir"); // es mostra el menu

        System.out.println("Numero 1: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Numero 2: ");
        float numero2 = scanner.nextFloat();

        int opcion = scanner.nextInt(); // l'usuari escull una opcio
        float n1 = 0f;
        float n2 = 0f;

        switch (opcion) {
            case 1:
                System.out.println("sumar" + (n1 + n2));
                break;
            case 2:
                System.out.println("restar" + (n1 - n2));
                break;
            case 3:
                System.out.println("multiplicar" + (n1 * n2));
                break;
            case 4:
                System.out.println("dividir" + (n1 / n2));
                break;
            default:
                System.out.println("el numero no es valido");
        }
    }
}
