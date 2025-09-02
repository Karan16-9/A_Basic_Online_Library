
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100]; //100 maximum books
        this.no_of_books = 0;

    }

    void addBook(String book){
        this.books[no_of_books] = book; //book will be inserted at 0th index
        no_of_books++; // no of books incremented from 0 to one after adding a book.
        System.out.println(book + " has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book:this.books){ //for each loop or enhanced loop
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){

            for(int i = 0; i <this.books.length; i++){
                if(this.books[i].equals(book)){
                    System.out.println("The book has been issued");
                    this.books[i] = null;
                    return;
            }
            System.out.println("* "+ book);
        }
        System.out.println("This book does not exist");

    }

    void returnBook(String book){
        addBook(book);


    }
}




public class OnlineLibrary {
        public static void main(String[] args) {
            // you have to implement a library usign java class library
            // Methods: issueBook, returnBook, showAvailableBooks, addBook
            // Properties: Array to store the issued books
            // Array to store the available books
            Library centralLibrary = new Library();
            centralLibrary.addBook("Sherlock Holmes");
            centralLibrary.addBook("Yes, it is possible!");
            centralLibrary.addBook("Am I going right?");
            centralLibrary.showAvailableBooks();
            centralLibrary.issueBook("Sherlock Holmes");
            centralLibrary.showAvailableBooks();
            centralLibrary.returnBook("Sherlock Holmes");
            centralLibrary.showAvailableBooks();
            //
            //
            //


        }
    }
