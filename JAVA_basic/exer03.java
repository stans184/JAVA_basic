package JAVA_basic;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val){
        if (val%2 == 0){
            return false;
        }else{
            return true;
        }
    }

    float avg(int[] val){
        int sum = 0;
        for(int data:val){
            sum += data;
        }
        return (float) sum/val.length;
    }
}

class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator{
    int getValue(){
        if (this.value > 100){
            return 100;
        }else{
            return this.value;
        }
    }
}

public class exer03{
    public static void main(String[] args){
        //Ex
        // Calculator cal = new Calculator();
        // cal.add(10);
        // System.out.println(cal.getValue());  // 10 출력

        //Q1
        // UpgradeCalculator cal = new UpgradeCalculator();
        // cal.add(10);
        // cal.minus(3);
        // System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력

        //Q2
        // MaxLimitCalculator cal = new MaxLimitCalculator();
        // cal.add(50);  // 50 더하기
        // cal.add(60);  // 60 더하기
        // System.out.println(cal.getValue());  // 100 출력

        //Q3
        // Calculator cal = new Calculator();
        // System.out.println(cal.isOdd(4));

        //Q4
        // int[] data = {1, 3, 5, 7, 9};
        // Calculator cal = new Calculator();
        // float result = cal.avg(data);
        // System.out.println(result);

        //Q5 틀림,,, why?
        // ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        // ArrayList<Integer> b = a;
        // a.add(4);
        // System.out.println(b.size());
    }
}