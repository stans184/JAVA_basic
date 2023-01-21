package JAVA_basic_5;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private int totalScore;

    ArrayList<Subject> learrnedSubject = new ArrayList<>();

    public Student(int Id, String Name){
        this.studentId = Id;
        this.studentName = Name;
    }

    public void addSubject(String name, int score){
        learrnedSubject.add(new Subject(name, score));
    }

    public void showStudentInfo(){
        for(Subject subject:learrnedSubject){
            System.out.println(studentName+"의 "+subject.getSubjectName()+" 과목 성적은 "+subject.getSubjectScore());
            totalScore += subject.getSubjectScore();
        }
        System.out.println(studentName+"의 총점은 "+totalScore);
        System.out.println(studentName+"의 평균은 "+totalScore/learrnedSubject.size());
    }
}
