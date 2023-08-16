package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage_Pom;

public class LoginTest extends Base_class {
	@Test
    public void Login_Banking() throws InterruptedException {
    	Homepage_Pom obj = new Homepage_Pom(driver);
    	obj.enter_Usernmae(userId);
    //	obj.Click_Continue();
    	obj.enter_Password(password);
    	obj.click_Button();
    	String title = driver.getTitle();
    	System.out.println("Title-" + title);
    //	String expected = 
    //	Assert.assertEquals(true, true);
   // 	String act_title = driver.getTitle();
   // 	String expected_title = "Guru99 Bank HomePage";
 //   	System.out.println("User logged in successfully and title" + act_title);
   // 	Assert.assertEquals(act_title, expected_title);
   // 	Assert.assertEquals(true, true);
   //   Reporter.log(act_title);
   // 	logger.info("login test passed");
    }
	
    
}
