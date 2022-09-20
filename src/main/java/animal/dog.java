package animal;

public class dog extends animal implements animalExperience{
    public dog(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println("dog");
    }

    @Override
    public void AnimalExperience() {
        System.out.println("Very kind and friendly");
    }
}
