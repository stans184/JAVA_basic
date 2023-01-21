package JAVA_basic;

import java.util.*;
// jump to java, serise, 실행안됨
public class test12 {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8};

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        // for (int i=0;i<data.length;i++){
        //     if(data[i]%2 == 0){
        //         dataList.add(data[i]);
        //     }
        // }

        for (int num : data){
            if(num%2 == 0){
                dataList.add(num);
            }
        }

        System.out.println(dataList);

        // Set을 이용하여 중복 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        System.out.println(dataSet);

        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬 
        distinctList.sort(Comparator.reverseOrder());

        System.out.println(distinctList);

        // int 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for(int i=0;i<distinctList.size();i++){
            result[i] = distinctList.get(i);
        }

        
    }
}
