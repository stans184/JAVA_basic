package JAVA_basic_5;

public class ArrayTest {
    public static void main(String[] args){
        int[] arr = new int[10];
        int total = 0;

        for (int i = 0, num = 1;i<arr.length;i++, num++){
            arr[i] = num;
        }

        // for(int i = 0; i<arr.length;i++){
        //     total += arr[i];
        // }
        
        // 배열의 첨부터 쭉 더하는 경우
        for(int var : arr){
            total += var;
        }

        System.out.println(total);

        double[] arr2 = new double[5];
        double complex = 1;
        int count = 0;

        arr2[0] = 1.1; count++;
        arr2[1] = 2.1; count++;
        arr2[2] = 3.1; count++;

        for (int i=0;i<arr2.length;i++){
            complex *= arr2[i];
        }

        System.out.println(complex);

        for(int i = 0;i<count;i++){
            complex += arr2[i];
        }

        System.out.println(complex);

    }
}
