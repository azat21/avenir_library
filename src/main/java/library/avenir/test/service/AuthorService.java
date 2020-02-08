package library.avenir.test.service;

import library.avenir.test.dto.author.AuthorDto;
import library.avenir.test.dto.book.BookIdsDto;

import java.util.List;

public interface AuthorService {
    public void bindBooksWithAuthor(Long id, BookIdsDto dto);

    List<AuthorDto> findAll();
}
