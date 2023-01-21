package JAVA_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class test02 {
    public static void main(String[] args){
        String[] numbers = {"one", "two", "three", "four"};

        for (int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // for each 구문, string 이나 array 에서 for 문을 보다 직관적으로 사용할 수 있음
        // for each 문은 반복 간격이나 회수를 정할 순 없고, 정해진 구역을 쭉 훑어야함
        for (String num: numbers){
            System.out.println(num);
        }

        ArrayList<String> test_string = new ArrayList<>(Arrays.asList("test01", "test02", "test03", "test04"));
        for (String nums : test_string){
            System.out.println(nums);
        }
    }
}
