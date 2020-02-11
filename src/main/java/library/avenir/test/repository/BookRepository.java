package library.avenir.test.repository;

import library.avenir.test.entity.Author;
import library.avenir.test.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(Author author);
    List<Book> findAllByNameContainsIgnoreCase(String searchString);
}
