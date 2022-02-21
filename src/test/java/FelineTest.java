import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getKittensCorrect () throws Exception {
        int expectedKittens = 1;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(expectedKittens, actual);
    }
    @Test
    public void getFamilyCorrect () throws Exception {
        String expectedFamily = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expectedFamily, actual);
    }
    @Test
    public void getFoodCorrect () throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(expectedFood, actual);
    }
}
