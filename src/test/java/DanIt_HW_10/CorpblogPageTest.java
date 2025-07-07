package DanIt_HW_10;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CorpblogPageTest extends BaseTest {
    @Test
    @Description("This test checks the correct page by title ")
    public void verifyTitleHewsPage() {
        CorpblogPage corpblogPage = new CorpblogPage();
        Assert.assertTrue(corpblogPage.verifyOpenPage());
    }
}
