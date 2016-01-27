package refactoring;

public class CarTest {

	public static void main(String[] args) {

		Car sonata = new Sonata();
		sonata.run();
		sonata.washCar();
		
		Car genesis = new Genesis();
		genesis.run();
		genesis.washCar();
		
		Car i30 = new I30();
		i30.run();
		i30.washCar();
	}

}
