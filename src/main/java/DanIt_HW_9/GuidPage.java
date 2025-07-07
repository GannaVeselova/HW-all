package DanIt_HW_9;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GuidPage {
    private static final By TITLE_GUID_PAGE=By.cssSelector("[class='top-link__text link link--black text-bold']");

    public String getTitleText(){
        return $(TITLE_GUID_PAGE).getText();

    }
}
