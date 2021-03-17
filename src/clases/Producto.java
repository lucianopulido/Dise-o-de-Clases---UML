package clases;

public class Producto {
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;

	public Producto(String nombre, double precio) {
		super();
		this.idProducto = ++contadorProductos;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getContadorProductos() {
		return contadorProductos;
	}

	public static void setContadorProductos(int contadorProductos) {
		Producto.contadorProductos = contadorProductos;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
