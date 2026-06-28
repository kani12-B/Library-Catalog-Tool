import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Catalog Tool =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String title = sc.nextLine();

                    books.add(new Book(id, title));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println("ID: " + b.id + " Name: " + b.title);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(search)) {
                            System.out.println("Book Found: ID=" + b.id + ", Name=" + b.title);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
