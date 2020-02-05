package library.avenir.test.service;

import library.avenir.test.dto.book.UpdateBookQuantityDto;

public interface BookService {
    void updateQuantity(Long id, UpdateBookQuantityDto dto);
}
