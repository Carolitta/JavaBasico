public class CalculadoraMatrices{
	//int[]arreglo01;
	//int arreglo[]= new int[10];
	public static void main(String[] args) {
		
	
		int suma=0;
		int arreglo[]={1,2,3,4,5};
		for(int elemento : arreglo){
			suma=suma + elemento;
		}
		System.out.println(suma);
		System.out.println(arreglo.length);
	}
}