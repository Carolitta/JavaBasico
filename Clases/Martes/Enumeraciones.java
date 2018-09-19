public class Enumeraciones{
	
	public enum Semana{
		Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
	}

		public static void main(String[] args) {
			Semana s = Semana.Lunes;//instancia
			//System.out.println("Hoy es: "+ s.toString());//name es un objeto de numeraciones toString es analogo a name 
			
			//values regresa un arreglo con los valores de mi clase enum
			//aunque values tenga un valor en este caso lunes, values regresa un arreglo con los valores

			//ocuparemos un for each 
			for(Semana f:s.values()){
				System.out.println("Hoy es: "+ s.toString());
			}
		}
}