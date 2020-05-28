package hw1;

public class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }

    public Apple() {
        super(1);
    }

    public FruitType getType() {
        return FruitType.Apple;
    }
}
