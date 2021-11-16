package FactoryMethod;

public class Porshe implements Car{
    @Override
    public void drive() {
        System.out.println("I have max sped 200km/h");
    }

    @Override
    public void stop() {
        System.out.println("i stop in 5 sec");

    }
}
