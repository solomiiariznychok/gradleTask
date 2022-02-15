package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage<T extends HomePage> {

    private SelenideElement searchInput = $x("//input");
    public SelenideElement submitBtn = $x("//button[contains(@class, 'button_color_green')]");

    public void selectCategories(String itemToSearch) {
        searchInput.val(itemToSearch);
    }

    public T submit(){
        submitBtn.click();
        return (T) this;
    }
}
