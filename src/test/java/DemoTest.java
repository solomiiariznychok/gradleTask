import org.junit.jupiter.api.Test;
import pages.AvailableShoesPage;
import pages.BasePage;

public class DemoTest {

    @Test
    public void makeOrder() {
        new BasePage()
                .openRozetkaPage()
                .selectCategories("Nike Sb Zoom Blazer Mid 864349-107");

        new AvailableShoesPage().moveToAvailableShoesPage();
    }
}
