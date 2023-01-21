package JAVA_basic_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // java.lang.String class 를 instance 
        Class c = Class.forName("java.lang.String");
        // java.lang.String 안에 있는 모든 constructor, 생성자를 생성자 배열로 받고
        Constructor[] cons = c.getConstructors();
        // 모두 출력
        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }

        System.out.println();
        // 마찬가지로, java.lang.String 안의 모든 method를 method 배열에다가 입력
        Method[] meths = c.getMethods();

        for (Method method : meths) {
            System.out.println(method);
        }

        // 우리가 이렇게 String class 를 모두 뽑을 경우는 거의 없고,
        // import 해야하는 class 가 나한테 있지 않고 다른 곳에서 만든 것이거나, 다른 소유일때
    }
}
