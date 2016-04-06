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

	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;

	private List<Socket> pasajeros = new LinkedList<Socket>();

	private Socket socketPasajero;
	// private PrintWriter out;
	// private BufferedReader in;

	private PasajeroDAO pasajeroDAO;

	public HiloServidor(Socket soc, List usuarios) throws Exception {
		// pasajeroDAO = new PasajeroDAO(this);
		// socketPasajero = new Socket("localhost", Servidor.PUERTO);
		// out = new PrintWriter(socketPasajero.getOutputStream(), true);
		// in = new BufferedReader(new
		// InputStreamReader(socketPasajero.getInputStream()));

		socket = soc;
		pasajeros = usuarios;

	}

	public void enviarInstruccion(String sql) {
		// out.println(sql);
	}

	public String darRespuestaServer() throws Exception {
		return in.readLine();
	}

	public String consultarCliente(int ID) {
		if (pasajeroDAO.consultar()) {
			return "cliente consultado";
		} else
			return "No se inserto correctamenre";
	}

	public String insertarCliente(String parametros[]) {
		if (pasajeroDAO.insertar(parametros)) {
			return "Se inserto correctamente";
		} else
			return "No se inserto correctamente";
	}

	public String eliminarCliente(int llave) {
		if (pasajeroDAO.eliminar(llave)) {
			return "Se elimino correctamente";
		} else
			return "No se elimino correctamente";
	}

	
	public void run() {
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Bienvenido....");
			while (true) {
				String recibido = in.readUTF();
				for (int i = 0; i < pasajeros.size(); i++) {
					out = new DataOutputStream(pasajeros.get(i).getOutputStream());
					out.writeUTF(recibido);
				}
			}
		} catch (IOException e) {

			for (int i = 0; i < pasajeros.size(); i++) {
				if (pasajeros.get(i) == socket) {
					pasajeros.remove(i);
					break;
				}
			}
		}

	}
}