package ru.maximkazakov.intro;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest extends BaseTestAtrast {

    @Test
    public void testLoginPage() {
        open("https://new.a-trast.ru");
        $x("//div[contains(text(), 'Вход')]").click();
        $x("//input[@name=\"USER_LOGIN\"]").setValue(getUsername());
        $x("//input[@name=\"USER_PASSWORD\"]").setValue(getPassword());
        $x("//div[contains(text(), 'Войти')]").click();
        $x("//a[contains(@href, '/user/profile')]").shouldHave(text(getUsername()));

        sleep(3000);

    }
}
