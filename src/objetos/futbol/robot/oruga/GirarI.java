package objetos.futbol.robot.oruga;

import lejos.nxt.Motor;

/*
 * Est clase me define la estructura de una jugada primitiva girar hacia la izquierda
 */


public class GirarI{
	
	/*
	 *  Definicion estructural de girara hacia la izquierda
	 */
	
	public static void  rotacion() throws InterruptedException {//argumentos: grados de rotacion de las llantas, revolcuiones de la llantas angulo por segundo 
		Motor.B.stop();
		Motor.A.stop();
		Thread.sleep(500);
		Motor.A.setSpeed((360*5));//velocidad de los motores
		Motor.A.forward();//marcha adelante del motor A
		Thread.sleep(800);
		Motor.A.stop();
		
	}

}
