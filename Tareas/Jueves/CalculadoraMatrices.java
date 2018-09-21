/**
 * Tarea 4: Calculadora complejos, por Prebe20
**/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraMatrices{

	public static void main(String[] args) {
		List<List<Integer>> mA = new ArrayList<List<Integer>>();
		List<List<Integer>> mB = new ArrayList<List<Integer>>();
		List<List<Integer>> mC = new ArrayList<List<Integer>>();

		CalculadoraMatrices C = new CalculadoraMatrices();
		Scanner leer = new Scanner(System.in);
		boolean bandera=true;
		int val;
		do{
			System.out.println("\n\n*****************Calculadora Matrices*****************");
			System.out.println("\nIngrese la cantidad de elementos: ");
			int elem=leer.nextInt();
			
			for(int i = 0; i < elem; i++){
				mA.add(new ArrayList<Integer>());
				mB.add(new ArrayList<Integer>());
				mC.add(new ArrayList<Integer>());
			}

			System.out.println("\nIngrese los elementos de la primera matriz: ");
			for(int i = 0; i < elem; i++){
				for(int j = 0; j < elem; j++ ){
					System.out.println("\nIngresando: [" + i + "] [" + j + "]");
					val = leer.nextInt();
					mA.get(i).add(val);
				}
			}

			System.out.println("\nIngrese los elementos de la segunda matriz: ");
			for(int i = 0; i < elem; i++){
				for(int j = 0; j < elem; j++ ){
					System.out.println("\nIngresando: [" + i + "] [" + j + "]");
					val = leer.nextInt();
					mB.get(i).add(val);
				}
			}


			System.out.println("\nElige una opcion: ");
			System.out.println("\n1.Suma");
			System.out.println("\n2.Resta");
			System.out.println("\n3.Multiplicacion");
			System.out.println("\n4.Transposicion");
			System.out.println("\n5.Inversa");
			System.out.println("\n6.Cambiar valores");
			System.out.println("\n7.Salir");
			int op=leer.nextInt;
			
			switch(op){
			case 1:
	            C.Suma();
	            break;
                    
	        case 2:
	            C.Resta();
	            break;

	        case 3:
	            C.Multiplicacion();
	            break;
	                    
	        case 4:
	            C.Transposicion();
	        case 5:
	            C.Inversa();
	            break;
	        case 6:
	            C.CambioValores();
	            break;
	        case 7:
	            System.out.println("\nSaliste!");
	            bandera=false;
	            break;
	        default:
	             System.out.println("Error Ingresa un número del 1 al 4"); 
	        }
		}while(bandera);
	}
	public void Suma(){

	}
	public void Resta(){

	}
	public void Multiplicacion(){

	}
	public void Transposicion(){

	}
	public void Inversa(){

	}
	public void CambioValores(){

	}


}
//System.out.println("");
