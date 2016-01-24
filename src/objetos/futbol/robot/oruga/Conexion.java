package objetos.futbol.robot.oruga;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.comm.BTConnection;
import lejos.nxt.comm.Bluetooth;

/*
 * Clase que contiene metodo conexion el cual me permite escuchar 
 * una conexion bluetooth, recivir una orden y verificar la orden
 */
public class Conexion {
	
	public static void conexion() throws Exception{
		String connected = "Connected";
        String waiting = "Waiting...";
       
        
		while (true){
			LCD.drawString(waiting,0,0);
			LCD.refresh();

	        BTConnection btc = Bluetooth.waitForConnection();
	        
			LCD.clear();
			LCD.drawString(connected,0,0);
			LCD.refresh();	

			DataInputStream dis = btc.openDataInputStream();
			DataOutputStream dos = btc.openDataOutputStream();
			
			
				int lectura = dis.readInt();
				
				int n=(int) Math.floor(lectura/100);
				int v=(int) lectura-n*100;
				
				if(n==1){
				    JugadaPrimitiva.moveradelante(v);
					dos.writeBoolean(true);
					dos.flush();
				}
				else if (n==2){
					JugadaPrimitiva.girarI();				
					dos.writeBoolean(true);
					dos.flush();
				}
				else if(n==3){
					    JugadaPrimitiva.girarD();				
						dos.writeBoolean(true);
						dos.flush();
				}
				else if(n==4){
					JugadaPrimitiva.moveratras(v);
					dos.writeBoolean(true);
					dos.flush();
				}
				else if(n==5){
					JugadaPrimitiva.chutar();
					dos.writeBoolean(true);
					dos.flush();
				}
				
               //Cerrando conexion
			    dis.close();
				dos.close();
				btc.close();
			
		}
	}
}
