public class Ojos{
	private String color;
	private int cantidad;

	public Ojos(String color, int cantidad){
		this.color= color;
		this.cantidad=cantidad;
	}

	public String toString(){
		return "color: "+this.color+"\nCantidad: "+this.cantidad;
	}
}