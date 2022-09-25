package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //amazon sayfasına gidiniz.

        driver.get("https://amazon.com");

        // kaynak kodları içinde gateway kelimesinin olduğunu test ediniz
       // System.out.println( driver.getPageSource());//sayfadaki kaynak kodlarını verir
        String istenenkelime="gateway";
        if(driver.getPageSource().contains(istenenkelime)){
            System.out.println("PageSourse testi pass");
        }else
            System.out.println("fail");

        driver.close();//sayfayı kapatır
        //driver.guit()//birden fazla saysa varsa hepsini kapatır
    }
}
