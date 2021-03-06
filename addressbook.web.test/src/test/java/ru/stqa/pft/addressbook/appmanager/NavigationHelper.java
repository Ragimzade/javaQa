package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {

        super(driver);
    }

    public void goToGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
        System.out.println("not returned");
    }

    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            System.out.println("returned");
            return;

        }
        click(By.linkText("home"));
    }
}
