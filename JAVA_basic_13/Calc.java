package JAVA_basic_13;

public interface Calc {

    // interface 에 선언된 변수 - 상수 / method - abstract method

    double PhI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);
}
