public class Frog extends Animal implements Jump,Croak {
    private int legs;
    private String color;

    public Frog(String name, int legs, String color) {
        super.name = name;
        this.legs = legs;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                '}';
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void willCroak() {
        System.out.println("Being a frog, I croak at night");
    }

    @Override
    public void willJump() {
        System.out.println(" I always jump to move forward ");
    }
}
