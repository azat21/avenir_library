package library.avenir.test.service;

import library.avenir.test.dto.StudentCreateDto;
import library.avenir.test.dto.StudentDto;
import library.avenir.test.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();

    StudentDto save(StudentCreateDto studentCreateDto);
}
