package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NegativeTests extends TestBase {
    MainPage mainPage = new MainPage();

    @Test
    @Tag("Negative")
    public void negativeNavigationTests() {
        System.setProperty("remoteUrl", "remote");
        mainPage.openMainPage();
        $(byText("Партнёрам")).click();
        $("[aria-label='breadcrumbs']").shouldHave(text("Партнерам"));
    }

    @Test
    @Tag("Negative")
    public void negativeNavigationTests1() {
        System.setProperty("remoteUrl", "remote");
        mainPage.openMainPage();
        $(byText("Акционерам и инвесторам")).click();
        $("[aria-label='breadcrumbs']").shouldHave(text("Инвесторам"));
    }
}