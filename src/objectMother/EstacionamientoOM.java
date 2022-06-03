package objectMother;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Estacionamiento;

public class EstacionamientoOM {

public static List<Estacionamiento> getEstacionamiento(){
	LocalDateTime horaEntrada []= {LocalDateTime.now().plusMinutes(20)};

	String[] plate= {"124HYT", "842YRO", "942UER", "154OPS", "353JSF", "812JQA", "123FAE", "OIO125", 
	 "031OOD"};
	
	
	
	ArrayList<Estacionamiento> estacionamientos = new ArrayList<>();
	
	for (int i = 0; i < plate.length; i++) {
		estacionamientos.add(new Estacionamiento(horaEntrada[i],plate[i]));
	}
	
return estacionamientos;	
}
}