package FactoryMethod;

public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("I have max sped 120km/h");
    }

    @Override
    public void stop() {
        System.out.println("i stop in 15 sec");
    }
}
