package FactoryMethod;

public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        System.out.println("city");
        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();
        System.out.println("gazon");
        car = carSelector.getCar(RoadType.GAZON);
        car.drive();
        car.stop();

        System.out.println("off road");
        car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();


    }
}
