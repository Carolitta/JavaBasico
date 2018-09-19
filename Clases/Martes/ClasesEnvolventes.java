import java.util.Scanner;// Scanner es una clase, lo ident

public class ClasesEnvolventes{

	public static void main(String[] args) {
		
		double a=6;//tipo de dato primitivo
		Double b;
		b = new Double(a);
		//Intege x= new Integer(6);
		Integer x=6; //boxing

		System.out.println(6);
		Scanner read=new Scanner(System.in);
		

		/***************************************************************/
		//Ejercicio: vamos a convetir un numero ingresado del teclado a binario
		System.out.println("Ingrese un numero");
		int num=read.nextInt();
		System.out.println("Tu numero en binario es: "+Integer.toBinaryString(num));

	}
}