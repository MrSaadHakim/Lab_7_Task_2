package pl.vistula.exercises7;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Pigeon eats " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon coos");
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}
