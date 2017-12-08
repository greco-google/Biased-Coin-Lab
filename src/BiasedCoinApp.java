
public class BiasedCoinApp {

	public static void main(String[] args) {
		
		/*BiasedCoin coin = new BiasedCoin();
		
		for(int i = 0; i < 10; i++) {
			coin.flip();
			System.out.println(coin);
		}*/
		
		BiasedCoin coin1 = new BiasedCoin(); //50/50 = fair
		BiasedCoin coin2 = new BiasedCoin(.9); //80% Heads
		BiasedCoin coin3 = new BiasedCoin(.1); //10% Heads
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i = 0; i < 50; i++) {
			coin1.flip();
			if(coin1.isHeads()) {
				count1++;
			}
			coin2.flip();
			if(coin2.isHeads()) {
				count2++;
			}
			coin3.flip();
			if(coin3.isHeads()) {
				count3++;
			}
		}
		
		System.out.println("Coin 1 is heads " + count1 + "% of the time");
		System.out.println("Coin 2 is heads " + count2 + "% of the time");
		System.out.println("Coin 3 is heads " + count3 + "% of the time");
		
	}

}
