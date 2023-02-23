package guardador;

import java.util.ArrayList;
import java.util.List;

class Guardador {
    List<Integer> listaguardar = new ArrayList<>();

    void guardar(int i) {
        listaguardar.add(i);
    }

    void mostrar(){
        for (Integer integer : listaguardar) {
            System.out.println(integer);
        }
    }
}

public class Main  {
    public static void main(String[] args) {
        Guardador guardador = new Guardador();

        guardador.guardar(7);
        guardador.guardar(3);
        guardador.guardar(2);

        guardador.mostrar();
    }
}