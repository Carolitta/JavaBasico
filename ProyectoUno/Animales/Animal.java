/**
*Código :
*
*@autor Montiel Martínez Luis Javier prebe 8
*@autor Rodríguez Dávalos Carolina prebe 20
*@Since 2018-10-2
**/

public class Animal{
	//atributos de estancia
	private Piel piel;
	private int tamano;
	private String color;
	private Ojos ojos;


	public boolean equals(Object o){
		if (!(o instanceof Animal)){
			return false;
		}

		Animal animalito = (Animal) o;
		return this.piel.equals(animalito.piel) && this.tamano == animalito.tamano && this.color.equals(animalito.color) && this.ojos.equals(animalito.ojos);
	}


	//constructor, es un método esécial, el regresa una referencia
	public Animal(Piel piel, int tamano, String color, Ojos ojos){
		this.piel = piel;
		this.tamano = tamano;
		this.color = color;
		this.ojos = ojos;
	}

	public void cazar(){
		System.out.println("Estoy cazando");
	}

	public void comer(){
		System.out.println("Estoy comiendo");
	}

	public void crecer(){
		this.tamaño +=1;
	}

	public void avanzar(){

	}

	//metodo toString va hasta abajo
	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos;
	}
}