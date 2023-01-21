package JAVA_basic_2;

public class SubjectTest {
    public static void main(String[] args){
        Student studentLee = new Student(101, "Amy");
        studentLee.setKoreaSubject("korea", 85);
        studentLee.setMathSubject("math", 88);

        Student studentKim = new Student(102, "Amy");
        studentKim.setKoreaSubject("korea", 75);
        studentKim.setMathSubject("math", 93);

        studentKim.showScoreInfo();
        studentLee.showScoreInfo();
    }
}
