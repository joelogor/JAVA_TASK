import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumNumberTest{

    @Test
    public void testThatCorrectMaximumNumberIsReturned(){

        int expectedNumber = MaximumNumber.max(1,2,3);
        int actualNumber = 3;
        assertEquals(expectedNumber, actualNumber);


    }   

}
