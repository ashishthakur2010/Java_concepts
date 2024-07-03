import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    public static void main(String[] args) {
        WebDriver driver =null;
        String url = "https://www.google.com";
        WebDriverManager.chromedriver().setup();
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.addArguments("--incognito");
        //cOptions.addArguments("--headless");
        driver = new ChromeDriver(cOptions);
        driver.get(url);
    }
}