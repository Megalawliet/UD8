package ejercicio1;

public class Persona {
	
	final protected String HOMBRE="";
	
	private String nombre;
	private int edad;
	private String DNI;
	String sexo;
	private double peso;
	private double altura;
	/**
	 * @return the nombre
	 */
	public final String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public final int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public final void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the sexo
	 */
	public final String getSexo() {
		return sexo;
		
	}
	/**
	 * @param sexo the sexo to set
	 */
	public final String setSexo(String sexo) {
		this.sexo=HOMBRE;
		return sexo;
	}
	
	
	//geters y setters
	/**
	 * @return the peso
	 */
	public final double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public final void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public final double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public final void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	//constructores
	//Constructor por defecto
	public Persona() {
		
		this.nombre = "";
		this.edad = 25;
		this.DNI = "";
		this.sexo = HOMBRE;
		this.peso = 93.5;
		this.altura = 1.50;
	}
	
	
	
	//Comentario del constructor con todos los atributos
	/**
	 * @param nombre
	 * @param edad
	 * @param dNI
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	
	//Constructor con nombre,edad y sexo
	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = HOMBRE;//valores por defecto
		DNI = "45871236R";
		peso=5.1;
		altura= 1.80;
		
		
	}
	
	
	
	
	//constructor con todos los atributos como parámetros nombre,edad,dni,sexo, peso y altura
	public Persona(String nombre, int edad, String dNI, String sexo, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = HOMBRE;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	
	
	
}