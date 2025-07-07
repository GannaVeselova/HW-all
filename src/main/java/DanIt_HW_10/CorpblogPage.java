package DanIt_HW_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CorpblogPage {

    @Step("User gets a page title on Trade-in Page")
    public String verifyTitlePage() {
        return $(".wrapper>.page__title").getText();
    }

    @Step("user verifies to open Corpblog Page")
    public boolean verifyOpenPage(){
        return $(".wrapper>.page__title").isDisplayed();
    }

}
