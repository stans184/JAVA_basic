package JAVA_basic;

public class exer02 {
    public static void main(String[] args){
        //Q1
        
        //Q2 나눗셈 몫을 구하는 건 '/' 나머지를 구하는 건 '%'
        int num = 1;
        int sum = 0;
        while (num<=1000){
            if ((num % 3) == 0){
                sum += num;
            }
            num++;
        }
        System.out.println(sum); // 166833

        //Q3 - java는 string 곱하기가 없다 // println 은 줄바꿈 포함 print 줄바꿈 없이 출력
        for (int i = 1;i<6;i++){
            for (int j = 1;j<i+1;j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }

        //Q4
        // for (int i=1;i<101;i++){
        //     System.out.print(i);
        // }

        //Q5
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum2 = 0;
        for(int mark:marks){
            sum2 += mark;
        }
        float ave = (float) sum2/(marks.length);
        System.out.println(ave);
    }
}
