import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void eqauls(){
    String low = "codeUp";
    String high = "codeup";

        assertEquals(low, high);
    }

    @Test
    public void sameObject(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);
    }

    @Test
    public void arraysEqauls(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void trueOrFalse(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

       assertTrue(language.contains("H"));
       assertFalse(language.contains("J"));
    }




}
