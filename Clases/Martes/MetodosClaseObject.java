public class MetodosClaseObject{
	public static void main(String[] args) {
		String cad= "hola";
		String cad2="hola";
		
		if(cad.equals(cad2)){
			System.out.println("Son iguales");
		}
		/*if(cad==cad2){
			System.out.println("Son iguales");
		}*/

		//*******************/
		//ahora con objetos
		String ca= new String("hola");
		String ca2= "hola";

		if(ca.equals(ca2)){
			System.out.println("Son iguales");
		}
	}
}
//instamcia: asignacion de memoria
