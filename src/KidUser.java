public class KidUser implements LibraryUser {

    private int age = 0;
    private String bookType = "";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }


    @Override
    public void registerAccount() {

        if (age <= 11) {

            System.out.println("You have successfully registered under a Kids Account");

        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {

        if (bookType.equals("Kids")) {

            System.out.println("Book issued successfully, please return the book within 10 days");

        } else {

            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}


//The methods in the KidUser class should perform the following logic.
//registerAccount: If age <= 11, a message displaying “You have successfully
// registered under a Kids Account” should be displayed in the console.
//If (age > 11), a message displaying, “Sorry, age must be less than 12
// to register as a kid.” should be displayed in the console.
//requestBook: If bookType is “Kids,” a message displaying “Book issued successfully,
// please return the book within 10 days” should be displayed in the console.
//Else, a message displaying, “Oops, you are allowed to take only kids books.”
// should be displayed in the console.