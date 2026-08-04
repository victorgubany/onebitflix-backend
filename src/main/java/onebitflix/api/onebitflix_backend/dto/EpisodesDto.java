package onebitflix.api.onebitflix_backend.dto;

public record EpisodesDto(
        Integer id,
        String name,
        String synopsis,
        Integer order,
        String videoUrl,
        Integer secondsLong
) {
}
