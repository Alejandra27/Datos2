package servidor;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

import DAO.PasajeroDAO;

public class HiloServidor implements Runnable {

	private Conexion con;
	private DataInputStream in;
	private DataOutputStream out;


	private Socket socketPasajero;
	// private PrintWriter out;
	// private BufferedReader in;

	private PasajeroDAO pasajeroDAO;

	public HiloServidor(Conexion con,DataInputStream in, DataOutputStream out) throws Exception {
		// pasajeroDAO = new PasajeroDAO(this);
		// socketPasajero = new Socket("localhost", Servidor.PUERTO);
		// out = new PrintWriter(socketPasajero.getOutputStream(), true);
		// in = new BufferedReader(new
		// InputStreamReader(socketPasajero.getInputStream()));


	}

	private void procesarPeticion() {
		/*
		 * 1. lee un string sql
		 * 2. Clasifica la peticion sql (insert, update o delete) select
		 * 3. Si es (insert, update o delete) ejecuto la instrucion y retorno si o no
		 * 4. si es un select ejecuto la instrucion y retorno objeto con los datos de la consulta o un null;
		*/ 
		
	}

	public void run() {
		procesarPeticion();
	}

}