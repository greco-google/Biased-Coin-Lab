public class BiasedCoin {
	
	//constants = ALL CAPS
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	private double bias;
	
	public BiasedCoin() {
		bias = .5;
		flip();
	}
	
	public void flip() {
		face = (int)(Math.random() * 2);
	}
	
	public boolean isHeads() {
		return (face == HEADS);
	}
	
	public String toString() {
		
		String faceName;
		if(face == HEADS) {
			faceName  = "Heads";
		} else {
			faceName = "Tails";
		}
		
		return faceName;
	}

}
