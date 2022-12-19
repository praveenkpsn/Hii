package batch27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001
{
public static void main(String[] args) throws Exception
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\kprav\\OneDrive\\Documents\\sele\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
driver.quit();	
}
}
