public interface Jump {

    default void willJump() {
        System.out.println("I will jump");
    }
}
