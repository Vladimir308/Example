import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void selenideSearchTest() {
        Configuration.pageLoadStrategy="eager";
            open("https://www.google.com/");
            $("[name=q]").setValue("selenide.ru").pressEnter();
            $("[id=search]").shouldHave(text("selenide.org"));
            $("[id=search]").shouldHave(text("https://selenide.org"));
        }
    }