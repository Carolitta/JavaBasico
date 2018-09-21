public class Producto{
	private String nombre;
	private float precio=0;
	static int contadorP=0;
	public Producto (String nombre, float precio){
	
		this.nombre =nombre;
		this.precio = precio;
		contadorP++;

	}

	public void setNombre(String nombre) //setters
	{
		this.nombre = nombre; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setPrecio(float precio) //setters
	{
		this.precio = precio; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}
	public float getPrecio()
	{
		return precio;
	}

}