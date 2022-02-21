import com.example.Alex;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    Feline feline;

    @Test
    public void getAlexKittensTest () throws Exception {
        int expectedKittens = 0;
        Alex alex = new Alex(feline);
        int actual = alex.getKittens();
        assertEquals(expectedKittens, actual);
    }

    @Test
    public void getAlexFriendsTest () throws Exception {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        Alex alex = new Alex(feline);
        List<String> actual = alex.getFriend();
        assertEquals(expectedFriends, actual);
    }

    @Test
    public void getAlexPlaceOfLivingTest () throws Exception {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        Alex alex = new Alex(feline);
        String actual = alex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfLiving, actual);
    }
}
