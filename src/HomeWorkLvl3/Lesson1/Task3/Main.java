package HomeWorkLvl3.Lesson1.Task3;

/**
 * Проверка работы
 */
public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 100; i++) {
            appleBox1.add(new Apple());
            orangeBox1.add(new Orange());

        }
        for (int i = 0; i < 30; i++) {
            appleBox2.add(new Apple());
            orangeBox2.add(new Orange());

        }
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(appleBox1.getFruits());
        System.out.println(orangeBox1.getFruits());
        System.out.println(appleBox2.getFruits());
        System.out.println(orangeBox2.getFruits());
        System.out.println("Вес 1 коробки с яблоками до пересыпания " + appleBox1.getWeight());
        System.out.println("Вес 2 коробки с яблоками до пересыпания " + appleBox2.getWeight());
        appleBox1.splitBox(appleBox2);
        System.out.println("Вес 1 коробки с яблоками после пересыпания " + appleBox1.getWeight());
        System.out.println("Вес 2 коробки с яблоками после пересыпания " + appleBox2.getWeight());

    }
}
