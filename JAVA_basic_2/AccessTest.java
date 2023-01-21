package JAVA_basic_2;

public class AccessTest {
    public static void main(String[] args){
        Birthday bd = new Birthday();

        bd.setYear(2022);
        bd.setMonth(13);
        bd.setDay(21);

        bd.showDate();

        Birthday bd2 = new Birthday();
        bd.setYear(2022);
        bd.setMonth(12);
        bd.setDay(8);

        bd2.showDate();

    }
    
}
