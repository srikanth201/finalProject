package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage
{

    WebDriver driver;

    @FindBy(xpath = "//p[.='Brocolli - 1 Kg']")
    private WebElement productName;

    @FindBy(xpath = "//button[.='Place Order']")
    private WebElement PlaceOrder;

    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void VerifyProductName()
    {
        String prodName = productName.getText();

        if (prodName.equals("Brocolli - 1 Kg"))
        {

        }
    }

    public void ClickPlaceOrder()
    {
        PlaceOrder.click();
    }


}
