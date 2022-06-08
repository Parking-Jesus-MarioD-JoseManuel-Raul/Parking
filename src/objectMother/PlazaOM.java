package objectMother;

import model.Plaza;

import java.util.ArrayList;
import java.util.Random;

public class PlazaOM {
    public static ArrayList<Plaza> getPlazas() {
        ArrayList<Plaza> listaPlazas = new ArrayList<>();
        boolean[] estadoPlaza = {true, false, true, true, false, true, false, false, false, true, true};
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            listaPlazas.add(new Plaza(000 + i, estadoPlaza[i], rnd.nextInt(15)));
        }
        return listaPlazas;
    }
}
