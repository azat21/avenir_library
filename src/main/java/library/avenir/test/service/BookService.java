package library.avenir.test.service;

import library.avenir.test.dto.book.BookDto;
import library.avenir.test.dto.book.UpdateBookQuantityDto;
import library.avenir.test.entity.Author;
import library.avenir.test.entity.Book;

import java.util.List;

public interface BookService {
    void updateQuantity(Long id, UpdateBookQuantityDto dto);
    List<BookDto> findAll();
    List<Book> findAllById(List<Long> ids);
    Book updateAuthor(Book book, Author author);
    List<Book> getBooksByAuthor(Author author);
}
