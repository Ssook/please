package grou.asdf;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

   @Test(timeout = 5000)
   public void testSum() {
      App app = new App();
      assertEquals(30, app.sum(10,20), 0);
   }

}