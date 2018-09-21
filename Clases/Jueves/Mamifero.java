public class Mamifero extends Animal{
	//constructor
	public Mamifero(int tamano, String color, String colorOjos, int numOjos){
		super(new Perlo(), tamano, color, new Ojos(colorOjos,numOjos));
	}

	public void avanzar(){
		System.out.println("Camino a mi destino");
	}
}