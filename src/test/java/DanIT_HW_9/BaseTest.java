package DanIT_HW_9;



import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    private static final String BASE_URL = "https://hotline.ua/";

    @BeforeMethod
    public void openSite(){
        open(BASE_URL);
        getWebDriver().manage().window().maximize();
    }

}
