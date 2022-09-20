package animal;

public class cat extends animal{
    public cat(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println("Cat");

    }
}
