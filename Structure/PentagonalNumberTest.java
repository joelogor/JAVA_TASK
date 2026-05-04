import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPentagonalNumber{

    @Test
    
       public void TestThatFunctionReturnPentagonNumber(){
       
       int actual = PentagonalNumber.getPentagonalNumber(2);
       
       int expected = 5;
       
       assertEquals(expected, actual);
       
       
       
       } 



}

