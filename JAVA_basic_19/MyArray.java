public class MyArray {
    int[] intArr;                          // int 로 구성된 array
    int count;                             // array 에 들어가는 요소의 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;

    public MyArray(){                      // 아무런 input 이 없으면 array 의 size 는 10개
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){              // size 를 input 으로 넣어서 생성할 수도 있음
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num){       // element 를 추가
        if (count >= ARRAY_SIZE) {         // array 의 size 가 선언값보다 커지면 element 추가 안함
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;             // size 가 선언값보다 작으면 element 추가
    }
    // 배열에 새로운 값을 넣는 경우, 위치가 그 값을 입력받음
    // 1. 만약 지정한 위치값이 0보다 작거나, 배열의 총 개수를 넘어가면 불가
    // 2. 배열의 총 개수가 선언된 배열의 사이즈보다 커져도 불가
    // 3. 둘다 만족한다면, 맨 뒤의 para 부터 한칸 뒤로 움직여서 저장, 새로 넣고자 하는 position 까지
    // 4. 그리고 해당 position 에 넣고, count 값 증가시키고 종료
    public void inserElement(int position, int num){
        if (position < 0 || position > count) {
            System.out.println("position is out of size");
            return;
        }

        if (count >= ARRAY_SIZE) {
            return;
        }

        for (int i = count -1; i < position; i--) {  // 맨 마지막 index = count - 1
            intArr[i+1] = intArr[i];
        }

        intArr[position] = num;
        count += 1;
    }
    // 배열에서 특정 positoin 의 원소 지우기
    // 전역변수로 선언한 error num 가져옴
    // 1. 비어있는 배열인지 체크
    // 2. remove 를 원하는 position 이 가지고 있는 원소 밖인지 체크
    // 3. 해당 position 부터 맨 뒤까지 한칸씩 앞으로 당겨서 저장
    public int removeElement(int position){
        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("Array is empty");
            return ret;
        }

        if (positoin < 0 || position > count -1) {
            System.out.println("index, out of range");
            return ret;
        }

        ret = intArr[position];

        for (int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i+1];
        }
        count -= 1;
        
    }

    // 배열에 들어있는 원소의 갯수를 반환
    public int getSize(){
        return count;
    }

    // 선언된 배열이 비어있는지 확인
    public boolean isEmpty(){
        if(count == 0){
            return true;
        }else return false;
    }
}
