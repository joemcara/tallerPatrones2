package IteratorPattern;
public class MantenimientoIter implements UserIterator {

	private ProductosReparacion productosReparacion;

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return new Producto();
	}

	@Override
	public boolean hasMore() {
		// TODO Auto-generated method stub
		return false;
	}

}