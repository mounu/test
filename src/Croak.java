public interface Croak {

    default void willCroak() {
        System.out.println("quaack");
    }
}
