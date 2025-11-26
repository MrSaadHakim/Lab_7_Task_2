package pl.vistula.exercises7;

public class Blowfish extends Fish {
    private int diameter;

    public Blowfish() {
        super();
        this.diameter = 0;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Blowfish eats " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish doesn’t make sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", Diameter: " + diameter;
    }
}
