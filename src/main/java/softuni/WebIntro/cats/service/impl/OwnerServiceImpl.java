package softuni.WebIntro.cats.service.impl;

import org.springframework.stereotype.Service;
import softuni.WebIntro.cats.service.OwnerService;
import softuni.WebIntro.model.dto.CreateOwnerDTO;
import softuni.WebIntro.model.entity.CatEntity;
import softuni.WebIntro.model.entity.OwnerEntity;
import softuni.WebIntro.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

   private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void createOwner(CreateOwnerDTO createOwnerDTO) {

        OwnerEntity owner = new OwnerEntity()
                .setOwnerName(createOwnerDTO.getOwnerName());

        createOwnerDTO.getCatNames().forEach(
                name -> {
                    CatEntity cat = new CatEntity().setCatName(name)
                            .setOwner(owner);
                    owner.addCat(cat);
                }
        );
        ownerRepository.save(owner);
    }
}
