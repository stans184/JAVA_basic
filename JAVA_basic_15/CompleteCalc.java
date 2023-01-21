package JAVA_basic_15;

public class CompleteCalc extends Calculator{

    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        }
        return num1/num2;
    }

    @Override
    public void description(){
        System.out.println("CompleteCalc Overriding");
    }
    
}
