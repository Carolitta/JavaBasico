/**
*Clase Bailarin que Hereda de Compania
**/
public class Bailarin extends Compania{
	String posicion;

	public Bailarin(int id, String nombre, int edad, String posicion){
		super(id,nombre,edad);
		this.posicion = posicion;
	}
	//metodos
	void bailarLago(){
		System.out.println("Estoy en el lago de los cisnes"+posicion);
	}
	void bailarSalsa(){
		System.out.println("Yo bailo salsa");
	}
	/**
	*Sobeescritura del metodo viajar
	**/
	@Override
	public void viajar(String pais){
		super.viajar(pais);
		System.out.println("Vamos a "+pais);
	}
	
}