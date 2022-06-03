package softuni.WebIntro.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ZooConfig {

//    @Primary    // Runs only the dog implementation
    @Bean("normalDog")
    public Animal dog() {
        return new Dog();
    }

    @Bean
    public Animal cat() {
        return new Cat();
    }

    @Bean("mySuperDg")
    public Animal superDg() {
        // TODO:  add superpower
        return new Dog(true);
    }
}
