package interfaces;

/**
 * 
 * @author Maria Alejandra
 * DAO = Data Access Object
 */
public interface AerolineaDAO
{

    boolean insertar(String parametros[]);

    boolean actualizar();

    boolean consultar();

    boolean consultarPorID();

    boolean consultartodos();

    boolean eliminar(int PrimayKey);

}
