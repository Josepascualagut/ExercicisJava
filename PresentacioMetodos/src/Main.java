public class Main {
    public static void main(String[] args) {
        Soltes soltes = new Soltes();

        int lo = soltes.sumaNumeros(3,4);
        int pa = soltes.sumaNumeros(30,40);

        int sumatotal = soltes.sumaNumeros(lo, pa);

        System.out.println(sumatotal);

    }
}