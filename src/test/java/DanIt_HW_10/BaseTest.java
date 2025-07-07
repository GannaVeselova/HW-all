package DanIt_HW_10;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    private static final String BASE_URL ="https://www.foxtrot.com.ua/";
    @BeforeMethod
 public void openSite(){
        Selenide.open(BASE_URL);
        getWebDriver().manage().window().maximize();
 }
}
