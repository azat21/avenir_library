package library.avenir.test.controller;

import library.avenir.test.dto.StudentDto;
import library.avenir.test.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    private List<StudentDto> findAll() {
        return studentService.findAll();
    }
}
