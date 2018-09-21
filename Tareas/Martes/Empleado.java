public class Empleado{
	private String puesto;
	private String nombre;

	private float sueldo=0;

	public Empleado (String puesto, String nombre, float sueldo){
		this.puesto =puesto;
		this.nombre =nombre;
		this.sueldo = sueldo;
	}

	public void setNombre(String nombre) //setters
	{
		this.nombre = nombre; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setPuesto(String puesto) //setters
	{
		this.puesto = puesto; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}
	public String getPuesto()
	{
		return puesto;
	}

	public void setSueldo(float sueldo) //setters
	{
		this.sueldo = sueldo; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}
	public float getSueldo()
	{
		return sueldo;
	}
}