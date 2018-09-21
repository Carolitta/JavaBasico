public class Ejercicio{
	public static void main(String[] args) {
		int arrT [][];
		int arr [][]={{1,2},{4,5}};
		for(int i=0; i<=arr.length; i++){
			for(int j=0; j<=arr.length; j++){
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int j=0; j<=arr.length; j++){
			for(int i=0; i<=arr[0].length; i++){
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}