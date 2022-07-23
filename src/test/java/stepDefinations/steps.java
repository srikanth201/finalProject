package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.OrderPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class steps
{
    WebDriver driver;
    HomePage hp;
    CheckOutPage cp;
    OrderPage op;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;

    @Given("^User is on HomePage$")
    public void user_is_on_HomePage() throws Throwable {
        configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitWait(), TimeUnit.SECONDS);
        driver.get(configFileReader.getAppURL());

    }

    @When("^user selects a product and click on AddToCart$")
    public void user_selects_a_product_and_click_on_AddToCart() throws Throwable {
       /* List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int count = products.size();

        for (WebElement product:products)
        {
            if (product.getText().equals("Brocolli - 1 Kg"))
            {
                driver.findElement(By.xpath("(//button[.='ADD TO CART'])[1]")).click();
            }
        }*/

        pageObjectManager = new PageObjectManager(driver);
        hp =  pageObjectManager.getHomePage();
        //hp =  new HomePage(driver);
        hp.AddToCart();


    }

    @Then("^Click on cart and check product is added$")
    public void click_on_cart_and_check_product_is_added() throws Throwable {
        /*WebElement cartButton = driver.findElement(By.xpath("//img[@alt='Cart']"));
        if (cartButton.isDisplayed())
        {
            cartButton.click();
        }

        String prodText = driver.findElement(By.xpath("(//p[@class='product-name'])[1]")).getText();

        if (prodText.equals("Brocolli - 1 Kg"))
        {

        }else
        {

        }*/
        hp.clickCart();
        hp.cartProductText();

    }

    @Then("^Click on Proceed To Checkout button$")
    public void click_on_Proceed_To_Checkout_button() throws Throwable {
        //driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
        hp.clickOnProceedCheckout();

    }

    @Then("^Verify Product is added or not into Table$")
    public void verify_Product_is_added_or_not_into_Table() throws Throwable {
       /* String productName = driver.findElement(By.xpath("//p[.='Brocolli - 1 Kg']")).getText();

        if (productName.equals("Brocolli - 1 Kg"))
        {

        }*/

        cp = pageObjectManager.getCheckOutPage();

        cp=new CheckOutPage(driver);
        cp.VerifyProductName();

    }

    @Then("^Click on Place Order$")
    public void click_on_Place_Order() throws Throwable {
       // driver.findElement(By.xpath("//button[.='Place Order']")).click();
        cp.ClickPlaceOrder();

    }

    @Then("^Select a Country and Agree Terms$")
    public void select_a_Country_and_Agree_Terms() throws Throwable {
      /*  WebElement ele = driver.findElement(By.xpath("//select[@style='width: 200px;']"));

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
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();*/

        op = pageObjectManager.getOrderPage();
        op = new OrderPage(driver);
        op.selectCountry();
        op.selectCheckbox();

    }

    @Then("^Click on Proceed Button$")
    public void click_on_Proceed_Button() throws Throwable {
       // driver.findElement(By.xpath("//button[.='Proceed']")).click();
        op.clickOrderButton();

    }

    @Then("^Verify Success Message$")
    public void verify_Success_Message() throws Throwable {
      /*  WebElement cnfrmTxt = driver.findElement(By.xpath("//span[contains(.,'Thank you, your order')]"));

        if (cnfrmTxt.isDisplayed())
        {

        }
        Thread.sleep(5000);*/

        op.verifyMessage();


    }

    @Then("^Verify user redirected to HomePage$")
    public void verify_user_redirected_to_HomePage() throws Throwable {
       /* String url = driver.getCurrentUrl();



        System.out.println(url);



        try {
            if (url.equals("https://rahulshettyacademy.com/seleniumPractise/#/"))
            {}

        }catch (Exception e)
        {
            System.out.println("URL is not matching.....");
        }

        driver.quit();*/
        op.VerifyURL();

    }

}
