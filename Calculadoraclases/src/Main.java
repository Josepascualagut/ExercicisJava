import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quina operacio vols fer:");
        String signo = scanner.next();

        System.out.println("Numero 1: ");
        float numero1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        float numero2 = scanner.nextInt();


        Calc calc = new Calc();
        if (signo.equals("+")) {
            float sumar = calc.sumar(numero1, numero2);
            System.out.println(sumar);
        } else if (signo.equals("-")) {
            float restar= calc.restar(numero1, numero2);
            System.out.println(restar);
        } else if (signo.equals("*")) {
            float multiplicar = calc.multiplicar(numero1, numero2);
            System.out.println(multiplicar);
        } else if (signo.equals("/")){
            float dividir = calc.dividir(numero1, numero2);
            System.out.println(dividir);
        } else {
            System.out.println("OPERACION NO SOPORTADA");
        }
    }
}