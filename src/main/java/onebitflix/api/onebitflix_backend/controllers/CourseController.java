package onebitflix.api.onebitflix_backend.controllers;

import onebitflix.api.onebitflix_backend.dto.CourseDto;
import onebitflix.api.onebitflix_backend.repositories.CourseRepository;
import onebitflix.api.onebitflix_backend.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("featured")
    public ResponseEntity<List<CourseDto>> featuredCourses(){

        List<CourseDto> courses = courseService.featured();

        return ResponseEntity.ok(courses);
    }

    @GetMapping("search")
    public ResponseEntity<List<CourseDto>> searchCourses(@RequestParam(defaultValue = "") String name){

        List<CourseDto> courses = courseService.searchByName(name);

        return ResponseEntity.ok(courses);
    }

}
