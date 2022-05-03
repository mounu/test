public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        Dog dog = new Dog("pixy",4, "black");
        Frog frog = new Frog("jimmy", 5, "green");
        System.out.println(dog.toString());
        System.out.println(frog.toString());
        dog.willBark();
        frog.willCroak();
        dog.willJump();
        dog.willJump();
    }

}
