package hw1;

public class Fruit {
    private FruitType type;

    public FruitType getType(){
        return type;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }
}
