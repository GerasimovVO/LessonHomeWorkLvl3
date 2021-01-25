package HomeWorkLvl3.Lesson5;
import HomeWorkLvl3.Lesson5.cars.Bus;
import HomeWorkLvl3.Lesson5.cars.Car;
import HomeWorkLvl3.Lesson5.cars.Cars;
import HomeWorkLvl3.Lesson5.cars.Truck;
import HomeWorkLvl3.Lesson5.gasStation.FuelStation;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static final int NUMBER_OF_CARS = 9;

    public static void main(String[] args) {
        ArrayList<Cars> carsArrayList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_CARS);

        for (int i = 0; i < NUMBER_OF_CARS; i++) {
            carsArrayList.add(getCars(i));
            executorService.submit(carsArrayList.get(i));
        }
        executorService.shutdown();
    }

    protected static Cars getCars(int i) {
        FuelStation fuelStation = new FuelStation();
        return i < NUMBER_OF_CARS / 3
                ? new Truck(fuelStation)
                : i > NUMBER_OF_CARS / 3 && i <= NUMBER_OF_CARS / 3 + NUMBER_OF_CARS / 3 ? new Bus(fuelStation)
                : new Car(fuelStation);
    }
}