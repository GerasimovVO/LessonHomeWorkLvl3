package HomeWorkLvl3.Lesson5.cars;

import HomeWorkLvl3.Lesson5.gasStation.FuelStation;

public class Truck extends Cars{
    private String stringId;

    public Truck(FuelStation fuelStation) {
        super(fuelStation);
        super.setFuelFullCapacities(60);
        super.setFuelCapacities(60);
        super.setFuelConsumption(15f);
        stringId = getStringID();
    }

    @Override
    public void run() {
        super.run();
    }
}
