class Coche {
    String marca;
    String modelo;
    String logo;

    static class Builder {
        String marca;
        String modelo;
        String logo;

        Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        Builder setLogo(String logo) {
            this.logo = logo;
            return this;
        }

        Coche build() {
            Coche coche = new Coche();
            coche.marca = this.marca;
            coche.modelo = this.modelo;
            coche.logo = this.logo;
            return coche;
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Coche c1 = new Coche.Builder()
                .setMarca("BMW")
                .setModelo("z3")
                .setLogo("8-)")
                .build();

        Coche c2 = new Coche.Builder()
                .setMarca("Audi")
                .setModelo("Q3")
                .setLogo("8-)")
                .build();

        Coche c3 = new Coche.Builder()
                .setMarca("Wolkswagen")
                .setModelo("T-Roc")
                .setLogo("8-)")
                .build();

    }
}