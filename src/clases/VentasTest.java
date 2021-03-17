package clases;

public class VentasTest {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Camisa", 50.00);
		Producto producto2 = new Producto("Pantalon", 100.00);
		
		Orden orden1 = new Orden();

		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
		
		imprimirNumeros(3,4,5);
		imprimirNumeros(1,2);
		imprimirNumeros();

	}
	
	private static void imprimirNumeros(int... numeros) {
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println("elemento: "+numeros[i]);
		}
	}

}
