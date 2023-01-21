package JAVA_basic_5;

public  class TwoDArray {
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6,7}};
        int i,j;
        // 2차원 배열의 경우, 첫번째 나오는게 행 두번째가 열 이라고 생각하면 좋음
        // 행 안에서 열을 돌리고
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(", \t"+arr[i].length);
            System.out.println();
        }
    }
}
