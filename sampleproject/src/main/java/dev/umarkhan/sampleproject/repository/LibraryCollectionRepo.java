package dev.umarkhan.sampleproject.repository;

import dev.umarkhan.sampleproject.model.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LibraryCollectionRepo {

    private final List<Book> books = new ArrayList<>();

    public LibraryCollectionRepo() {}

    public List<Book> findAll() {
        return books;
    }

    public Optional<Book> findById(Integer id) {
        return books.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Book book1 = new Book(
            1,
            "SPQR: A History of Rome",
            "Mary Beard",
            "September 6, 2016"
        );

        Book book2 = new Book(
            2,
            "The Fall of the Ottomans: The Great War in the Middle East",
            "Eugene Rogan",
            "October 4, 2016"
        );

        Book book3 = new Book(
            3,
            "Persian Fire: The First World Empire and the Battle for the West",
            "Tom Holland",
            "June 12, 2007"
        );

        Book book4 = new Book(
            4,
            "The Mongol Empire: Genghis Khan, His Heirs and the Founding of Modern China",
            "John Man",
            "October 1, 2016"
        );

        Book book5 = new Book(
            5,
            "The Rising Sun: The Decline and Fall of the Japanese Empire, 1936-1945",
            "John Toland",
            "May 27, 2003"
        );

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }
}
