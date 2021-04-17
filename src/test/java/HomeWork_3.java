
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork_3 {

    @Test
    void selenideAVinogradov(){

        open("https://github.com/");
        $x("//input[@name='q']").setValue("Selenide").pressEnter();
        $x("//ul[@class='repo-list']/li").shouldHave(text("selenide/selenide"));
        $x("//ul[@class='repo-list']/li//a").click();
        $x("//span[text()='Wiki']").click();
        $x("//div[@class='wiki-rightbar']").shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $x("//div[@id='wiki-wrapper']").shouldHave(text("JUnit5 extension"));

    }

}
