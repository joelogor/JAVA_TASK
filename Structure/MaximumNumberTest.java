import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumNumberTest{

    @Test
    public void testThatCorrectMaximumNumberIsReturned(){

        int actualNumber = MaximumNumber.max(1,2,3);
        int expectedNumber = 3;
        assertEquals(expectedNumber, actualNumber);


    }   

}
