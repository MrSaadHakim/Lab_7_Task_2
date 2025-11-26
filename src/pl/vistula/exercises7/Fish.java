package pl.vistula.exercises7;

public class Fish extends Animal {
    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Unknown";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Fish eats " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Fish is silent");
    }

    @Override
    public String toString() {
        return super.toString() + ", Scale color: " + scaleColor;
    }
}
