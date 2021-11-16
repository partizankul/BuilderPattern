package RepeatBuilder;

public class Engineer {
    private final int humanPlace;
    private final String mark;
    private final String color;
    private final String type;

    Engineer (final CarBuilder carBuilder){
        this.humanPlace = carBuilder.getHumanPlace();
        this.mark = carBuilder.getMark();
        this.color = carBuilder.getColor();
        this.type = carBuilder.getType();
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "humanPlace=" + humanPlace +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
