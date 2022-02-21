import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnimalTest {

    @Test
    public void animalGetFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void animalGetFoodTest() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Травоядное");
        assertEquals(actual, expected);
    }

    @Test
    public void animalGetFoodExceptionTest() {
        Exception exception = null;
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Animal animal = new Animal();
        try {
            animal.getFood("Насекомоядное");
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals(exception.getMessage(), expected);
    }
}
