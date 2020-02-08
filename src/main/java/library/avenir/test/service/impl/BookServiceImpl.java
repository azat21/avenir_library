package library.avenir.test.service.impl;

import library.avenir.test.dto.book.BookDto;
import library.avenir.test.dto.book.UpdateBookQuantityDto;
import library.avenir.test.entity.Author;
import library.avenir.test.entity.Book;
import library.avenir.test.mapper.BookMapper;
import library.avenir.test.repository.BookRepository;
import library.avenir.test.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    @Transactional
    public void updateQuantity(Long id, UpdateBookQuantityDto dto) {
        Book updatingBook = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Book with id " + id));
        updatingBook.setQuantity(dto.getQuantity());
        bookRepository.save(updatingBook);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findAllById(List<Long> ids) {
        return bookRepository.findAllById(ids);
    }

    @Override
    public Book updateAuthor(Book book, Author author) {
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooksByAuthor(Author author) {
        return bookRepository.findAllByAuthor(author);
    }
}