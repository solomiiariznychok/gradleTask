package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.US);

    public HomePage openRozetkaPage(){
        open(bundle.getString("login.url"));
        return new HomePage();
    }
}
