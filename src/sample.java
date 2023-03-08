import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/ggevo/Downloads/chromedriver_win32/chromedriver.exe");



        driver.get("https://www.google.com");

    }
}
