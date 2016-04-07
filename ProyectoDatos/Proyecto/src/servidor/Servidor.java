package servidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Servidor
{

    public static final int PUERTO = 1521;

    Connection conexion;
    Statement st;

    public boolean insertar(String x)
    {
        try
        {
            st = conexion.createStatement();
            st.execute(x);
            st.close();
            st = null;
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean eliminar(String x)
    {
        try
        {
            st = conexion.createStatement();
            st.execute(x);
            st.close();
            st = null;
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public Servidor()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "Pepee", "qwerty");
            System.out.println("Conexion exitosa a la base de datos");
            
            
            

            ServerSocket servidor = new ServerSocket(PUERTO+1);
            System.out.println("El puerto se ha abierto");
            System.out.println("esperando conexion con el cliente");
            //Socket cliente = servidor.accept();
            //System.out.println("nueva conexion con el cliente" + cliente.getInetAddress().getHostAddress());
            //BufferedReader in = new BufferedReader( new InputStreamReader(cliente.getInputStream()));
            //PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

           // String res = conexion.
            //String sql = in.readLine();
            st = conexion.createStatement();
            ResultSet res = null;
            res = st.executeQuery("SELECT * FROM PASAJEROS");

            while(res.next())
            {
            	String nombre = res.getString("NOMBRE");
            	System.out.println(nombre);
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    
    public static void main(String[] args)
    {
        Servidor ns = new Servidor();
    }
}
