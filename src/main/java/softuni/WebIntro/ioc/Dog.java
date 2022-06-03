package softuni.WebIntro.ioc;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PostConstruct;

public class Dog implements Animal, DisposableBean {

    private boolean superDog;

    public Dog() {
        this(false);
    }

    public Dog(boolean superDog) {
        this.superDog = superDog;
    }

    @Override
    public void makeNoise() {
        if (superDog) {
            System.out.println("Super bow, super bow");
        } else {
            System.out.println("Bark, bark");
        }
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("The dog is ready to walk");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dog is about to sleep");
    }
}
