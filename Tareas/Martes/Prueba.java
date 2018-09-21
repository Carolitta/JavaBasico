
public class Prueba{
	public static void main (String[] args){
		Franquicia donRata = new Franquicia("anexo FI",0.0f);
		Franquicia laPape = new Franquicia("a la derecha de don Rata", 0.0f);
		Franquicia doniaPelos = new Franquicia("a la izquierda de don Rata", 0.0f);

		Producto agua = new Producto("Bomnafont",30.0f);
		Producto molletes = new Producto("molletes",15.0f);
		Producto hojas = new Producto("hojas",1.0f);
		Producto impresion = new Producto("impresion",1.0f);

		Empleado e1 = new Empleado("Gerente","Brayan",500.0f);
		Empleado e2 = new Empleado("Gerente","Brayan",500.0f);
		Empleado e3 = new Empleado("Gerente","Brayan",500.0f);
		Empleado e4 = new Empleado("Gerente","Brayan",500.0f);

		agua.setNombre("Bonafont");
		agua.setPrecio(30.0f);
		molletes.setNombre("Molletes");
		molletes.setPrecio(45.0f);
		hojas.setNombre("Hojas");
		hojas.setPrecio(10.0f);
		impresion.setNombre("Impresion");
		impresion.setPrecio(1.0f);		

		e1.setNombre("Brayan");
		e1.setSueldo(500.0f);
		e1.setPuesto("Gerente");
		e2.setNombre("Poli");
		e2.setSueldo(45.0f);
		e2.setPuesto("Cobrador");
		e3.setNombre("Jorge");
		e3.setSueldo(10.0f);
		e3.setPuesto("Cocinero");
		e4.setNombre("Luis");
		e4.setSueldo(1.0f);	
		e4.setPuesto("Despachador");



	}
	

	public void mostrarInfo(){

		//float dineroT=0.0f;

		//this.donRata.dinero = agua.precio+molletes.precio;
		//laPape.dinero = hojas.precio+impresion.precio;
		//dineroT = donRata.dinero+laPape.dinero+doniaPelos.dinero;


	
	} 


}

