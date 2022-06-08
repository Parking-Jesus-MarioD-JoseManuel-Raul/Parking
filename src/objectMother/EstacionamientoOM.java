package objectMother;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class EstacionamientoOM {

    public static ArrayList<Estacionamiento> getEstacionamiento() {
        LocalDateTime[] horaEntrada = {LocalDateTime.of(2022, 6, 8, 10, 5), LocalDateTime.of(2022, 6, 8, 11, 5), LocalDateTime.of(2022, 6, 8, 12, 5),
                LocalDateTime.of(2022, 6, 8, 13, 5), LocalDateTime.of(2022, 6, 8, 14, 5), LocalDateTime.of(2022, 6, 8, 15, 5),
                LocalDateTime.of(2022, 6, 8, 16, 5), LocalDateTime.of(2022, 6, 8, 17, 5), LocalDateTime.of(2022, 6, 8, 18, 5)};

        String[] plate = {"124HYT", "842YRO", "942UER", "154OPS", "353JSF", "812JQA", "123FAE", "OIO125",
                "031OOD"};


        ArrayList<Estacionamiento> estacionamientos = new ArrayList<>();

        for (int i = 0; i < plate.length; i++) {
            estacionamientos.add(new Estacionamiento(horaEntrada[i], plate[i]));
        }

        return estacionamientos;
    }

    public static ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados() {
        LocalTime[] horaSalida = {LocalTime.of(11, 5), LocalTime.of(12, 5), LocalTime.of(13, 5),
                LocalTime.of(14, 5), LocalTime.of(15, 5), LocalTime.of(16, 5),
                LocalTime.of(17, 5), LocalTime.of(18, 5), LocalTime.of(19, 5)};


        ArrayList<Estacionamiento> listaEstacionamientos = getEstacionamiento();
        ArrayList<EstacionamientoFinalizado> estacionamientos = new ArrayList<>();

        for (int i = 0; i < listaEstacionamientos.size(); i++) {
            Estacionamiento estacionamiento1 = listaEstacionamientos.get(i);
            estacionamiento1.setStatusEstacionamiento(false);
            estacionamientos.add(new EstacionamientoFinalizado(estacionamiento1, horaSalida[i])); //(horaSalida[i],plate[i]));
        }

        return estacionamientos;
    }

}