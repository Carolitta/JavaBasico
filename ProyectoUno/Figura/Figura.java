/**
*Código: Muestra en pantalla un rombo ingresando 
*el numero que desee el usuario de asteriscos
*
*@autor Montiel Martínez Luis Javier prebe 8
*@autor Rodríguez Dávalos Carolina prebe 20
*@Since 2018-10-2
**/
import java.util.Scanner;

public class Figura{
	/**
	*Metodo main 
	*@param args Unused
	*@return Nothing
	**/
	public static void main(String[] args) {
		int i,j,t,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int n= sc.nextInt();
		System.out.println("\n");

		j=0;
		t=0;
		e=n;
		//La parte posterior del rombo 
		while(j<n){
			for (i=e;i>1 ;i-- ) {
				System.out.print(" ");
			}
			t++;
			for (i=0;i<t ;i++ ) {
				System.out.print("* ");
			}
			System.out.print("\n");
			j++;
			e--;
		}
		e++;
		//la parte inferior del rombo 
		while(j>=0){
			for (i=e;i>0 ;i-- ) {
				System.out.print(" ");
			}
			t--;
			for (i=0;i<t ;i++ ) {
				System.out.print("* ");				
			}		
			System.out.print("\n");
			j--;
			e++;
		}

	}

}