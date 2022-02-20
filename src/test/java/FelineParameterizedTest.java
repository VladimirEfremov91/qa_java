import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;
    private final int expectedKittensCount;

    public FelineParameterizedTest (int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }
    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                {2, 2},
                {8, 8},
                {0, 0},
        };
    }
    @Test
    public void getKittenCountCorrect() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, actual);
        }
}
