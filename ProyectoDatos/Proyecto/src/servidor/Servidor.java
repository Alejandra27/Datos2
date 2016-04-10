package servidor;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Servidor {

	public static final int PUERTO = 1521;

	private ServerSocket servidor;
	private Conexion con;

	private void procesar() {
		while(true){
			try {
				Socket cliente = servidor.accept();
			    DataInputStream in = new DataInputStream(cliente.getInputStream());
			    DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
//inString  outString outObhect
                Runnable  run = new HiloServidor(con, in, out);
                Thread hilo = new Thread(run);
                hilo.start();
			    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Servidor() {
		try {

			servidor = new ServerSocket(PUERTO + 1);
			con = new Conexion("jdbc:oracle:thin:@localhost:1521:xe", "Pepee", "qwerty");

			/*
			 * st = conexion.createStatement(); ResultSet res = null; res =
			 * st.executeQuery("SELECT * FROM PASAJEROS");
			 * 
			 * while (res.next()) { String nombre = res.getString("NOMBRE");
			 * String cedula = res.getString("CEDULA"); String silla =
			 * res.getString("SILLA"); String genero = res.getString("GENERO");
			 * String edad = res.getString("EDAD");
			 * 
			 * System.out.println("Nombre:" + " " + nombre + " " + "| " + "ID:"
			 * + " " + cedula + " " + "| " +"Silla:" + " " + silla + " " + "| "
			 * + "Genero:" + " " + genero + " " + "| " +"Edad:" + " " + edad); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Servidor ns = new Servidor();
		ns.procesar();
	}

}
