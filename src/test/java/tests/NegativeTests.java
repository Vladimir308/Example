package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NegativeTests extends TestBase {

    @Test
    @Tag("Negative")
    public void negativeNavigationTests() {
        mainPage.openMainPage();
        $(byText("Партнёрам")).click();
        $("[aria-label='breadcrumbs']").shouldHave(text("Партнерам"));
    }

    @Test
    @Tag("Negative")
    public void negativeNavigationTests1() {
        mainPage.openMainPage();
        $(byText("Акционерам и инвесторам")).click();
        $("[aria-label='breadcrumbs']").shouldHave(text("Инвесторам"));
    }
}