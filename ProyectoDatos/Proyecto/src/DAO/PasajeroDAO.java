package DAO;

import java.awt.List;

import clases.IDTO;
import clases.Pasajero;
import interfaces.AerolineaDAO;

public class PasajeroDAO implements AerolineaDAO {


	public List pasajeros;

	public PasajeroDAO() {
	}

	
	//public boolean insertar(IDTO datos, objetos para comucarme con el servidor) {
	public boolean insertar() {
		/*try {
			//Pasajero c = new Pasajero(Integer.parseInt(parametros[0]), parametros[1], parametros[2], parametros[3],
					Integer.parseInt(parametros[4]));
			String sql = c.insertar();
			//objeto que envia .enviarInstruccion(sql);
			String res = socket.darRespuestaServer();
			if (res.equalsIgnoreCase("true")) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			return false;
		}*/
		return true;
	}

	@Override
	public boolean eliminar(int PrimayKey) {
		/*try {
			Pasajero c = new Pasajero(PrimayKey);
			String sql = c.eliminar();
			socket.enviarInstruccion(sql);
			String res = socket.darRespuestaServer();
			if (res != null) {
				if (res.equalsIgnoreCase("true")) {
					return true;
				} else if (res.equals("null")) {
					System.out.println("Respuesta nula ");
					return false;
				} else
					return false;
			} else {
				System.out.println("Error el valor no puede ser nulo");
				return false;
			}

		} catch (Exception e) {
			System.out.println("Error de " + e.getMessage());
			e.printStackTrace();
			return false;
		}*/
		return true;
	}

	public boolean consultar() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean consultarPorID() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean consultartodos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertar(String[] parametros) {
		// TODO Auto-generated method stub
		return false;
	}

}