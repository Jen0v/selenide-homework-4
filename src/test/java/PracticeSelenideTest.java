import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeSelenideTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920*1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void exampleJUnit5() {

        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-content").$(byText("Show 3 more pages…")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text(
                """
                        @ExtendWith({SoftAssertsExtension.class})
                        class Tests {
                          @Test
                          void test() {
                            Configuration.assertionMode = SOFT;
                            open("page.html");
                        
                            $("#first").should(visible).click();
                            $("#second").should(visible).click();
                          }
                        }"""));


    }
}
