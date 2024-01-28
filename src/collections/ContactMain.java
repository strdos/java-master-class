package collections;

public class ContactMain {

    public static void main(String[] args) {

        Contact abbey = new Contact("Abbey", "abbyy@abc.com", 123456789);
        System.out.println(abbey.toString());
        abbey.mergeContactData(new Contact("Abbey", "abb22@abc.com"));
        System.out.println(abbey.toString());
        abbey.mergeContactData(new Contact("Abbey", "abb22@abc.com", 123456789));
        System.out.println(abbey.toString());

    }

}
