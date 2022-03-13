package com.simpleApp.person.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Marium",
                        "mariam.j@gm.com",
                        LocalDate.of(2000, Month.APRIL,5),
                        21
                ),
                new Student(
                        1L,
                        "Marium",
                        "mariam.j@gm.com",
                        LocalDate.of(2000, Month.APRIL,5),
                        21
                )
        );
    }
}
