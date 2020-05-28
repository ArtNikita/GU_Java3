package hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

    //first task
    private static <T> boolean switchArrayElements(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex < array.length && secondIndex < array.length &&
                firstIndex >= 0 && secondIndex >= 0) {
            T temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
            return true;
        }
        return false;
    }

    //second task
    private static <T> ArrayList<T> arrayToArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
        //можно, конечно, было пробежаться по всем элементам массива array и добавить
        //их в arrayList, но зачем, если можно проинициализировать коллекцией?
    }

    public static void main(String[] args) {
        System.out.println("switchArrayElements() method tests\n----------------");
        String[] stringArray = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(stringArray));//a b c d
        System.out.println(switchArrayElements(stringArray, 1, 3));//true
        System.out.println(Arrays.toString(stringArray));//a d c b
        System.out.println(switchArrayElements(stringArray, -1, 3));//false
        System.out.println(switchArrayElements(stringArray, 1, 4));//false
        System.out.println(Arrays.toString(stringArray));//a d c b
        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println(switchArrayElements(integerArray, 0, 1));//true
        System.out.println(Arrays.toString(integerArray));//2 1 3 4 5
        System.out.println(switchArrayElements(integerArray,-1, -2));//false
        System.out.println(Arrays.toString(integerArray));//2 1 3 4 5
        System.out.println("----------------");

        System.out.println("arrayToArrayList() method tests\n----------------");
        Integer[] intArray = {2, 3, 9};
        System.out.println(intArray.getClass() + ": " + Arrays.toString(intArray));
        ArrayList<Integer> convertedIntArray = arrayToArrayList(intArray);
        System.out.println(convertedIntArray.getClass() + ": " + convertedIntArray);
        System.out.println("----------------");

        System.out.println("Box with fruits:\n----------------");
        Box<Apple> appleBox1 = new Box<Apple>();
        appleBox1.putFruit(new Apple());
        appleBox1.putFruit(new Apple());
        appleBox1.putFruit(new Apple());
        Box<Apple> appleBox2 = new Box<Apple>();
        appleBox2.putFruit(new Apple());
        appleBox2.putFruit(new Apple());
        appleBox2.putFruit(new Apple());
        System.out.println(appleBox1.compare(appleBox2));//true
        appleBox2.takeFruit();
        System.out.println(appleBox1.compare(appleBox2));//false
        Box<Orange> orangeBox1 = new Box<Orange>();
        orangeBox1.putFruit(new Orange());
        orangeBox1.putFruit(new Orange());
        System.out.println(orangeBox1.compare(appleBox1));//true
        System.out.println(appleBox1.pourFruits(orangeBox1));//false
        System.out.println(appleBox1.getWeight());//3
        System.out.println(orangeBox1.getWeight());//3
        System.out.println(appleBox1.pourFruits(appleBox2));//true
        System.out.println(appleBox1.getWeight());//0
        System.out.println(appleBox2.getWeight());//5
        System.out.println("----------------");
    }
}
