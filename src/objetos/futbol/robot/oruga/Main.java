package objetos.futbol.robot.oruga;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.comm.BTConnection;
import lejos.nxt.comm.Bluetooth;
import objetos.futbol.robot.oruga.JugadaPrimitiva;

import lejos.robotics.navigation.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;
import lejos.util.PilotProps;
import lejos.robotics.navigation.Navigator;

public class Main {
	
	public static void main(String[] args) throws Exception   {
	
	Conexion.conexion();
	
		
		/*
	String connected = "Connected";
    String waiting = "Waiting...";
    String closing = "Closing...";
    
	while (true){
		LCD.drawString(waiting,0,0);
		LCD.refresh();

        BTConnection btc = Bluetooth.waitForConnection();
        
		LCD.clear();
		LCD.drawString(connected,0,0);
		LCD.refresh();	

		DataInputStream dis = btc.openDataInputStream();
		DataOutputStream dos = btc.openDataOutputStream();
		
		
			int n = dis.readInt();
			if(n==1){
				
				Chutar.elevacion(50, 4);
			}
			
			dos.writeBoolean(true);
			dos.flush();
		
		LCD.drawString(closing,0,0);
		dis.close();
		dos.close();
		btc.close();
		
	 }
	 */
		/*	
	JugadaPrimitiva.moveradelante();
	
	Thread.sleep(5000);
	
	JugadaPrimitiva.girarD();
	JugadaPrimitiva.girarI();
	JugadaPrimitiva.chutar();
*/
	
	 //DifferentialPilot pilot = new DifferentialPilot(9.5, 3, Motor.A, Motor.B, true);  // parameters in inches
	 //pilot.travel(99);	 
	 /*
	 for (int i = 0; i < 2; i++) {
		 pilot.travel(-100);
	}
	
	
	//Navigator nav = new Navigator( pilot);
	//nav.addWaypoint(100, 100);
	/*
	nav.addWaypoint(0, -100);
	*/
    //nav.followPath();
	//nav.goTo(1000, 0);
	
	 //pilot.travel(-100);
	 //pilot.arcForward(10);
	
	 /*
	 pilot.backward();
	 Thread.sleep(8000);
	 */
	 /*
	 pilot.setRobotSpeed(30);  // cm per second
	 pilot.travel(50);         // cm
	 pilot.rotate(-90);        // degree clockwise
	 pilot.travel(-50,true);  //  move backward for 50 cm
	 while(pilot.isMoving())Thread.yield();
	 pilot.rotate(-90);
	 pilot.rotateTo(270);
	 pilot.steer(-50,180,true); // turn 180 degrees to the right
	 waitComplete();            // returns when previous method is complete
	 pilot.steer(100);          // turns with left wheel stationary
	 Delay.msDelay(1000;
	 pilot.stop();
	 
	*/
	 
	}
}

