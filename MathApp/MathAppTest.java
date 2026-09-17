import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathAppTest{

    @Test
    
    public void testThatICollectMultiplicationOperatorIGetCorrectResult(){
    
    double numberOne = 5;
    double numberTwo = 10;
    
    double expected = 50;
    double actual = MathApp.getMutipleOf(numberOne,numberTwo);
    assertEquals(expected, actual);
    
    
    }

}



