package JAVA_basic;

import java.util.Scanner;

class FoolException extends Exception{
}
// 예외를 어디서 처리할건지 중요함
// 예외를 던진다는게 어떤 건지 다시 공부할 필요
public class test09 {

    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args){
        
        // Scanner sc_num = new Scanner(System.in);

        // System.out.print("type upper number : ");

        // int a = sc_num.nextInt();

        // System.out.print("type lower nunmber : ");

        // int b = sc_num.nextInt();

        // float result;

        // try{
        //     result = (float) a/b;
        // } catch(ArithmeticException e){
        //     result = -1;
        // }

        // System.out.println("result is "+result);

        test09 sample = new test09();
        try{
            sample.sayNick("fool");
            sample.sayNick("genious");
        }catch(FoolException e){
            System.err.println("FoolException occured");
        }
    }
}
