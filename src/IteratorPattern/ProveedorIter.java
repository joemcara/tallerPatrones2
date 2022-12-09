package IteratorPattern;
public class ProveedorIter implements UserIterator {

	private FallaGarantia colFallaGarantia;

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