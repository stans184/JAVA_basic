package JAVA_basic_18;

public class StringTextBlock {
    public static void main(String[] args) {
        // textblock 은 JAVA 13 이후의 기능, 아직 field 에서는 java 13 이후 버전을 많이 사용하지 않음
        String strBlock = """
                hello,
                hi,
                how r u
    
                """;

        System.out.println(strBlock);
    }
}
