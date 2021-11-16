package RepeatBuilder;

public class CarBuilder {
    private int humanPlace;
    private String mark;
    private String color;
    private String type;

    public CarBuilder humanPlace(final int humanPlace){
        this.humanPlace = humanPlace;
        return  this;
    }
    public CarBuilder mark(final String mark){
        this.mark = mark;
        return this;
    }
    public CarBuilder color(final String color){
        this.color = color;
        return this;
    }
    public CarBuilder type(final String type){
        this.type = type;
        return this;
    }

    public int getHumanPlace() {
        return humanPlace;
    }
    public String getMark() {
        return mark;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }

    public Engineer build(){
        return new Engineer(this);
    }
}
