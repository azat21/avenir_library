package library.avenir.test.mapper;

import library.avenir.test.dto.author.AuthorDto;
import library.avenir.test.entity.Author;

public interface AuthorMapper {
    AuthorDto toAuthorDto(Author author);
}
