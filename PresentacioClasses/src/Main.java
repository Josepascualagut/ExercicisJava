public class Main {
    public static void main(String[] args) {
        // com ho farem a partir de ara
        class Alumno{
            String nombreAlumno;
            float notaAlumno;
            Boolean pasaAlumno;
        }

        Alumno a1 = new Alumno();
        a1.nombreAlumno = "Maria";
        a1.notaAlumno = 7f;
        a1.pasaAlumno = true;

        Alumno a2 = new Alumno();
        a2.nombreAlumno = "Josep";
        a2.notaAlumno = 0f;
        a2.pasaAlumno = false;


        System.out.println(a1.pasaAlumno);
        System.out.println(a2.pasaAlumno);



        // Com ho feiem fins ara
        String nombreAlumno1 = "Maria";

        float notaAlumno1 = 7f;

        boolean pasaAlumno1 = true;

        String nombreAlumno2 = "Josep";

        float notaAlumno2 = 0f;

        boolean passaalumno2 = false;




    }
}