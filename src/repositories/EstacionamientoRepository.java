package repositories;

import model.Estacionamiento;

import java.time.LocalDateTime;

public interface EstacionamientoRepository {
    public Estacionamiento getEstacionamiento(String matricula);
}
