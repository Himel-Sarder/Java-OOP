class Book {
    String title;
    String author;
    int year;

    // Constructor with three parameters
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Constructor with two parameters (defaulting year to 2020)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 2020; // Default year
    }

    // Constructor with one parameter (defaulting title and author)
    Book(int year) {
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = year;
    }

    // Method to display book details
    void display() {
        System.out.println("Book: " + title + " by " + author + ", published in " + year);
    }
}
    public class overloadingConstructor{
        public static void main(String[] args) {
            // Creating objects using different constructors
            Book book1 = new Book("Java Programming", "John Doe", 2021);
            book1.display();
            
            Book book2 = new Book("Python Basics", "Jane Smith");
            book2.display();
            
            Book book3 = new Book(2022);
            book3.display();
        }
    }
