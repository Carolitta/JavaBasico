import java.util.ArrayList;

public class PMart{

	ArrayList<String> articulo = new ArrayList<String>();
	ArrayList<Integer> precio = new ArrayList<Integer>();
	private int total;

	//setters y getters
	public void setPrecio(int precioA){
		precio.add(precioA);
	}
	public int getPrecio(int n){
		return precio.get(n);
	}

	public void setArticulo(String nombre){
		articulo.add(nombre);
	}
	public String getArticulo(int n){
		return articulo.get(n);
	}

	public void setArticulo(String nombre, int precioA){
		setArticulo(nombre);
		setPrecio(precioA);
	}

	public int getTotal(){
		return total;
	}
	public void muestra(){
		total=0;
		System.out.println("\nProductos: ");
		for (int i =0 ;i<articulo.size() ; i++ ) {
			System.out.println("\nArticulo: "+ articulo.get(i)+"\tCuesta: "+precio.get(i));
			total = total + precio.get(i);
		}
	}

	//metodos
	public void info(){
		total =0;
		System.out.println("\nListado: ");
		for (int i =0 ; i<articulo.size();i++ ) {
			System.out.println("\n"+(i+1)+" Articulo"+articulo.get(i)+"Cuesta: "+precio.get(i));
			total=total+precio.get(i);
		}
	}

	public void remover(int n){
		precio.remove(n-1);
		articulo.remove(n-1);
		System.out.println("Fuera del carro ");
	}

}