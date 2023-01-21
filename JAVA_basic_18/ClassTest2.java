package JAVA_basic_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        
        Class c1 = Class.forName("JAVA_basic_18.Person");

        Person p1 = (Person)c1.newInstance();

        p1.setName("Cherry");
        System.out.println(p1);

        // 이미 instance 가 있는 상태이면 getClass 사용 가능
        Class c2 = p1.getClass();
        Person p2 = (Person)c2.newInstance();
        System.out.println(p2);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"kim"};
        Person kimPerson = (Person)cons.newInstance(initargs);
        System.out.println(kimPerson);

        Person kim2 = new Person("Kim", 24);
    }
}
