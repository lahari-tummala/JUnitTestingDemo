package com.springboot.junittestingdemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @GetMapping()
    public String getStudents(){
        return " HTTP GET REQUEST";
    }

    @GetMapping(path = "/{StudentID}")
    public String getStudentByID(@PathVariable String StudentID){
        return " HTTP GET REQUEST " + StudentID;
    }

    @PostMapping ()
    public String CreateStudent(){
        return " HTTP POST REQUEST";
    }

    @PutMapping()
    public String UpdateStudent(){
        return " HTTP UPDATE REQUEST";
    }

    @DeleteMapping()
    public String DeleteStudent(){
        return " HTTP DELETE REQUEST";
    }
}
