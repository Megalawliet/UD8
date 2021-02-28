package ejercicio4;

public class Serie {
	
	final protected int TEMP=4;
	final protected boolean ENTREGA=false;
	
	protected String titulo;
	protected int temporadas; 
	protected boolean entregado; 
	protected String genero;
	protected String creador;


	/**
	 * 
	 */
	public Serie() {
		super();
	}


	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas=TEMP;
		this.genero="";
		this.entregado=ENTREGA;
	}


	/**
	 * @param titulo
	 * @param temporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
	
}
