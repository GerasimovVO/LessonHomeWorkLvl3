package HomeWorkLvl3.Lesson1.Task3;

abstract class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
