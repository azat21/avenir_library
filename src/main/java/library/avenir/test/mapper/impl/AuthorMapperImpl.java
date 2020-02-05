package library.avenir.test.mapper.impl;

import library.avenir.test.dto.author.AuthorDto;
import library.avenir.test.entity.Author;
import library.avenir.test.mapper.AuthorMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public AuthorDto toAuthorDto(Author author) {
        AuthorDto dto = new AuthorDto();
        dto.setBiography(author.getBiography());
        dto.setBirthDate(author.getBirthDate());
        dto.setDeathDate(author.getDeathDate());
        dto.setFirstName(author.getFirstName());
        dto.setLastName(author.getLastName());
        dto.setId(author.getId());
        return dto;
    }
}
