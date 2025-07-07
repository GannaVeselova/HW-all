package DanIt_HW_9;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private static final By USEFUL_LINKS_TOP_BUTTON = By.cssSelector("button[data-eventlocation='ТОП-10']");
    private static final By LOGIN_BUTTON = By.cssSelector("[class='user-button__image flex middle-xs center-xs']");

    public void clickUsefulLinksButton() {
        $(USEFUL_LINKS_TOP_BUTTON).click();
    }

    public void clickAllLinksButton() {
        $("a.articles-container__see-all-link[href='/ua/guides/']").click();
        sleep(5000);
    }

    public boolean isItemDisplayed() {
        return $x("//a[@href='/ua/guides/top-7-ltnh-shin-maksimalno-raconalnij-vibr/']").isDisplayed();
    }

    public void clickLoginButton() {
        $(LOGIN_BUTTON).click();
        sleep(5000);

    }
}
