package clases;

public class Orden {
	private final int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int cantidadProductos;
	private final static int MAX_PRODUCTOS = 10;

	public Orden() {
		super();
		this.idOrden = ++contadorOrdenes;
		this.productos = new Producto[MAX_PRODUCTOS];
	}

	public void agregarProducto(Producto producto) {

		if (this.cantidadProductos < Orden.MAX_PRODUCTOS) {
			productos[this.cantidadProductos++] = producto;

		} else {
			System.out.println(
					"se ha superado la cantidad maxima de productos que puede tener una orden: " + Orden.MAX_PRODUCTOS);
		}
	}

	public double calcularTotal() {
		double total = 0;

		for (int i = 0; i < this.cantidadProductos; i++) {
			total += this.productos[i].getPrecio();
		}
		return total;
	}

	public void mostrarOrden() {
		System.out.println("Id orden: " + this.idOrden + " TotalOrden: " + this.calcularTotal());
		System.out.println("Productos de la orden: ");

		for (int i = 0; i < this.cantidadProductos; i++) {
			System.out.println(this.productos[i]);
		}
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public static int getContadorOrdenes() {
		return contadorOrdenes;
	}

	public static void setContadorOrdenes(int contadorOrdenes) {
		Orden.contadorOrdenes = contadorOrdenes;
	}

	public int getIdOrden() {
		return idOrden;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

}
