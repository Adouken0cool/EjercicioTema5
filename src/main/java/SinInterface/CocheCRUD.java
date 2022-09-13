package SinInterface;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUD {

    List<Coche> coches = new ArrayList<>();

    public void save(Coche coche){
    coches.add(coche);
    }
    public List<Coche>findAll(){
        return coches;

    }
}
