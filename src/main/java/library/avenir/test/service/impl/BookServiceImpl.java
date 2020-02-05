package library.avenir.test.service.impl;

import library.avenir.test.dto.book.UpdateBookQuantityDto;
import library.avenir.test.entity.Book;
import library.avenir.test.repository.BookRepository;
import library.avenir.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void updateQuantity(Long id, UpdateBookQuantityDto dto) {
        Book updatingBook = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Book with id " + id));
        updatingBook.setQuantity(dto.getQuantity());
        bookRepository.save(updatingBook);
    }
}
