/**
*Código :Programa que representa los cuatro pilares de la POO
*
*@autor Montiel Martínez Luis Javier prebe 8
*@autor Rodríguez Dávalos Carolina prebe 20
*@Since 2018-10-2
**/
class CompaniaPrueba{
	/**
	*Metodo main 
	*@param args Unused
	*@return Nothing
	**/
	public static void main(String [] args){
		Bailarin cabello = new Bailarin(0234,"cabello",21,"protagonista");
		System.out.println("Bailarin: "+cabello.nombre);
		cabello.bailar();
		cabello.calentar();
		cabello.viajar("Holanda");
	}
}