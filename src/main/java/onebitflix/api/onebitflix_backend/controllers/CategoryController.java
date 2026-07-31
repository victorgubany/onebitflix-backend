package onebitflix.api.onebitflix_backend.controllers;


import onebitflix.api.onebitflix_backend.dto.CategoryPaginationDto;
import onebitflix.api.onebitflix_backend.models.CategoryModel;
import onebitflix.api.onebitflix_backend.repositories.CategoryRepository;
import onebitflix.api.onebitflix_backend.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<CategoryPaginationDto> getAll(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer perPage
    ){
        CategoryPaginationDto categories =  categoryService.searchAll(page,perPage);
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getSpecific(@PathVariable Integer id){
        //TODO get specific courses of a category
        return ResponseEntity.ok(id);
    }

}
