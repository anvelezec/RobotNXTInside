package objetos.futbol.robot.oruga;

import objetos.futbol.robot.oruga.Chutar;
import objetos.futbol.robot.oruga.GirarD;
import objetos.futbol.robot.oruga.GirarI;
import objetos.futbol.robot.oruga.MoverAdelante;
import objetos.futbol.robot.oruga.MoverAtras;

public class JugadaPrimitiva {

	/*metodo para chutar, donde 
	GE = Angulo de elevacion de la palanca   
	VC = Velocidad chute , donde 360 equivale a una vuelta por segundo
	*/
	public static  void chutar() throws InterruptedException{
		Chutar.elevacion(40, 360*5);
	}
	
	
	/*
	 * metodo para girar, donde este simpre gira 90 grados
	*/
	public static  void girarD() throws InterruptedException{
		
		GirarD.rotacion();
		
	}
	
	
	/*
	 * metodo para girar, donde este simpre gira 90 grados
	*/
	public static  void girarI() throws InterruptedException{
		
		GirarI.rotacion();
	}
	
	
	/*metodo para moveradelante, donde 
	distancia es la distancia deseada a a vanzar. La conversion es :
	distancia=100  euivale a 34 cm
	*/
	public static  void moveradelante(int distancia) throws InterruptedException{
		
		MoverAdelante.aceleracion( distancia);
	}
	
	/*metodo para moveratas, donde 
	distancia es la distancia deseada a avanzar. La conversion es :
	distancia=100  euivale a 34 cm
	*/
	public static  void moveratras(int distancia) throws InterruptedException{
		
	   MoverAtras.aceleracion(distancia);
	}
	
}
