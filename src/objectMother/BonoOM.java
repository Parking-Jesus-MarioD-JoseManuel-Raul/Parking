package objectMother;

import model.Bono;

import java.time.LocalDate;
import java.util.ArrayList;

public class BonoOM {
    public static ArrayList<Bono> getBonosList() {
        ArrayList<Bono> listaBonos = new ArrayList<>();
        listaBonos.add(new Bono("Diario", LocalDate.now(), LocalDate.now().plusDays(1), 15.00));
        listaBonos.add(new Bono("Nocturno", LocalDate.now(), LocalDate.now().plusDays(1), 5.00));
        listaBonos.add(new Bono("FinDeSemana", LocalDate.now(), LocalDate.now().plusDays(2), 20.00));
        return listaBonos;
    }
}
