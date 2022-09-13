package SinInterface;

public class Coche {
    String marca;
    String modelo;
    String combustible;
public Coche (){
}

    public Coche(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
