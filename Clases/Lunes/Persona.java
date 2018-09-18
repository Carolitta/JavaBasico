public class Persona
{
	private int edad;// se recomienda hacerlos privados, y el usuario podra cambiar el valor de la edad y sera por tanto encapsulamiento
	private String nombre;//atributos //que es sobrecarga en java
	static int contador =0;//atributos estaticos son globales son de la clase, no necesitan instacia para accder a ellas

	public Persona (int edad, String nombre)//este es un constructor, nunca va a regresar nada
	{
		this.edad=edad;
		this.nombre=nombre;
		contador++;
	}

	public Persona (){}

	public void respirar() //publico privado o protegido
	{
		System.out.println("Estoy respirando");//metodos
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre) //setters
	{
		this.nombre = nombre; //forma de llamar a la mimsma clase con lo que se esta trabajando
	}

	public int getEdad() //getters
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public static int getConta()
	{
		return contador;
	}


}