package DanIt_HW_10;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class HomePageTest extends BaseTest {

    @Test
    @Description("This test verifies that user is navigated to the trade-in page after clicking on trade-in button on the Home Page ")
    @Feature("Home Page Tests")
    public void verifyButtonToGoTOTheTradeInPage() {
        String checkTitle = "Trade-in — обмін старої техніки та електроніки на нову";
        HomePage homePage = new HomePage();
        sleep(5000);
        homePage.clickTradeInButton();
        TradeInPage tradeInPage = new TradeInPage();
        String getTiTle = tradeInPage.getTitleText();
        Assert.assertTrue(getTiTle.endsWith(checkTitle));
    }

    @Test
    @Description("This test verifies that user is navigated to the news page after clicking on news button on the Home Page ")
    @Feature("Home Page Tests")
    public void verifyButtonToGoTOTheCotpblogPage() {
        String checkTitle = "Новини Фокстрот";
        HomePage homePage = new HomePage();
        homePage.clickHewsButton();
        CorpblogPage corpblogPage = new CorpblogPage();
        String getTitle = corpblogPage.verifyTitlePage();
        Assert.assertTrue(getTitle.endsWith(checkTitle));
    }
}
