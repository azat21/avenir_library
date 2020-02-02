package library.avenir.test.service;

import library.avenir.test.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
}
