package HomeWorkLvl3.Lesson1.Task3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public void addFruits(ArrayList<T> fruits){
        this.fruits.addAll(fruits);
    }

    public ArrayList<T> getFruits(){
        return fruits;
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits)
            totalWeight += fruit.getWeight();
        return totalWeight;
    }

    public boolean compare(Box<?> box){
        return Float.compare(getWeight(),box.getWeight()) == 0;
    }

    public void splitBox(Box<T> box){
        box.addFruits(getFruits());
        fruits.clear();
    }
}
