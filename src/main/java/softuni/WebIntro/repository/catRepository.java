package softuni.WebIntro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.WebIntro.model.entity.CatEntity;

@Repository
public interface catRepository extends JpaRepository<CatEntity, Long> {

}
