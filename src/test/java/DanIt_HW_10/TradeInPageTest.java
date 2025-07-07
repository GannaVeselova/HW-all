package DanIt_HW_10;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class TradeInPageTest extends BaseTest{
    @Test
    @Description("This test checks a next button click")
    public void verifyNextButton(){
        HomePage homePage = new HomePage();
        sleep(5000);
        homePage.clickTradeInButton();

        TradeInPage tradeInPage = new TradeInPage();
        sleep(5000);
        tradeInPage.clickWhatAreWeChangingButton();
        Assert.assertTrue(tradeInPage.verifyOpenWindow());
    }


    @Test
    @Description("This test checks if the window is closed. This test is negative")
    public void verifyCloseWindowNegativeTest(){
        HomePage homePage = new HomePage();
        sleep(5000);
        homePage.clickTradeInButton();
        TradeInPage tradeInPage = new TradeInPage();
        sleep(5000);
        tradeInPage.clickWhatAreWeChangingButton();
        sleep(5000);
        tradeInPage.closeWindowButton();
        sleep(5000);
        Assert.assertFalse(tradeInPage.verifyOpenWindow());
    }

}
