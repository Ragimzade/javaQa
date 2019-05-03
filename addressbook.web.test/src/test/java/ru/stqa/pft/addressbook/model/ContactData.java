package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middleName;
    private final String lastName;
    private String group;


    public ContactData(String firstname, String middleName, String lastName, String group) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

}
