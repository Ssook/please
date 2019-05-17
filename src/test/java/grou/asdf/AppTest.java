package grou.asdf;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.Assert;

public class AppTest {
   static int num1 = 0, num2 = 0;
   static App app = null, app2 = null;

@Test
   public void testSum() {
      Assert.assertEquals(num1 + num2, App.sum(num1, num2)); //return true;
   }
   @Test
   public void testFail() {
      Assert.assertEquals(num1 - num2, App.sum(num1, num2)); //return false;
   }
   @Test
   public void same() {
      Assert.assertSame(app, app2); //return false;
   }
   @Test
   public void isOdd() {   //홀수인지
      Assert.assertFalse(num1%2==1);
   }
   @Test   
   public void isEven() {   //짝수인지
      Assert.assertTrue(num1%2==0);
   }
   @Test
   public void appChk() {   //app이 Null이 아닌지를 테스트
      Assert.assertNotNull(app);
   }
   @Ignore // 실행되지 않는다.
   public void ignore() {
      Assert.assertEquals(1, App.sum(num1, num2)); 
   }
   @Before   // @Test 실행전마다 실행된다.
   public void before() {
      if(num1 != 10) num1 = 10;
      if(num2 != 20) num2 = 20;
   }
   @BeforeClass   //@Test 실행전 한번만 실행된다.
   public static void beforeClass() {
      app = new App();
      num1 = 10;
      num2 = 20;
   }
   @AfterClass      //@Test 실행후 한번만 실행된다.
   public static void afterClass() {
      app = null;
   }
  
  
}