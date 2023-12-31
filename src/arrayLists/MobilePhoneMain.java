package arrayLists;

public class MobilePhoneMain {
    public static void main(String[] args) {

        Contact bob = Contact.createContact("Bob", "123456789");
        Contact alice = Contact.createContact("Alice", "564823987");
        Contact tom = Contact.createContact("Tom", "115566882");

        MobilePhone mobilePhone = new MobilePhone("1122334");

        mobilePhone.addNewContact(bob);
        System.out.println(mobilePhone.addNewContact(alice));
        System.out.println(mobilePhone.addNewContact(bob));

        mobilePhone.printContacts();

    }
}
