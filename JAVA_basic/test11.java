package JAVA_basic;
// lamda, 실행 안됨
interface Calculator{
    int sum(int a, int b);
}

class MyCal implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class test11 {
    public static void main(String[] args){
        MyCal mc = new MyCal();
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
