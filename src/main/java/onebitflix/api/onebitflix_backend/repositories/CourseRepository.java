package onebitflix.api.onebitflix_backend.repositories;

import onebitflix.api.onebitflix_backend.models.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseModel, Integer> {

    List<CourseModel> findByCategoryId(Integer categoryId);

}
