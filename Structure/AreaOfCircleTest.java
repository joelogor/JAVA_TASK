import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaOfCircleTest{

    @Test
    public void testThatAreaOfCircleIsWithinAValue(){

        double actualArea = AreaOfCircle.circleArea(10.0);
        double expectedArea = 314.159;
        assertTrue(expectedArea - actualArea);

        
    }   

}
