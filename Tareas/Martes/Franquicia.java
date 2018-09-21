public class Franquicia{
	private String direccion;
	private float dinero=0;
	static int contadorF=0;
	public Franquicia (String direccion, float dinero){
	
		this.direccion = direccion;
		this.dinero = dinero;
		contadorF++;
	}
	
	public static int getCantidad(){
		return contadorF;
	}
}


