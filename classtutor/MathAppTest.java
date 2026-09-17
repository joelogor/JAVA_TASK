import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathAppTest{

    @Test
    
    public void testThatICollectAdditionOperatorIGetCorrectResult(){
    
    double numberOne = 5;
    double numberTwo = 10;
    
    double expected = 15;
    double actual = MathApp.getAdditionOf(numberOne,numberTwo);
    assertEquals(expected, actual);
    
    
    }

@Test
    
    public void testThatICollectSubtractionOperatorIGetCorrectResult(){
    
    double numberOne = 10;
    double numberTwo = 5;
    
    double expected = 5;
    double actual = MathApp.getSubtractionOf(numberOne,numberTwo);
    assertEquals(expected, actual);
    
    
    }
@Test
    
    public void testThatICollectDivisionOperatorIGetCorrectResult(){
    
    double numberOne = 10;
    double numberTwo = 5;
    
    double expected = 2;
    double actual = MathApp.getDivisionOf(numberOne,numberTwo);
    assertEquals(expected, actual);
    
    
    }


}



