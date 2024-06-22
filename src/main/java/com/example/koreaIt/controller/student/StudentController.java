package com.example.koreaIt.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") // 요청을 허용할 도메인
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/api/student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/api/major")
    public List<Student> getStudentsByMajor(@RequestParam String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/api/grade")
    public List<Student> getStudentsByGrade(@RequestParam String grade) {
        System.out.println("훑고감");
        return studentService.getStudentsByGrade(grade);
    }

}
