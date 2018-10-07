/**
*Código : Este programa convierte un numero decimal 
* a binario, dado un arreglo de numeros
*
*@autor Montiel Martínez Luis Javier prebe 8
*@autor Rodríguez Dávalos Carolina prebe 20
*@Since 2018-10-2
**/

import java.util.Scanner;
import java.lang.Math;

public class Binarios{

	/**
	*Metodo main 
	*@param args Unused
	*@return Nothing
	**/
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		//Declaracion del arreglo
		int [] numeros = new int[10];

		System.out.print("Digite el tamaño del arreglo: ");
		int lim=sc.nextInt();
		for (i=0;i<lim ;i++ ) {
			System.out.print("[ "+(i+1)+"]  ");
			numeros[i]=sc.nextInt();
		}

		System.out.println("\n*****Binarios*****\n");
		//Uso de metodo para la conversion
		for(i=0; i<lim; i++){
			System.out.println(Integer.toBinaryString(numeros[i]));
		}
	}
}