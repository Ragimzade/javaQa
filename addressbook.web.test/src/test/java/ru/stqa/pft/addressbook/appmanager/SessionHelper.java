package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    protected void login(String username, String password) {
        type(By.name("user"), "admin");
        type(By.name("pass"), "secret");
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]"));
    }
}
