import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2E
{
    //Below code is for testing web application
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int count = products.size();

        for (WebElement product:products)
        {
            if (product.getText().equals("Brocolli - 1 Kg"))
            {
                driver.findElement(By.xpath("(//button[.='ADD TO CART'])[1]")).click();
            }
        }

        WebElement cartButton = driver.findElement(By.xpath("//img[@alt='Cart']"));
        if (cartButton.isDisplayed())
        {
            cartButton.click();
        }

        String prodText = driver.findElement(By.xpath("(//p[@class='product-name'])[1]")).getText();

        if (prodText.equals("Brocolli - 1 Kg"))
        {

        }else
        {

        }

        driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();

        String productName = driver.findElement(By.xpath("//p[.='Brocolli - 1 Kg']")).getText();

        if (productName.equals("Brocolli - 1 Kg"))
        {

        }

        driver.findElement(By.xpath("//button[.='Place Order']")).click();

        WebElement ele = driver.findElement(By.xpath("//select[@style='width: 200px;']"));

        Select s = new Select(ele);
        List<WebElement> optionCount = s.getOptions();

        for (WebElement option:optionCount)
        {
            if (option.getText().equals("India"))
            {
                option.click();
                break;
            }
        }
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//button[.='Proceed']")).click();

        WebElement cnfrmTxt = driver.findElement(By.xpath("//span[contains(.,'Thank you, your order')]"));

        if (cnfrmTxt.isDisplayed())
        {

        }
        Thread.sleep(5000);

        String url = driver.getCurrentUrl();



        System.out.println(url);



        try {
            if (url.equals("https://rahulshettyacademy.com/seleniumPractise/#/"))
            {}

        }catch (Exception e)
        {
            System.out.println("URL is not matching.....");
        }

        driver.quit();



    }


}
