package arrayLists;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (!myContacts.contains(oldContact)) {
            return false;
        } else {
            int oldContactIndex = myContacts.indexOf(oldContact);
            myContacts.set(oldContactIndex, newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.remove(contact);
            return true;
        }
    }

    private int findContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            return -1;
        } else {
            return myContacts.indexOf(contact);
        }
    }

    private int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return - 1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(myContacts.indexOf(contact) + 1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
