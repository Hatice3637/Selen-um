package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //arama kutusu locate ediniz
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramakutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName TESTI PASSED : "+actualTagName);
        }else {
            System.out.println("TagName TESTI FAILED" +actualTagName);
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramakutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");
        //-Sayfayı kapatınız
        driver.close();
    }
}
