package JAVA_basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exer05 {

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = sum(a,b);
        // System.out.println(a+" plus "+b+" is "+sum);
        // sc.close();

        // Scanner sc = new Scanner(System.in);

        // while (true){
        //     String records = sc.nextLine().toUpperCase();
        //     // 뒤에 문자열을 확인하는 변수, 근데 3글자보다 적게 만들면 오류가 나네?
        //     String backCheck = records.substring(records.length()-3, records.length());
        //     System.out.println("Upper "+records);
        //     // backCheck 변수가 END랑 같으면 끝나야 하는데 안끝남...
        //     // JAVA 의 String 변수는 equals 로 비교해야 한다
        //     if (backCheck.equals("END")){
        //         System.out.println("Program will be end");
        //         break;
        //     }
        // }
        
        // 파일을 수정하고 안닫아줘서 그 내용이 출력 안되었던 케이스
        Scanner sc2 = new Scanner(System.in);
        FileWriter fw = new FileWriter("/Users/hyun/WP/JAVA_basic/sample.txt");
        fw.write(sc2.nextLine());
        fw.write("Write once, run anywhere");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("/Users/hyun/WP/JAVA_basic/sample.txt"));
        String line = br.readLine();
        System.out.println(line);  // null 이 출력된다.
    
    }
    
}
