/**
*Clase Compania
**/
class Compania{
	private int id;
	protected String nombre;
	private int edad;
    private String viaje;

    /**
    *Metodo que recibe como parametros
    *@param id
    *@param nombre
    *@param edad
    **/
	public Compania(int id, String nombre, int edad){
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
    //metodos
	public void bailar(){
		System.out.println("Nos preparamos para el concurso");
	}
	public void calentar(){
		System.out.println("Estamos calentando");
	}
    public void viajar(String viaje){
        System.out.println("Viajando a "+viaje);
    }
    //setters y getters
	int getEdad(){
       return edad; 
    }
    void setEdad( int edad ){
        this.edad = edad;
    }
    String getNombre(){
       return nombre; 
    }
    void setNombre(String nombre ){
        this.nombre = nombre;
    }
    int getId(){
       return id; 
    }
    void setId( int id ){
        this.id = id;
    }

}