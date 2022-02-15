package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage<T extends HomePage> {

    private final SelenideElement searchInput = $x("//input");
    private final SelenideElement submitButton = $x("//button[contains(@class, 'button_color_green')]");

    public HomePage selectCategories(String itemToSearch) {
        searchInput.val(itemToSearch);

        return this;
    }

    public T submit(){
        submitButton.click();
        return (T) this;
    }

    ///add comment
}
