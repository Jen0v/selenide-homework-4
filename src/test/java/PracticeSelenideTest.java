import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PracticeSelenideTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000

    }
}
