package library.avenir.test.filterrequest.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookFilterRequest {
    private PageRequest pageRequest;
    private BookSearchRequest searchRequest;
}
