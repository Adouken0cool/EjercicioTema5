package SinInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUD();

        Coche toyota = new Coche("Toyota","Corola","Gasolina");
        Coche zuzuki = new Coche("Zuzuki","Celerio","Gasolina");
        Coche chevi = new Coche("Chevrolet","Colorado","Diesel");
        Coche ford = new Coche("Ford","F-150","Diesel");

        cocheCRUD.save(toyota);
        cocheCRUD.save(zuzuki);
        cocheCRUD.save(chevi);
        cocheCRUD.save(ford);

       List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

    }


}
