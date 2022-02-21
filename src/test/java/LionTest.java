import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensCorrect () throws Exception {
        int expectedKittens = 1;
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(expectedKittens, actual);
    }

    @Test
    public void getFoodCorrect () throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(expectedFood, actual);
    }

    @Test
    public void doesHaveManeExceptionCorrect () {
        Exception exception = null;
        String expected = "Иcпользуйте допустимые значения пола животного - самец или самка";
        try {
            new Lion("Бесполый", feline);
        }
        catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals(exception.getMessage(), expected);
    }
}
