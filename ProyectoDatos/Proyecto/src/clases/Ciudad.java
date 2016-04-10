package clases;

public class Ciudad implements IDTO
{
    private int codigo;
    private String nombre;

    public Ciudad(int codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Ciudad(int codigo)
    {
        super();
        this.codigo = codigo;
    }

    public Ciudad()
    {
        super();
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

	@Override
	public String insertar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actualizar() {
		// TODO Auto-generated method stub
		return null;
	}
}
