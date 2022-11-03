import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeupCryptTest {

    @Test
    public void version(){

        CodeupCrypt.version = 3;
        assertEquals(3, CodeupCrypt.version, 0);
    }

    @Test
    public void hashPassword(){

        String var = "aeiouAEIOU";
        String expected = "4310943109";

        assertEquals(expected, CodeupCrypt.hashPassword(var));

    }

    @Test
    public void checkPassword(){
        String var = "aeiouAEIOU";
        String cyrptic = "4310943109";
        boolean expected = true;
        assertEquals( expected , CodeupCrypt.checkPassword(var, cyrptic));
    }





}
