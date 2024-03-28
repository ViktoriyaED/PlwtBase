package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage{

    private final Locator elementsCard = heading("Elements");

    public HomePage(Page page) {
        super(page);
    }

    public ElementsPage clickOnElementsCard() {
     elementsCard.click();
        return new ElementsPage(getPage());
    }
}
