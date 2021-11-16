package RepeatBuilder;

public class CarBuilderPattern {
    public static void main(String[] args) {
        final Engineer engineer = new CarBuilder()
                .humanPlace(4)
                .type("Sedan")
                .color("Red")
                .build();

        final Engineer ford = new CarBuilder()
                .humanPlace(2)
                .mark("Escort").color("Green").type("Cupe").build();

                System.out.println(ford);
    }


}
