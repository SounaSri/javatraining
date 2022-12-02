package test.java;
import java.util.ArrayList;
import java.util.List;

public class Lib {

    private List<Contact> contactList = new ArrayList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void updateContact(Contact contact) {
        contactList.update(contact);
    }

    public void deleteContact(Contact contact) {
        contactList.remove(contact);
    }

    public Contact getContact(String firstName);

    Contact searchedContact = new Contact();
    for(
    Contact contact:contactList)

    {
        searchedContact = contact;
        flag = true;

    }
    if(flag)

    {
        return searchContact;

    }
    else

    {
        return null;
    }
}








