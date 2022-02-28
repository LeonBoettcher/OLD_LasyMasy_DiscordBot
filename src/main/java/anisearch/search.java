package anisearch;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import net.dv8tion.jda.api.entities.Message;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class search {
    public static void findanime(){
        WebDriver driver = new FirefoxDriver();
        Selenium selenium = new WebDriverBackedSelenium( driver, "http://www.google.de" );
    }
}
