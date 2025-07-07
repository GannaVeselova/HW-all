package DanIt_HW_10;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    @Step("user clicks on the Trade Button")
    public void clickTradeInButton(){
       $("i[class='icon icon-exchange-2']").click();
    }

    @Step("user clicks on the News Button")
    public void clickHewsButton(){
        $x("//a[text()='Новини Фокстрот']").click();
    }

}
