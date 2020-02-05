package library.avenir.test.controller;

import library.avenir.test.dto.book.UpdateBookQuantityDto;
import library.avenir.test.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/{id}/updateQuantity")
    private void updateQuantity(@RequestBody UpdateBookQuantityDto dto,
                                @PathVariable Long id) {
        bookService.updateQuantity(id, dto);
    }
}
