package IteratorPattern;
public class VendedorIter implements UserIterator {

	private ProductosTienda productosTienda;

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