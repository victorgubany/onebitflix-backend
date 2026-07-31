package onebitflix.api.onebitflix_backend.dto;

import onebitflix.api.onebitflix_backend.models.CategoryModel;

import java.util.List;

public record CategoryPaginationDto
        (
         List<CategoryModel> categories,
         Integer page,
         Integer perPage,
         long total
        ){
}
