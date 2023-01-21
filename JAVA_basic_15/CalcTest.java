package JAVA_basic_15;

public class CalcTest {
    public static void main(String[] args) {

        // int num1 = 10;
        // int num2 = 3;
        
        Calc calC = new CompleteCalc();
        // System.out.println(calC.add(num1, num2));
        // System.out.println(calC.sub(num1, num2));
        // System.out.println(calC.mul(num1, num2));
        // System.out.println(calC.div(num1, num2));
        // // interface 에 정의된 method 이지만, implements class 에서도 불러와서 사용 가능
        calC.description();
        System.out.println();

        int[] arr = {1,2,3,4,5};
        // interface 안에 구현된 static method 는 implements class 를 instance 로 만들지 않아도 불러와서 실행할 수 있음
        System.out.println(Calc.total(arr));

    }
}
