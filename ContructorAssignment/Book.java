package ContructorAssignment;
// Q 2 Create a class named Book with the following attributes:
// è title (String): to store the title of the book.
// è author (String): to store the author of the book.
// è isbn (String): to store the ISBN number of the book.
// Implement a constructor to initialize these attributes.
// ·         In the main method, create an array named library that can hold up to 5 Book objects.
// ·         Initialize the library array with different Book objects. You can choose any books you like or create fictional ones.
// ·         Write
// a method named displayLibrary that takes the library array as a
// parameter and displays the details of each book in the array.
// ·         Write
// a method named searchBook that takes the library array and a book title
// as parameters. This method should search for the book with the given
// title in the library array and display its details if found. If the book
// is not found, it should print a message indicating that the book is not
// in the library.


public class Book {
    String title;
    String isbn;
    String author;

    Book(){
        System.out.println("default constructor");
    }
    Book(String title,String isbn,String author){
        System.out.println("Parameterized Constructor");
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    void display(){
        System.out.println("Title:="+title);
        System.out.println("ISBN: "+isbn);
        System.out.println("The author :"+ author );
    }

    static void displayLibrary(Book[] library) {

        for (int i = 0; i < library.length; i++) {

            if (library[i] != null) {
                library[i].display();
            }
        }
    }

        // Search book by title
    static void searchBook(Book[] library, String searchTitle) {

        for (int i = 0; i < library.length; i++) {

            if (library[i] != null &&
                library[i].title.equalsIgnoreCase(searchTitle)) {

                System.out.println("Book Found:");
                library[i].display();
                return;
            }
        }

        System.out.println("Book is not available in the library.");
    }


    public static void main(String []args){
        Book library[] = new Book[5];


                // Creating books
        library[0] = new Book(
                "The Alchemist",
                "9780061122415",
                "Paulo Coelho"
        );

        library[1] = new Book(
                "Harry Potter",
                "9780747532743",
                "J.K. Rowling"
        );

        library[2] = new Book(
                "1984",
                "9780451524935",
                "George Orwell"
        );

        library[3] = new Book(
                "Wings of Fire",
                "9788173711466",
                "A.P.J. Abdul Kalam"
        );

        library[4] = new Book(
                "The Hobbit",
                "9780547928227",
                "J.R.R. Tolkien"
        );


        // Display all books
        displayLibrary(library);

        // Search book
        searchBook(library, "1984");

        // Search unavailable book
        searchBook(library, "Java Programming");
    }
    
}
