import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:28 AM
 */
public class CoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$3.00");

        assertEquals(3, coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$0.01");

        assertEquals(1, coinMessage);
    }

    @Test
    public void tenCentsShouldGiveYouOneDime() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$0.10");

        assertEquals(1, coinMessage);
    }

}
