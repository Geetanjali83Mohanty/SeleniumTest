package com.uniblox.helpers;

import com.uniblox.pages.AddressPage;
import com.uniblox.runners.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class WebElementHelper {

    @Autowired
    private Hook hooks;

    @Autowired
    private VisibilityHelper visibilityHelper;

    /**
     * Switch to a new tab
     * Clicking element in parent tab control navigated -> child tab
     */
    public void switchNewTab() {
        hooks.getDriver().getWindowHandles().forEach(tab-> hooks.getDriver().switchTo().window(tab));
    }

    /**
     * Return Boolean value for title of webpage
     * This function will return true or false
     */

    public Boolean isAt(String title) {
        return hooks.getDriver().getTitle().contains(title);
    }

    /**
     * Select drop down value
     * This function uses Select class to select value
     * from drop down
     */
    public void selectDropdownValue(String id, String strText) {
        Select fruits = new Select(hooks.getDriver().findElement(By.id(id)));
        fruits.selectByVisibleText(strText);
    }

    /**
     * Wait and Watch method
     * This function is used to handle sync issues
     */
    public void waitAndWatch(int millisec){
        try{
            Thread.sleep(millisec);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}


