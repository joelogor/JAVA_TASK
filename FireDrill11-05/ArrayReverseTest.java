import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseTest{

    @Test
    public void testThatIObtainAnArrayIReturnTheReverse(){
        int [] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedReversed = {7, 6, 5, 4, 3, 2, 1};
        int []actualReversed = TaskTwo.getReverseArray(number);
        assertEquals(actualReversed, expectedReversed);
    } 
    
    
//    @Test
//    public void testThatIObtainAnArrayIReturnTheOddNumber(){
//        int [] numbers = {1, 2, 3, 4, 5, 6, 7};
//        int expectedOddNumber = {1,  3, 5, 7};
//        int actualOddNumber = TaskTwo.getReverseArray(number);
//        assertEquals(actualOddNumber, expectedOddNumber);
//    } 
}
