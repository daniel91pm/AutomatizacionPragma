package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Choose between Browser chrome or edge to init a new automation using enviroment variable
 */
public class DriverUtil {

    public static WebDriver setUp() {
        WebDriver driver = null;
        final String browser = System.getenv("envBrowser");
        String url = "https://www.demoblaze.com/";


        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().window().maximize();
                return driver;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.get(url);
                driver.manage().window().maximize();

                return driver;

            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get(url);
                driver.manage().window().maximize();
                return driver;

        }


    }
}
