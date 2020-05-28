package hw1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private double sumWeight;
    private ArrayList<T> fruitsArrayList;
    private T example;

    public double getWeight() {
        return sumWeight;
    }

    public boolean compare(Box otherBox) {
        return sumWeight == otherBox.getWeight();
    }

    public Box() {
        fruitsArrayList = new ArrayList<T>();
    }

    public Box(ArrayList<T> fruitsArrayList) {
        this.fruitsArrayList = fruitsArrayList;
        for (T t : fruitsArrayList) {
            sumWeight += t.getWeight();
        }
        if (sumWeight > 0){
            example = fruitsArrayList.get(0);
        }
    }

    public boolean pourFruits(Box otherBox) {
        if (example.getClass() != otherBox.example.getClass()){
            return false;
        }
        int size = fruitsArrayList.size();
        for (int i = 0; i < size; i++) {
            otherBox.putFruit(this.takeFruit());
        }
        return true;
    }

    public boolean putFruit(T fruit) {
        fruitsArrayList.add(fruit);
        sumWeight += fruit.getWeight();
        example = fruit;
        return true;
    }

    public T takeFruit() {
        if (sumWeight > 0) {
            T fruit = fruitsArrayList.remove(fruitsArrayList.size() - 1);
            sumWeight -= fruit.getWeight();
            return fruit;
        }
        return null;
    }
}
