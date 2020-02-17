package library.avenir.test.filterrequest.book;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;

@Getter
@Setter
public class BookFilterRequest {
    private PageRequest pageRequest;
    private BookSearchRequest searchRequest;
}
