package ej3;

public class NoPerecedero extends Producto {

	private String tipo = "";

	public NoPerecedero(String nombre, double precio) {
		super(nombre, precio);

	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		
		if (tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "tipo: " + tipo + "\n";
	}

}
