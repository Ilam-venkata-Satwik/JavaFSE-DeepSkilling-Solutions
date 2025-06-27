import java.util.Arrays;

 class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Algorithms", "CLRS"),
            new Book(2, "Java Basics", "Herbert"),
            new Book(3, "Zoology", "Author Z")
        };

        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));

        System.out.println("Linear: " + LibrarySearch.linearSearch(books, "Zoology"));
        System.out.println("Binary: " + LibrarySearch.binarySearch(books, "Zoology"));
    }
}