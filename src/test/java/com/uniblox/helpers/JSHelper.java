package com.uniblox.helpers;

import com.uniblox.runners.Hook;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JSHelper {

    @Autowired
    private Hook hooks;


    /**
     * Click element using JavascriptExecutor
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to click
     */
    public void jsClick(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].click();", element);
    }


    /**
     * Scroll to element for view
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to scroll to and view
     */
    public void scrollToElement(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].scrollIntoView();", element);
    }


    /**
     * Highlight element
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to highlight
     */
    public void highlightElement(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].setAttribute('style', " +
                "'background: yellow; border: 2px solid red;');", element);
    }
}
