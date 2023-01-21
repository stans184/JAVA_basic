package JAVA_basic_18;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("JAVA");
        String android = new String("ANDROID");
    
        StringBuilder sbuffer = new StringBuilder(java);

        System.out.println(System.identityHashCode(sbuffer));
        // StringBuilder 를 통해 연결한 값은 hashcode 값이 동일
        sbuffer.append(android);
        System.out.println(System.identityHashCode(sbuffer));
        
        String test = sbuffer.toString();

        System.out.println(test);
        
    }
    
}
