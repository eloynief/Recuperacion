package ej3;

/**
 * 
 * @author enieves esta clase muestra
 */
public class Producto implements Comparable{
	protected String nombre = "";
	protected double precio = 0;

	public Producto() {
		super();
	}

	/**
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		super();
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {

		return "nombre: " + nombre + "\n" + "precio: " + precio + "\n";
	}

	public double calcular(int numero) {
		double num = 0;

		num = this.precio * numero;

		// if perecedero entonces hace algo

		return num;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res=false;
		
		Producto objeto=(Producto) obj; //el obj que es de tipo Object se vuelve tipo Producto
		if(objeto.nombre.equals(this.nombre)) {
			res=true;
		}
		
		
		return res;
	}
	
	

	@Override
	public int compareTo(Object o) {
		
		
		
		return 0;
	}

}
