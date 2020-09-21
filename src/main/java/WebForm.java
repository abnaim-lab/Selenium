import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String email = "test1@test1.com";
    private final String paswrd = "qwert";

    @FindBy(id = "Click")
    private WebElement loginButton;

    @FindBy(id = "email")
    private WebElement em;

    @FindBy(id = "psw")
    private WebElement psw;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        this.loginButton.click();
    }

    public void enterEMail(){
        this.em.sendKeys(email);
    }

    public void enterPaswword(){
        this.psw.sendKeys(paswrd);
    }
}