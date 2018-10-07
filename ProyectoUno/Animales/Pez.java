public class Pez extends Animal{
	//definimos constructor
	public Pez(int tamano, String color, String colorOjos){
		super(new Escamas(), tamano, color, new Ojos(colorOjos, 2))
	}

	public void avanzar(){
		System.out.println("Nado a mi destino")
	}


}+