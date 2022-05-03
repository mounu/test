public class Dog extends Animal implements Bark,Jump  {
    private int legs;
    private String color;
    public Dog(String name, int legs, String color) {
        super();
        super.name = name;
        this.legs = legs;
        this.color = color;
    }

    public int getLegs() {
        return legs;
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
    public void willBark() {
        System.out.println(" Being a dog, I bark very loud");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void willJump() {
        System.out.println(" I like jumping ");
    }

}
