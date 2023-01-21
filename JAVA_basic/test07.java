package JAVA_basic;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class test07 {
    public static void main(String[] args) throws IOException{
        System.out.println("this is test file");

        // InputStream in = System.in;                             // byte input
        // InputStreamReader reader = new InputStreamReader(in);   // char input
        // BufferedReader br = new BufferedReader(reader);         // string input

        // String a = br.readLine();

        // System.out.println(a);

        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.nextLine());      // next - 단어 nextLine - 라인 nextInt - 정수
        
        // FileOutputStream output = new FileOutputStream("/Users/hyun/WP/JAVA_basic/test.txt");
        
        // for(int i=1;i<10;i++){
        //     String data = i+"번째 줄입니다.\n";
        //     output.write(data.getBytes());
        // }
        
        // output.close();

        FileWriter fw = new FileWriter("/Users/hyun/WP/JAVA_basic/test02.txt");

        for (int i=1;i<6;i++){
            String data = i+"번째 줄입니다.\n";
            fw.write(data);
        }

        fw.close();

        PrintWriter pw = new PrintWriter("/Users/hyun/WP/JAVA_basic/test03.txt");

        for (int i=1;i<6;i++){
            String data = i+"번째 줄입니다.";
            pw.println(data);
        }

        pw.close();

        // FileOutputStream VS FileWriter VS PrintWriter 의 차이에 대해 생각

        // 추가 모드
        FileWriter fw2 = new FileWriter("/Users/hyun/WP/JAVA_basic/test02.txt", true);

        for (int j=11;j<20;j++){
            String data2 = j+"번째 줄입니다.";
            fw2.write(data2);
        }

        fw2.close();

        // PrintWriter 로 추가하고 싶으면 FileWriter로 그걸 열어줘야 함
        PrintWriter pw2 = new PrintWriter(new FileWriter("/Users/hyun/WP/JAVA_basic/test03.txt", true));

        for (int j=9;j>0;j--){
            String data3 = j+"번째 줄입니다.";
            pw2.println(data3);
        }

        pw2.close();

        BufferedReader br = new BufferedReader(new FileReader("/Users/hyun/WP/JAVA_basic/test03.txt"));

        while (true){
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
    }
}
