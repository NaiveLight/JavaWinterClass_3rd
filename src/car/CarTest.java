package car;

public class CarTest {

	public static void main(String[] args) {

		Sonata sonata = new Sonata();
		sonata.sonataStart();
		sonata.sonataDrive();
		sonata.sonataBreak();
		sonata.sonataTurnOff();
		
		Genesis genesis = new Genesis();
		genesis.genesisStart();
		genesis.genesisDrive();
		genesis.genesisBreak();
		genesis.genesisTurnOff();
	}

}
