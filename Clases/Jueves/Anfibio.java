public class Anfibio extends Animal{
	public Anfibio(int tamano, String color, String colorOjos){
		super(new Descubierto, tamano, color, new Ojos(colorOjos,2));
	}

	public void avanzar(){
		System.out.println("Salto a mi destino");
	}
}