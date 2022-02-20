import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnimalTest extends Animal {

    @Test
    public void animalGetFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = getFamily();
        assertEquals(expected, actual);
    }
    @Test
    public void animalGetFoodTest() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        List<String> actual = getFood("Травоядное");
        assertEquals(actual, expected);
    }

    @Test
    public void animalGetFoodExceptionTest() {
        Exception exception = null;
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try {getFood("Насекомоядное");
        } catch (Exception ex) { exception = ex; }
        assertNotNull(exception);
        assertEquals(exception.getMessage(), expected);
    }



}
