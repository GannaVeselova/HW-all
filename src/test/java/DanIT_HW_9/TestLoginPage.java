package DanIT_HW_9;

import DanIt_HW_9.HomePage;
import DanIt_HW_9.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {
    @Test
    public void verifyCorrectUrl(){
        String checkUrl = "https://hotline.ua/ua/login/";
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage();
        String getUrl = loginPage.getUrlLoginPage();
        Assert.assertEquals(getUrl,checkUrl);
    }

}
