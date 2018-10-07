/**
*Código : Prebemart compras articulos  
*
*@autor Montiel Martínez Luis Javier prebe 8
*@autor Rodríguez Dávalos Carolina prebe 20
*@Since 2018-10-2
**/
import java.util.Scanner;

public class PMartTest{

	public static void m1(){
		System.out.println("\n 1. Agrega al carro");
		System.out.println(" 2. Finalizar compra");
		System.out.println(" 3. Salir ");
	}

	public static void m2(){
		System.out.println("\n 1. Adquirir");
		System.out.println(" 2. Dejar producto");
	}
	/**
	*Metodo main 
	*@param args Unused
	*@return Nothing
	**/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PMart pmart = new PMart();
		boolean bandera = true;
		String articulo;
		int precio;
		int op, np;

		System.out.println("\n\n\t++++PrebeMart++++\n");

		do{

			m1();
			System.out.println("Elija una opcion: ");
			op= sc.nextInt();
			//Casos de seleccion
			switch(op){
				case 1: 
					System.out.println("Ingres el nombre: ");
					articulo = sc.nextLine();
					System.out.println("Cuesta: ");
					precio = sc.nextInt();
					pmart.setArticulo(articulo,precio);
				break;

				case 2: 
					System.out.println("\n Su compra al momento es: ");
					pmart.muestra();
					m2();
					System.out.println(" Elija una opcion");
					op = sc.nextInt();

					switch(op){
						case 1:
							if(pmart.getTotal() > 500){
								System.out.println("No se puede realizar la compra");
								pmart.info();
								do{
									System.out.println(" Que quiere sacar del carro");
									np = sc.nextInt();
									pmart.remover(np);
									System.out.println("Deseas dejar algo mas? \n1. Si\n2. No");
									op=sc.nextInt();

								}while(op == 1);
							} else{
								System.out.println("\nGracias!");
								bandera = false;
							}
						break;
						case 2:
							pmart.info();

							do{
								System.out.println("Que quiere sacar del carro?");
								np= sc.nextInt();
								pmart.remover(np);
								System.out.println("Deseas dejar algo mas? \n1. Si\n2. No");
								op=sc.nextInt();

							}while(op == 1);
						break;
						default:
						System.out.println("opcion incorecta");
					}

				break;
				case 3:
					System.out.println("Lo esperamos :)");
					bandera=false;
				break;
				default:
					System.out.println("opcion incorecta");	
			}

		}while (bandera); 
	}
}