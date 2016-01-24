package objetos.futbol.robot.oruga;

import lejos.nxt.Motor;
import lejos.robotics.navigation.*;


/*
 * Este clase me define la estructura de una jugada primitiva mover hacia la adelante
 */
public  class MoverAdelante {
	
	 private int distancia;
	
	 public int getDistancia() {
			return distancia;
		}

		public void setDistancia(int dis) {
			this.distancia = dis;
		}
		

/*
 * Este metodo me define  una jugada primitiva mover hacia la adelante
 */
	public static void aceleracion (int distancia){

		DifferentialPilot pilot = new DifferentialPilot(9.5, 3, Motor.A, Motor.B, true);  // parameters in inches
		pilot.travel(-distancia);
	}

	
	

}
