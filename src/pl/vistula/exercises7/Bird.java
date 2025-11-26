package pl.vistula.exercises7;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Bird eats " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird chirps");
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather color: " + featherColor;
    }
}
