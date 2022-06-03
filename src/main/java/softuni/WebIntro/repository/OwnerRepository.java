package softuni.WebIntro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.WebIntro.model.entity.OwnerEntity;

@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Long> {

}
