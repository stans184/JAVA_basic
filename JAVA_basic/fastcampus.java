package JAVA_basic;

public class fastcampus {
    public static void main(String[] args){
        student studentLee = new student(1234,"john",4);

        System.out.println(studentLee.showStudentInfo());

        student studentKim = new student(); // default 생성자

        System.out.println(studentKim.showStudentInfo());

        object_person person1 = new object_person();

        System.out.println(person1.showPersonInfo());
    }
}
