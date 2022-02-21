import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final Boolean expected;

    Feline feline;

    public LionParameterizedTest(String sex, Boolean expected) {
    this.sex = sex;
    this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionMane() {
        return new Object[][] {
                {"Самец",  true},
                {"Самка",  false},
        };
    }

    @Test
    public void getDoesHaveManeCorrect () throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
        }
}
