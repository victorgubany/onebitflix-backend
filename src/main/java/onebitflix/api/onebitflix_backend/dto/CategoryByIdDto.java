package onebitflix.api.onebitflix_backend.dto;

import java.util.List;

public record CategoryByIdDto(
        Integer id,
        String name,
        List<CourseDto> courses
        )
    {
}
