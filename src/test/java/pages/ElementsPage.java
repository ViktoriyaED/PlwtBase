package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ElementsPage extends BasePage {

    private final Locator textBoxSubmenu = locator("text=Text Box");
    private final Locator fullNameField = textbox("Full Name");
    private final Locator emailField = placeholder("name@example.com");
    private final Locator currentAddressField = placeholder("Current Address");
    private final Locator permanentAddressField = locator("#permanentAddress");
    private final Locator submitButton = locator("#submit");
    private final Locator outputField = locator("#output");
    private final Locator fullNameOutput = outputField.locator("#name");
    private final Locator emailOutput = outputField.locator("#email");
    private final Locator currentAddressOutput = outputField.locator("#currentAddress");
    private final Locator permanentAddressOutput = outputField.locator("#permanentAddress");

    public ElementsPage(Page page) {
        super(page);
    }

    public Locator getOutputField() {
        return outputField;
    }

    public Locator getFullNameOutput() {
        return fullNameOutput;
    }

    public Locator getEmailOutput() {
        return emailOutput;
    }

    public Locator getCurrentAddressOutput() {
        return currentAddressOutput;
    }

    public Locator getPermanentAddressOutput() {
        return permanentAddressOutput;
    }

    public ElementsPage clickTextBoxSubmenu() {
        textBoxSubmenu.click();
        return this;
    }

    public ElementsPage inputFullNameField(String fullName) {
        fullNameField.fill(fullName);
        return this;
    }

    public ElementsPage inputEmailField(String email) {
        emailField.fill(email);
        return this;
    }

    public ElementsPage inputCurrentAddressField(String currentAddress) {
        currentAddressField.fill(currentAddress);
        return this;
    }

    public ElementsPage inputPermanentAddressText(String permanentAddress) {
        permanentAddressField.fill(permanentAddress);
        return this;
    }

    public ElementsPage clickSubmitButton() {
        submitButton.click();
        return this;
    }
}
