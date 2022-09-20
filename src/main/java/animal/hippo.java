package animal;

public class hippo extends animal implements animalExperience {

    public hippo(String name) {
        super(name);
    }



    @Override
    public void printAnimalName() {
        System.out.println("hippo");
    }

    @Override
    public void AnimalExperience() {
        System.out.println("Very dangerous");
    }
}
