package onebitflix.api.onebitflix_backend.services;

import onebitflix.api.onebitflix_backend.dto.CourseDto;
import onebitflix.api.onebitflix_backend.models.CourseModel;
import onebitflix.api.onebitflix_backend.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseDto> featured(){

        List<CourseModel> courses = courseRepository.findByFeatured(true);

        return courses.stream().map(
                courseModel -> new CourseDto(
                        courseModel.getId(),
                        courseModel.getName(),
                        courseModel.getSynopsis(),
                        courseModel.getThumbnail_url()
                )
        ).toList();
    }

    public List<CourseDto> searchByName(String name){

        List<CourseModel> courses = courseRepository.findByNameContainingIgnoreCase(name);

        return courses.stream().map(
                courseModel -> new CourseDto(
                        courseModel.getId(),
                        courseModel.getName(),
                        courseModel.getSynopsis(),
                        courseModel.getThumbnail_url()
                )
        ).toList();
    }
}
