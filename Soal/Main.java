package Soal;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class ReadingList<T extends Book> {
    private ArrayList<T> books;

    public ReadingList() {
        this.books = new ArrayList<>();
    }

    public void addBook(T book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Reading list is empty.");
        } else {
            System.out.println("Reading List:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i).getTitle());
            }
        }
    }

    public void switchToCompletedList(int index, ReadingList<T> completedList) {
        if (index >= 0 && index < books.size()) {
            T book = books.remove(index);
            completedList.addBook(book);
            System.out.println("Book moved to completed list.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("Book removed from reading list.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadingList<Book> readingList = new ReadingList<>();
        ReadingList<Book> completedList = new ReadingList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan List Buku");
            System.out.println("3. Pindahkan ke List Tamat");
            System.out.println("4. List Buku Tamat");
            System.out.println("5. Hapus Buku");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Judul Buku: ");
                    String title = scanner.nextLine();
                    Book book = new Book(title);
                    readingList.addBook(book);
                    System.out.println("Buku ditambahkan ke List Baca.");
                    break;
                case 2:
                    readingList.displayBooks();
                    break;
                case 3:
                    System.out.print("Masukkan index buku untuk memindahkan: ");
                    int index = scanner.nextInt();
                    readingList.switchToCompletedList(index - 1, completedList);
                    break;
                case 4:
                    completedList.displayBooks();
                    break;
                case 5:
                    System.out.print("Masukkan index buku untuk menghapus: ");
                    int removeIndex = scanner.nextInt();
                    readingList.removeBook(removeIndex - 1);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Tolong masukkan angka dari 1 sampai 6.");
            }
        }
    }
}
