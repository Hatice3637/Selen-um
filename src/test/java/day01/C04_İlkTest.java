package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_İlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        /*
        1:amazon sayfasına gisiniz
        2:başlığın amazon içerdiğini test ediniz
        3:url nin amazon içerdiğini test ediniz
        4:sayfayı kapatınız
         */

        //  1- Amazon sayfasına gidiniz.
        driver.get("https://www.amazon.com");

       //    2- Başlığın "Amazon" içerdiğini test ediniz.
        if(driver.getTitle().contains("Amazon")){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }

        //  3- Url'nin Amazon içerdiğini test ediniz.
        if(driver.getCurrentUrl().contains("amazon")){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }
        driver.close();
    }
}
