package wish.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class InternalTest {

  
  @Test
  @Tag("Mohammad")
  public void testLucky() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    Assertions.assertEquals(2, 2);
  }
  
  @Test
  public void testLucky2() {
    Assertions.assertEquals(2, 2);
  }


}
