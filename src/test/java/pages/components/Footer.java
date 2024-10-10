package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Footer {
    SelenideElement footerElement = $(".footer .block");

    public Footer checkFooterValue(String value) {
        footerElement.shouldHave(Condition.text(value));
        return this;
    }

    public Footer checkVK() {
        $(byText("VK")).click();
        switchTo().window("X5 Group | ВКонтакте");
        assertThat("X5 Group | ВКонтакте");

        $(".page_name").shouldHave(Condition.text("X5 Group"));
        return this;
    }

    public Footer checkDzen() {
        $("#menu-item-75").click();
        switchTo().window("X5 Group | Дзен");

        assertThat("X5 Group | Дзен");
        $("[itemprop='name']").shouldHave(Condition.text("X5 Group"));
        return this;
    }
}
