package ejercicio3;

public class Electrodomestico {

	final protected double DEF_PRECIO = 100;
	final protected String DEF_COLOR = "blanco";
	final protected char DEF_CLASE = 'F';
	final protected int DEF_PESO = 5;
	
	protected double precio;
	protected String color;
	protected char clase;
	protected int peso;
	
	
	public Electrodomestico() {
		super();
		this.precio = DEF_PRECIO;
		this.color = DEF_COLOR;
		this.clase = DEF_CLASE;
		this.peso = DEF_PESO;
		precioFinal();
	}
	
	public Electrodomestico(double precio, String color, char clase, int peso) {
		super();
		this.precio = precio;
		this.color = DEF_COLOR;
		this.clase = DEF_CLASE;
		this.peso = peso;
		precioFinal();
	}
	
	public Electrodomestico(double precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.color = DEF_COLOR;
		this.clase = DEF_CLASE;
		precioFinal();
	}
	
	private void precioFinal() {
        switch (clase) {
        case 'A':
            this.precio+=100;                
            break;
        case 'B':
            this.precio+=80;
            break;
        case 'C':
            this.precio+=60;
            break;
        case 'D':
            this.precio+=50;
            break;
        case 'E':
            this.precio+=30;
            break;
        case 'F':
            this.precio+=10;
            break;
        default:
            break;
        }
        if (peso>=0 && peso<=19) {
            this.precio+=10;
        }else if(peso>=20 && peso<=49) {
            this.precio+=50;
        }else if(peso>=50 && peso<=79) {
            this.precio+=80;
        }else if(peso>=80) {
            this.precio+=100;
        }
	}
	
}
