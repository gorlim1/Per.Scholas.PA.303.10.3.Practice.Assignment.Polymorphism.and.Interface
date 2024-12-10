public class AdultUser implements LibraryUser {

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

        if (age >= 12) {

            System.out.println("You have successfully registered under an Adult Account.");

        } else {

            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {

        if (bookType.equals("Fiction")) {

            System.out.println("Book Issued successfully, please return the book within 7 days.");

        } else {

            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}


//The methods in the AdultUser class should perform the following logic.
//
//registerAccount : If age >= 12, a message displaying “You have successfully
// registered under an Adult Account.” should be displayed in the console.
//If age <= 11, a message displaying, “Sorry, age must be greater than 12 to
// register as an adult.” should be displayed in the console.
//requestBook : If bookType is “Fiction,” a message displaying “Book Issued
// successfully, please return the book within 7 days.” should be displayed in the console.
//Else, a message displaying, “Oops, you are allowed to take only adult Fiction books.”
// should be displayed in the console.