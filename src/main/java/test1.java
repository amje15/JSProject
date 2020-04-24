import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {

    @BeforeClass
    public void Setup(){
        System.getProperty("Webdriver.io.ff","");
        WebDriver driver=new ChromeDriver();
        
    }

    @Test
    public void t(){
        System.out.print("HI");
    }
}
