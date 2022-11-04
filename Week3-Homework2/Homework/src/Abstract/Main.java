package Abstract;

public class Main {

	public static void main(String[] args) {
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.calculate();
		kidsGameCalculator.gameOver();
		GameCalculator gameCalculators = new WomanGameCalculator();
		gameCalculators.calculate();
		gameCalculators.gameOver();

	}

}
