import org.junit.jupiter.api.Test;
import pages.AvailableShoesPage;
import pages.BasePage;

public class DemoTest {

    private final String SNEAKERS_MODEL_FOR_SEARCHING = "Nike Sb Zoom Blazer Mid 864349-107";

    @Test
    public void makeOrder() {
        new BasePage()
                .openHomePage()
                .selectCategories(SNEAKERS_MODEL_FOR_SEARCHING)
                .submit();
    }
}
