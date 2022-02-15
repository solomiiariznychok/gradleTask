package pages;

public class AvailableShoesPage extends HomePage {

    public AvailableShoesPage moveToAvailableShoesPage() {
        submit();

        return new AvailableShoesPage();
    }
}
