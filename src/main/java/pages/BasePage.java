package pages;

import static com.codeborne.selenide.Selenide.open;
import static utils.ApplicationConfigurationProperties.getAppLoginUrl;

public class BasePage {

    public HomePage openHomePage(){
        open(getAppLoginUrl());
        return new HomePage();
    }
}
