package onebitflix.api.onebitflix_backend.dto;

import java.util.List;

public record CourseDetailDto(
        Integer id,
        String name,
        String synopsis,
        String thumbnailUrl,
        List<EpisodesDto> episodes,
        Boolean liked
) {
}
