package onebitflix.api.onebitflix_backend.repositories;

import onebitflix.api.onebitflix_backend.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {

}
