import org.junit.Test;
import static org.junit.Assert.*;

public class FailingTest {
   @Test
   public void testThatFails() {
       assertTrue("This should fail", false);
   }
}
