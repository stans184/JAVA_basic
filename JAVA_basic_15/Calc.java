package JAVA_basic_15;

public interface Calc {

    // interface 에 선언된 변수 - 상수 / method - abstract method

    double PhI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    default void description(){
        System.out.println("a quadratic operation of integers");
        myMethod();
    }

    static int total(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        myStaticMethod();
        return sum;
    }

    private void myMethod(){
        System.out.println("myMethod");
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }
}
