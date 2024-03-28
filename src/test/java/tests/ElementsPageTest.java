package tests;

import org.testng.annotations.Test;
import pages.ElementsPage;
import runner.BaseTest;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ElementsPageTest extends BaseTest {

    @Test
    public void testTextBox() {
        final String fullName = "John Doe";
        final String email = "johndoe@example.com";
        final String currentAddress = "address";
        final String permanentAddress = "address1";

        ElementsPage elementsPage = openHomePage()
                .clickOnElementsCard()
                .clickTextBoxSubmenu()
                .inputFullNameField(fullName)
                .inputEmailField(email)
                .inputCurrentAddressField(currentAddress)
                .inputPermanentAddressText(permanentAddress)
                .clickSubmitButton();

        assertThat(elementsPage.getOutputField()).isVisible();
        assertThat(elementsPage.getFullNameOutput()).hasText("Name:" + fullName);
        assertThat(elementsPage.getEmailOutput()).hasText("Email:" + email);
        assertThat(elementsPage.getCurrentAddressOutput()).hasText("Current Address :" + currentAddress);
        assertThat(elementsPage.getPermanentAddressOutput()).hasText("Permananet Address :" + permanentAddress);
    }
}
