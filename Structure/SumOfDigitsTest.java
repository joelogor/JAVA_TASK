import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest{

    @Test
    public void testThatCorrectSumOfDigitsIsReturned(){

       
        int expectedSum1 = SumOfDigits.sumDigits(123);
        int actualSum1 = 6;
        assertEquals(expectedSum1, actualSum1);

        

    }   

}
