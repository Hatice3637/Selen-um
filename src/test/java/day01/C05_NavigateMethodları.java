package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();


        driver.manage().window().maximize();
        driver.navigate().to("https://amazon.com");//ileri geri yapmamızı sağlar.
        driver.navigate().to("https://techproeducation.com");

        //tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();

        //tekrar tecp sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //sayfayı yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.close();


    }
}
