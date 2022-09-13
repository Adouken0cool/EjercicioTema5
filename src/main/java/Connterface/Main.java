package Connterface;

import SinInterface.Coche;

import java.util.List;

public class Main {
   static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl() {
       @Override
       public void save(Coche coche) {

       }

       @Override
       public List<Coche> findAll() {
           return null;
       }

       @Override
       public void delete(Coche coche) {

       }
   };

    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());

    }
}
