package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String midname;
    private final String lastname;

    public ContactData(String firstname, String midname, String lastname) {
        this.firstname = firstname;
        this.midname = midname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMidname() {
        return midname;
    }

    public String getLastname() {
        return lastname;
    }
}
