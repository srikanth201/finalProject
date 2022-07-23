package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderPage
{
    WebDriver driver;

    @FindBy(xpath = "//select[@style='width: 200px;']")
    private WebElement select_Country;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement selectCheckBox;

    @FindBy(xpath = "//button[.='Proceed']")
    private WebElement ProceedButton;

    @FindBy(xpath = "//span[contains(.,'Thank you, your order')]")
    private WebElement cnfrmTxt;


    public OrderPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectCountry()
    {
        Select s = new Select(select_Country);
        List<WebElement> optionCount = s.getOptions();

        for (WebElement option:optionCount)
        {
            if (option.getText().equals("India"))
            {
                option.click();
                break;
            }
        }
    }

    public void selectCheckbox()
    {
        selectCheckBox.click();
    }

    public void clickOrderButton()
    {
        ProceedButton.click();
    }

    public void verifyMessage() throws InterruptedException {
        if (cnfrmTxt.isDisplayed())
        {

        }
        Thread.sleep(5000);
    }

    public void VerifyURL()
    {
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
