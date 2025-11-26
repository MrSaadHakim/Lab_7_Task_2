package pl.vistula.exercises7;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Dog eats " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Dog barks");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
