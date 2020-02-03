package library.avenir.test.mapper;

import library.avenir.test.dto.StudentCreateDto;
import library.avenir.test.dto.StudentDto;
import library.avenir.test.dto.StudentUpdateDto;
import library.avenir.test.entity.Student;

public interface StudentMapper {
    StudentDto toStudentDto(Student student);
    Student toStudent(StudentCreateDto studentCreateDto);
    Student toStudent(Student updatingStudent, StudentUpdateDto studentUpdateDto);
}
