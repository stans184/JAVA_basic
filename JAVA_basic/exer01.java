package JAVA_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class exer01{
    public static void main(String[] args){

        // Q1
        HashMap<String, Integer> test_result = new HashMap<>();
        test_result.put("korean", 80);
        test_result.put("english", 75);
        test_result.put("mathmatics", 55);

        int total = 0;
        total += test_result.get("korean");
        total += test_result.get("english");
        total += test_result.get("mathmatics");

        System.out.printf("Total score is %d", total);
        System.out.println();

        int average = total / test_result.size();                       //  HashMap
        System.out.printf("The average is %d", average);
        System.out.println();

        //Q2
        int n = 13;
        
        //Q3 & Q4
        String regist_num = "881120-1068234";
        String birth_data = regist_num.substring(0, 6);
        System.out.println(birth_data);
        System.out.println(regist_num.charAt(7));

        //Q5
        String a = "a:b:c:d";
        a.replace(":", "#"); // 왜 이거로 하고 출력하면 안바뀌고, print 문에서 같이 해야 바뀌지?
        System.out.println(a.replace(":", "#"));

        //Q6
        ArrayList<Integer> orders = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        System.out.println(orders);
        orders.sort(Comparator.reverseOrder());
        System.out.println(orders);
        orders.sort(Comparator.naturalOrder());
        System.out.println(orders);
        
        //Q7
        ArrayList<String> context = new ArrayList<>(Arrays.asList("hello", "to", "java"));
        System.out.println(context);
        String context_change = String.join(" ", context);
        System.out.println(context_change);

        //Q8
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.remove("B"));
        System.out.println(grade);

        //Q9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> nums = new HashSet<>(numbers);
        System.out.println(nums);

        //Q10
        
    }
}