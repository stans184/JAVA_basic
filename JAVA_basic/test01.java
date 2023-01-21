package JAVA_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class test01{
    enum CoffeeType{
        americano, cold_brew, latte
    }

    public static void main(String[] args) throws Exception{
        System.out.println("hellow world!");

        // for (int j=2;j<10;j++){
        //     for (int i=1;i<10;i++){ 
        //         System.out.println(j * i);
        //     }
        //     System.out.println('\n');
        // }

        // String hi = "hello java";
        // String compare = "hello";
        
        // System.out.println(7/3); // 몫
        // System.out.println(7%3); // 나머지
        // System.out.println(hi);
        // System.out.println(compare.equals(hi));
        // System.out.println(hi.indexOf("java"));
        // System.out.println(hi.contains("java"));
        // System.out.println(hi.replaceAll("java", "world"));
        // System.out.println(hi);
        // System.out.println(hi.substring(0, 5));

        // int day = 3;
        // int degree = 19;

        // System.out.println(String.format("today is %d, max degree is %d", day, degree));
        // System.out.printf("today is %d, max degree is %d", day, degree);
        // System.out.println();
        // System.out.println(String.format("%10d", degree));
        // System.out.printf("max degree is %d", degree);

        // StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.insert(0, "java ");
        // System.out.println(sb.toString());
        // System.out.println(sb.substring(0,5));

        // String[] weeks = new String[7];
        // weeks[0] = "mon";
        // weeks[1] = "tues";
        // weeks[2] = "wed";
        // weeks[3] = "thurs";
        // weeks[4] = "fri";
        // weeks[5] = "sat";
        // weeks[6] = "sun";

        // System.out.println(weeks.length);
        // for (int i = 0; i<weeks.length; i++){
        //     System.out.println(weeks[i]);
        // }

        // for (String days : weeks){
        //     System.out.print(days + " ");
        // }

        // ArrayList pitches = new ArrayList<>();
        // pitches.add("145");
        // pitches.add("139");
        // pitches.add("154");

        // System.out.println(pitches);

        // pitches.add(2, "151");
        
        // System.out.println(pitches);
        // System.out.println(pitches.get(1));
        // System.out.println(pitches.size());
        // System.out.println(pitches.contains("151"));

        // System.out.println(pitches.remove("151"));

        // System.out.println(pitches);

        // ArrayList<String> testlog = new ArrayList<>();

        // testlog.add("185");
        // System.out.println(testlog);
        // System.out.println(testlog.add("185"));
        // System.out.println(testlog);

        // String generix_1 = testlog.get(0); // generics type 으로 정의된 배열에서는 string 형식으로 입력을 받음 // ArrayList 선언 당시 String 으로 선언
        // String generix_2 = (String) pitches.get(2); // 일반 array 에서는 object 형식, 형변환을 해줘야함 // ArrayList 선언 당시 none type 으로 선언

        // System.out.println(generix_1 + generix_2);

        // String[] test_data = {"apple", "banana", "strawberry"};

        // System.out.println(test_data);

        // ArrayList<String> test_array01 = new ArrayList<>(Arrays.asList(test_data));
        // ArrayList<String> test_array02 = new ArrayList<>(Arrays.asList("138", "149", "154", "147"));

        // System.out.println(test_array01);
        // System.out.println(test_array02);
        // String result_test = String.join(",", test_array01);

        // System.out.println(result_test);

        // test_array02.sort(Comparator.reverseOrder());

        // System.out.println(test_array02);

        // MAP

        // HashMap<String, String> test_map = new HashMap<>();

        // test_map.put("color", "blue");
        // test_map.put("length", "168");
        // test_map.put("name", "moon");

        // System.out.println(test_map);
        // System.out.println(test_map.get("name"));
        // System.out.println(test_map.get("lang"));
        // System.out.println(test_map.getOrDefault("lang", "JAVA"));
        // System.out.println(test_map.getOrDefault("name", "JACK"));
        // System.out.println(test_map.containsKey("lang"));
        // System.out.println(test_map.remove("length"));
        // System.out.println(test_map.get("name"));
        // System.out.println(test_map.size());
        // System.out.println(test_map.keySet());

        // SET

        // HashSet<String> test_set = new HashSet<>(Arrays.asList("h", "e", "l", "l", "o"));

        // System.out.println(test_set); // set의 가장 중요한 특성, 순서 없음 & 중복 제거

        // HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        // // 바로 교집합을 만들어도 되고
        // System.out.println(s1.retainAll(s2));
        // System.out.println(s1);

        // // 교집합 set을 새로 만들어서 정의해도 되고
        // HashSet<Integer> intersections = new HashSet(s1);
        // intersections.retainAll(s2);

        // // 합집합
        // HashSet<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // HashSet<Integer> union = new HashSet<>(s3);
        // union.addAll(s2);
        // System.out.println(union);

        // // 차집합
        // HashSet<Integer> substract = new HashSet<>(s1);
        // substract.removeAll(s2);
        // System.out.println(substract);

        // s1.add(150);
        // s1.addAll(s2);
        // s1.remove(150);
        // System.out.println(s1); // 중복제거, 순서없는 결과물
        
        // enum 열거체,,, 어떤 항목들을 주르륵 열거한다?
        // System.out.println(CoffeeType.americano);

        // for (CoffeeType type: CoffeeType.values()){
        //     System.out.println(type);
        // }

        // String num = "123";
        // System.out.println(num);

        // int n = Integer.parseInt(num);
        // System.out.println(n);

        // String num2 = "" + n;
        // String num3 = String.valueOf(n);
        // String num4 = Integer.toString(n);
        // System.out.println(num2+num3+num4);

        // final int absolute = 185; // final 선언된 변수는 변환 불가, 상수로 생각
        // // absolute = 456; 할당불가

    }
}