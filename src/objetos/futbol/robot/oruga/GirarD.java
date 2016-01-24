package objetos.futbol.robot.oruga;

import lejos.nxt.Motor;

/*
 * Est clase me define la estructura de una jugada primitiva girar hacia la derecha
 */

public class GirarD{
	
	/*
	 *  Definicion estructural de girara hacia la derecha
	 */
	
	public static void  rotacion() throws InterruptedException { 
		Motor.B.stop();
		Motor.A.stop();
		Thread.sleep(500);
		Motor.B.setSpeed(360*5);
		Motor.B.forward();
		Thread.sleep(1000);
		Motor.B.stop();
	}
}