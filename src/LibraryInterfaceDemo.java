public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser objectKidUser1 = new KidUser();

        objectKidUser1.setAge(10);
        objectKidUser1.registerAccount();
        objectKidUser1.setAge(18);
        objectKidUser1.registerAccount();

        objectKidUser1.setBookType("Kids");
        objectKidUser1.requestBook();
        objectKidUser1.setBookType("Fiction");
        objectKidUser1.requestBook();

        AdultUser objectAdultUser1 = new AdultUser();

        objectAdultUser1.setAge(5);
        objectAdultUser1.registerAccount();
        objectAdultUser1.setAge(23);
        objectAdultUser1.registerAccount();

        objectAdultUser1.setBookType("Kids");
        objectAdultUser1.requestBook();
        objectAdultUser1.setBookType("Fiction");
        objectAdultUser1.requestBook();
    }
}
