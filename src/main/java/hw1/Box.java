package hw1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private double sumWeight;
    private ArrayList<T> fruitsArrayList;
    private FruitType boxType;

    public double getWeight() {
        return sumWeight;
    }

    public boolean compare(Box otherBox) {
        return sumWeight == otherBox.getWeight();
    }

    public Box() {
        fruitsArrayList = new ArrayList<T>();
        //fruitsArrayList.add((T) new Fruit(1));
        //boxType = this.takeFruit().getType();
    }

    public Box(ArrayList<T> fruitsArrayList) {
        this.fruitsArrayList = fruitsArrayList;
        for (T t : fruitsArrayList) {
            sumWeight += t.getWeight();
        }
        //fruitsArrayList.add((T) new Fruit(1));
        //boxType = this.takeFruit().getType();
    }

    public boolean pourFruits(Box otherBox) {
        if (otherBox.boxType == this.boxType) {
            int size = fruitsArrayList.size();
            for (int i = 0; i < size; i++) {
                otherBox.putFruit(this.takeFruit());
            }
            return true;
        }
        return false;
    }

    public boolean putFruit(T fruit) {
        //if (fruit.getType() == this.boxType) {
            fruitsArrayList.add(fruit);
            sumWeight += fruit.getWeight();
            return true;
        //}
        //return false;
    }

    public T takeFruit() {
        if (sumWeight > 0){
            T fruit = fruitsArrayList.remove(fruitsArrayList.size() - 1);
            sumWeight -= fruit.getWeight();
            return fruit;
        }
        return null;
    }
}
