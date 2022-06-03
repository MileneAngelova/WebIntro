package softuni.WebIntro.cats;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.WebIntro.cats.service.OwnerService;
import softuni.WebIntro.model.dto.CreateOwnerDTO;

import java.util.List;

@Component
public class Demo implements CommandLineRunner {

    private OwnerService ownerService;

    public Demo(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        ownerService.createOwner(new CreateOwnerDTO()
                .setOwnerName("Jamin")
                .setCatNames(List.of("Masha", "Tom")));
    }
}
