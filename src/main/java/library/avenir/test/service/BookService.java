package library.avenir.test.service;

import library.avenir.test.dto.book.BookDto;
import library.avenir.test.dto.book.UpdateBookQuantityDto;

import java.util.List;

public interface BookService {
    void updateQuantity(Long id, UpdateBookQuantityDto dto);
    List<BookDto> findAll();
}
