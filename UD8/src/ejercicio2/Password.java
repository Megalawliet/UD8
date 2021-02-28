package ejercicio2;

public class Password {

	private final static int LONG = 8;
	private int longitud;
	private String contraseña;

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	// Funcion que nos genera la contraseña aleatoria en función del tamaño máximo
	// de 8 caracteres
	public String generacionContraseña() {
		// definimos una variable estilo keyword que nos permita operar según se cumpla
		// la longitud de la cadena
		String llave = "";
		for (int i = 0; i < longitud; i++) {
			int choosed = ((int) Math.floor(Math.random() * 3 + 1));

			if (choosed == 1) {
				char minus = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				llave += minus;
			} else {
				if (choosed == 2) {
					char mayus = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					llave += mayus;
				} else {
					char num = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					llave += num;
				}
			}
		}
		return llave;
	}

	// comprovacion si la constraseña es adecuada o no
	public boolean strong() {
		int numnumeros = 0;
		int numerominus = 0;
		int nummayus = 0;
		// comprovacion y identificación de caracteres
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				numerominus += 1;
			} else {
				if (contraseña.charAt(i) <= 65 && contraseña.charAt(i) <= 90) {
					nummayus += 1;
				} else {
					numnumeros += 1;
				}
			}
		}
		// control sobre el numero de caracteres, y el tipo mayus/minus
		if (numnumeros >= 5 && numerominus >= 1 && nummayus >= 2) {
			return true;
		} else {
			return false;
		}

	}

	public Password() {
		this(LONG);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		contraseña = generacionContraseña();
	}

}