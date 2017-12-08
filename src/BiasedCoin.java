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
	
	public BiasedCoin(double bias) {
		if(bias >= 0 && bias <= 1) {
			this.bias = bias;
		}
		else {
			bias = .5;
			}
		flip();
		}
	
	//Modify flip so that it generates a random number then
	//assigns face a value of HEADS if the number is less 
	//than the bias; otherwise it assigns a value of TAILS
	public void flip() {
		//face = (int)(Math.random() * 2);
		double random = Math.random();
		
		if(random < bias) {
			face = HEADS;
		}
		else {
			face = TAILS;
		}
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
