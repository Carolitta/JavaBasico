public class Reptil extends Animal{

	//definimos constructor
	public Reptil(int tamano, String color, String colorOjos){
		super(new Escamas(), tamano, color, new Ojos(colorOjos, 2))
	}

	public void avanzar(){
		System.out.println("Camino muy bajo a mi destino")
	}
}