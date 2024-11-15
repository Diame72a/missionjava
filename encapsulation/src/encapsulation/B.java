package encapsulation;

public class B extends A {
	public int pubb;
	protected int prob;
	private int prib;

	public void test() {
		 setPria(1);   // pria est en private donc inaccessible, il faut mettre des getters et setters pour pria et fait setPria();
	}

	public int getPrib() {
		return prib;
	}

	public void setPrib(int prib) {
		this.prib = prib;
	}
	
	
}
