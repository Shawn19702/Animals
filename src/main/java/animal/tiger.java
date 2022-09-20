package animal;

public class tiger extends animal{
    public tiger(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println("Tiger");
    }
}
