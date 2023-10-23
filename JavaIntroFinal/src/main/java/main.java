public class main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("name1", 123);
        myPhoneBook.add("name1", 456);
        myPhoneBook.add("name2", 456);
        myPhoneBook.add("name3", 123);
        myPhoneBook.add("name3", 456);
        myPhoneBook.add("name3", 456);

        System.out.println(myPhoneBook.find("name1"));
        System.out.println(myPhoneBook.find("Me"));

        myPhoneBook.getPhoneBook();
    }
}

