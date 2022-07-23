package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.OrderPage;

public class PageObjectManager
{
    private WebDriver driver;
    private HomePage homePage;
    private CheckOutPage checkOutPage;
    private OrderPage orderPage;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage getHomePage()
    {
        return (homePage==null)?homePage = new HomePage(driver):homePage;
    }

    public CheckOutPage getCheckOutPage()
    {
        return (checkOutPage==null)?checkOutPage = new CheckOutPage(driver):checkOutPage;
    }

    public OrderPage getOrderPage()
    {
        return (orderPage==null)?orderPage = new OrderPage(driver):orderPage;
    }
}
