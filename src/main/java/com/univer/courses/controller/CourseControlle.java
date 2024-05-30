package com.univer.courses.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@Controller
@RequestMapping("/api/univer")
public class CourseControlle {
@GetMapping("/courses")
public List<String> coursesList(){
return Arrays.asList("Ana", "laura");
}
}
