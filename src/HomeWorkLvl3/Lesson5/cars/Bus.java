package HomeWorkLvl3.Lesson5.cars;

import HomeWorkLvl3.Lesson5.gasStation.FuelStation;

public class Bus extends Cars {
    private final String stringId;

    public Bus(FuelStation fuelStation) {
        super(fuelStation);
        super.setFuelFullCapacities(40);
        super.setFuelCapacities(40);
        super.setFuelConsumption(7.5f);
        stringId = getStringID();
    }

    @Override
    public void run() {
        super.run();
    }
}