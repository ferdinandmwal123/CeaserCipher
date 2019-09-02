
import org.junit.Assert.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CeaserCipherTest {

    private CeaserCipher ceaserCipher = new CeaserCipher("Ferdinand",5);


@Test
    public void isCipherWorking (){
    String expected = "k";
    assertEquals(expected,ceaserCipher.encrypt("f", 5));
}

@Test
    public void instantiateClass(){
   // Checks that the field instantiates class CeaserCipher
    assertTrue(ceaserCipher instanceof CeaserCipher);
}

@Test
//    Check whether the getter method works for the text
    public void checkForText(){
    assertEquals(null,ceaserCipher.getText());
}

@Test
//    Check whether the getter method works for the key
    public void checkForKey(){
    assertEquals(null,ceaserCipher.getKey());
}



}