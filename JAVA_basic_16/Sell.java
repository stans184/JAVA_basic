package JAVA_basic_16;

public interface Sell {
    void sell();

    default void order(){
        System.out.println("Sell order");
    }
}
