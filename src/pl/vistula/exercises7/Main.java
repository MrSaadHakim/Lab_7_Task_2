package pl.vistula.exercises7;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Butkus", 5, 15, "Carnivora", "Mastiff");
        animals[1] = new Pigeon("Pablo", 2, 1, "Grey", "Spain");
        animals[2] = new Blowfish("Nemo", 1, 3, "Blue", 10);

        for (Animal a : animals) {
            System.out.println(a);
            a.getVoice();
            a.eat("food");
            System.out.println();
        }
    }
}
