package clases;

public class Vuelo
{

    private int idVuelo;
    private String pasajeros;

    private String origen;
    private String destino;

    public Vuelo(int idVuelo, String pasajero, String origen, String destino)
    {
        this.destino = destino;
        this.pasajeros = pasajero;
        this.idVuelo = idVuelo;

        this.origen = origen;

    }

    public int getIdVuelo()
    {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo)
    {
        this.idVuelo = idVuelo;
    }

    public String getPasajero()
    {
        return pasajeros;
    }

    public void setPasajero(String pasajero)
    {
        this.pasajeros = pasajero;
    }

    public String getOrigen()
    {
        return origen;
    }

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    public String getDestino()
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public Vuelo(int idVuelo)
    {
        super();
        this.idVuelo = idVuelo;
    }

    public Vuelo()
    {
        super();
    }

    public String insertar()
    {
        // TODO Auto-generated method stub
        return "insert into Vuelo values(" + idVuelo + " ',' " + pasajeros
                + " ','" + origen + "','" + destino + "')";
    }

    public String eliminar()
    {
        return "delete from vuelo where idVuelo = " + idVuelo;
    }

    public String actualizar()
    {
        return "update Vuelo set pasajero = " + pasajeros + "where destino ="
                + destino;
    }

    public String consultar()
    {
        return "select * from vuelo" + "  where idVuelo = " + idVuelo;
    }
}
