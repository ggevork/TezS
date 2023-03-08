import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        System.setProperty("webdriver.edge.driver", "C:/Users/ggevo/Downloads/edgedriver_win64");


        driver.get("https://www.google.com/");



    }
}