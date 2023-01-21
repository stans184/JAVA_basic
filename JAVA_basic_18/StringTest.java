package JAVA_basic_18;

import JAVA_basic.student;

public class StringTest {
    public static void main(String[] args) {
        // instance 를 통해 생성하면, heap memory 공간에 따로 할당된다
        String str1 = new String("abc");
        // 변수 선언으로 하면, 해당 memory 주소에 assign 된다
        String str2 = "abc";

        String java = new String("JAVA");
        String android = new String("ANDROID");
        System.out.println(System.identityHashCode(java));
        System.out.println(System.identityHashCode(android));
        // concat 을 통해 string 을 이으면, 새로운 메모리 공간에 변수를 다시 저장한다, 메모리 낭비가 발생
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));
        
        System.out.println(java);
    }
}
