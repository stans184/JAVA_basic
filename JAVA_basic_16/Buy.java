package JAVA_basic_16;

public interface Buy{
    void buy();

    default void order(){
        System.out.println("buy order");
    }
    
}