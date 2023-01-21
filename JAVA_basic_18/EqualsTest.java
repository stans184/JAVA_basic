package JAVA_basic_18;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        Student std3 = std1;

        // 다른 instance 이기 때문에 false
        System.out.println(std1 == std2);
        // 다른 instance, 주소값이 다르기 떄문에 false
        // equals 를 재정의 했고, 그 안에서 값을 다시 비교하면 true
        System.out.println(std1.equals(std2));
        // 그대로 복제한 것, 같은 주소값을 가지고 있어서 true
        System.out.println(std1 == std3);
        // 두 instance 의 주소값이 다르기 때문에 그냥 hashcode를 비교하면 다른 값이 나옴
        // hashCode method 의 재정의 이후에는 같은 값 출력 가능
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        // hashCode method 의 재정의 이후에도 실제 hashCode 값을 출력할 수 있음
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        std1.setStudentName("Jack");
        // clone 의 경우, clone 직전의 instance 상태를 그대로 복제
        // clone 이후에 instance 가 변경되는 경우는 반영되지 않음
        Student copyStudent = (Student)std1.clone();
        System.out.println(copyStudent.toString());

        // String, integer의 예시
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100;
        System.out.println(i.hashCode());
    }
}
