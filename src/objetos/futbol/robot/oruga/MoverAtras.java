package objetos.futbol.robot.oruga;

import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


/*
 * Este clase me define la estructura de una jugada primitiva mover hacia la atras
 */

public class MoverAtras {
	// atributos
	private long distancia;
	
	// set y get 
	public long getDistancia() {
		return distancia;
	}

	public void setDistanca(int distancia) {
		this.distancia = distancia;
	}
	
	/*
	 * Este metdo me define  una jugada primitiva mover hacia la atras
	 */
	public static void aceleracion(int distancia) {
		
		DifferentialPilot pilot = new DifferentialPilot(9.5, 3, Motor.A, Motor.B, true);  
		pilot.travel(distancia);
	}
	

}
