package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() throws Exception {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("123","123","432","dfg"), true );
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(new ContactData("test","test2", "test3", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
