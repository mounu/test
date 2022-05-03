public interface Bark {

    default void willBark() {
        System.out.println("Whow whow");
    }
}

