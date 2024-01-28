package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Contact {

    private String name;
    private HashSet<String> emails = new HashSet<>();
    private HashSet<String> phones = new HashSet<>();

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String email) {
        this(name);
        if (email != null) {
            emails.add(email);
        }
    }

    public Contact(String name, String email, long phone) {
        this(name, email);
        if (phone > 0) {
            String phoneAsString = String.valueOf(phone);
            String phoneAsStringFormatted = "(" + phoneAsString.substring(0, 3) + ")" + " " + phoneAsString.substring(3, 6) + "-" + phoneAsString.substring(6);
            phones.add(phoneAsStringFormatted);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact %s %n %s %n %s".formatted(name, emails, phones);
    }

    public Contact mergeContactData(Contact contact) {
        if (this.equals(contact)) {
        //if (this.name.equals(contact.getName())) {
            this.emails.addAll(contact.emails);
            this.phones.addAll(contact.phones);
        }
        return this;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return getName().equals(contact.getName()) &&
                Objects.equals(emails, contact.emails) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), emails, phones);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
