package ES2.JENKINS;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private App app = new App();
	
    
    @Test
    public void testApp1() {
        assertNotNull(app);
    }
    
    @Test
    public void testApp2() {
        assertTrue(app.isTestable());
    }
}
