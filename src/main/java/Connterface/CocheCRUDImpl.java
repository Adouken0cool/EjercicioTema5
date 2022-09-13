package Connterface;

import SinInterface.Coche;

import java.util.List;

public interface CocheCRUDImpl {

    void save(Coche coche);

    List<Coche> findAll();

    void delete (Coche coche);
}
