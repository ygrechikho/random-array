import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        RandomGenerator rnd = new RandomGenerator();
        var rndNoLimit = rnd.GetRndNumber(10);
        var rndLimit = rnd.GetRndNumber(1000, 5000, 10 );

        NumberTypeCalculator.printResult(NumberTypeCalculator
                .getPositiveEvenTotal(rndNoLimit));

        NumberTypeCalculator.printResult(NumberTypeCalculator
                .getPositiveEvenTotal(rndLimit));
    }
}
