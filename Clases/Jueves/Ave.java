public class Ave extends Animal{
	//no ponemos piel por que la hereda del padre
	private Piel piel;

	public Ave(int tamano, String color, String colorOjos){
		super(new Plumas(), tamano, color,new Ojos(colorOjos,2));

	}

	public void avanzar(){
		System.out.println("Estoy volando a i destino");
	}
}