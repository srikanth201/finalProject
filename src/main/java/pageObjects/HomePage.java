package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//h4[@class='product-name']" )
    private List<WebElement> products;

    @FindBy(xpath = "(//button[.='ADD TO CART'])[1]" )
    private WebElement AddToTheCartButton;

    @FindBy(xpath = "//img[@alt='Cart']" )
    private WebElement cartButton;

    @FindBy(xpath = "(//p[@class='product-name'])[1]" )
    private WebElement cartProductText;

    @FindBy(xpath = "//button[.='PROCEED TO CHECKOUT']" )
    private WebElement ProceedToCheckoutButton;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void AddToCart()
    {
        for (WebElement product:products)
        {
            if (product.getText().equals("Brocolli - 1 Kg"))
            {
                AddToTheCartButton.click();
            }
        }
    }

    public void clickCart()
    {
        cartButton.click();
    }

    public void cartProductText()
    {
        String prodText = cartProductText.getText();

        if (prodText.equals("Brocolli - 1 Kg"))
        {

        }else
        {

        }

    }

    public void clickOnProceedCheckout()
    {
        ProceedToCheckoutButton.click();
    }


}
