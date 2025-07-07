package DanIT_HW_9;

import DanIt_HW_9.GuidPage;
import DanIt_HW_9.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHomePage extends BaseTest {
    @Test
    public void verifyIsDisplayedAfterClickTopButten() {
        HomePage homePage = new HomePage();
        homePage.clickUsefulLinksButton();
        Assert.assertTrue(homePage.isItemDisplayed());
    }

    @Test
    public void verifyTitleOfPageCorrectAccordingToEnteredSearchKeyWord() {
        String searchKeyWord = "Гід покупця";
        HomePage homePage = new HomePage();
        homePage.clickAllLinksButton();

        GuidPage guidPage = new GuidPage();
        String titleText = guidPage.getTitleText();
        Assert.assertTrue(titleText.contains(searchKeyWord));
    }
}
