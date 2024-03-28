package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public abstract class BasePage {

    private final Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    protected Page getPage() {
        return page;
    }

    protected Locator locator(String css) {
        return getPage().locator(css);
    }

    protected Locator textbox(String text) {
        return getPage().getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(text));
    }

    protected Locator heading(String text) {
        return getPage().getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(text));
    }

    protected Locator placeholder(String text) {
        return getPage().getByPlaceholder(text);
    }
}
