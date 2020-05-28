package hw1;

public class Orange extends Fruit {
    public Orange() {
        super(1.5);
    }

    public Orange(int weight) {
        super(weight);
    }

    public FruitType getType() {
        return FruitType.Orange;
    }
}
