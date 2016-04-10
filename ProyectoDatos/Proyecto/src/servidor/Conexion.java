package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	private Connection con;

	public Conexion(String url, String usuario, String password) {
		super();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion exitosa a la base de datos");
			System.out.println("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	/**
	 * Ejecuta una instruccion insert, update o delete
	 * @param sql
	 * @return
	 */
	public boolean ejecutaInstruccionSql(String sql) {
		try {
			Statement st = con.createStatement();
			st.execute(sql);
			st.close();
			st = null;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Ejecuta una instruccion select
	 * @param sql
	 * @return
	 */
	public ResultSet ejecutaConsulta(String sql) {
		Statement st=null;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			return null;
		}finally {
			try {
				st.close();
				st = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
