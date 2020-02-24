package library.avenir.test.controller;

import library.avenir.test.dto.author.AuthorDto;
import library.avenir.test.dto.book.BookIdsDto;
import library.avenir.test.filterrequest.author.AuthorFilterRequest;
import library.avenir.test.service.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    private List<AuthorDto> findAll() {
        return authorService.findAll();
    }

    @PostMapping("/{id}")
    private void bindBooksWithAuthor(@PathVariable Long id,
                                     @RequestBody BookIdsDto dto) {
        authorService.bindBooksWithAuthor(id, dto);
    }

    @PostMapping("/search")
    private Page<AuthorDto> search(@RequestBody AuthorFilterRequest filterRequest) {
        return authorService.search(filterRequest);
    }
}
