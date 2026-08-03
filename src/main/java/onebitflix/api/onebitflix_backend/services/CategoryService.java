package onebitflix.api.onebitflix_backend.services;

import onebitflix.api.onebitflix_backend.dto.CategoryByIdDto;
import onebitflix.api.onebitflix_backend.dto.CategoryPaginationDto;
import onebitflix.api.onebitflix_backend.models.CategoryModel;
import onebitflix.api.onebitflix_backend.repositories.CategoryRepository;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryPaginationDto searchAll(Integer page, Integer perPage){

        Pageable pageable = PageRequest.of(page -1 ,perPage);
        Page<CategoryModel> pageResult =  categoryRepository.findAll(pageable);

        return new CategoryPaginationDto(
                pageResult.getContent(),
                page,
                perPage,
                pageResult.getTotalElements()
        );
    }

    public CategoryByIdDto searchSpecific(Integer id){

        var categorie = categoryRepository.findById(id).orElse(null);

        if(categorie == null){
            System.out.println("nao achou");
        }


        return new CategoryByIdDto(
                categorie.getId(),
                categorie.getName(),
                null
        );
    }
}
