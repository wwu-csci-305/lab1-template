/*
// this is the auto testing class
// DO NOT MODIFY THIS CLASS AND ITS METHODS
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {
    @Test 
    public void testHelloWorldGreeting() {
    	// init an object of your helloworld class
        HelloWorld classUnderTest = new HelloWorld();
        // init an object of rightsolution
        RightSolution solution = new RightSolution();
        // compare the return results of the two objects' getGreeting method
        assertEquals(solution.getGreeting(), classUnderTest.getGreeting());
    }
}
