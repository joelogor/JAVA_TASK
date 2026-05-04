import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumNumberTest{

    @Test
    public void testThatCorrectMaximumNumberIsReturned(){

        int expectedNumber = MaximumNumber.max(5,10,15);
        int actualNumber = 15;
        assertEquals(expectedNumber, actualNumber);

        



    }   

}
