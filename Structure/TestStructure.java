import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStructure{

    @Test
    
       public void TestThatFunctionReturnPentagonNumber(){
       
       int actual = StructureFunction.getPentagonalNumber(2);
       
       int expected = 5;
       
       assertEquals(expected, actual);
       
       
       
       } 



}

