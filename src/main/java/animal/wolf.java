package animal;

public class wolf extends animal {
    public wolf(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println("wolf");
    }
}
