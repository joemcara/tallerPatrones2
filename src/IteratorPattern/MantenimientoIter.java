package IteratorPattern;
public class MantenimientoIter implements UserIterator {

	private ProductosReparacion productosReparacion;

	@Override
	public Producto next() {
		// Recorre
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// Comprueba si hay mas elementos
		return false;
	}

}
