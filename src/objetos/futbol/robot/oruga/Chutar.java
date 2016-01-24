package objetos.futbol.robot.oruga;
import lejos.nxt.*;
public class Chutar{
	//atributos
	private int GradosE;//grados de elevacion
	private float VelocidadC;// velocidad del chute en grados por segundo 
	
	//set and get
	public int getGradosE() {
		return GradosE;
	}

	public void setGradosE(int gradosE) {
		GradosE = gradosE;
	}


	public float getVelocidadC() {
		return VelocidadC;
	}


	public void setVelocidadC(float velocidadC) {
		VelocidadC = velocidadC;
	}


	/*metodo para chutar, donde 
	GE = Angulo de elevacion de la palanca   
	VC = Velocidad chute , donde 360 equivale a una vuelta por segundo
	*/
	public static void elevacion(int GE, float VC) throws InterruptedException {
		Motor.C.setSpeed(VC);
		Motor.C.rotate(-GE);		
	//	Thread.sleep(1000);
		Motor.C.rotate(GE);
		
	}


}