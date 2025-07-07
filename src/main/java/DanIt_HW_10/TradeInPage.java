package DanIt_HW_10;

import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TradeInPage {

    @Step("User gets a page title on Trade-in Page")
    public String getTitleText(){
      return   $("[class='page__title']").getText();
    }

    @Step("User clicks on the next button")
    public void clickWhatAreWeChangingButton(){
        $("button.button.trade-in-select-product-js").click();
        sleep(3000);
    }

    @Step("user verifies open the window with order")
    public boolean verifyOpenWindow(){
      return   $("[class='pop-up-traide-in-1-step active']").shouldBe(visible, Duration.ofSeconds(30)).isDisplayed();
    }

    @Step("user clicks to close window button")
    public void closeWindowButton(){
        $(".popup.pop-up-traide-in.popup_active>.popup__wrap>.popup__close").click();
    }
}
