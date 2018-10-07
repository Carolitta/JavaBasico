/**
*clase ave que extiende de Animal
**/
public class Ave extends Animal{
	//no ponemos piel por que la hereda del padre
	private Piel piel;
	/**
	*@param tamano 
	*@param color
	*@param colorOjos
	**/
	public Ave(int tamano, String color, String colorOjos){
		super(new Plumas(), tamano, color,new Ojos(colorOjos,2));

	}

	public void avanzar(){
		System.out.println("Estoy volando a i destino");
	}
}