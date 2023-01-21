package JAVA_basic_5;

public class Subject {
    private String subjectName;
    private int subjectScore;

    public Subject(String name, int score){
        this.subjectName = name;
        this.subjectScore = score;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public int getSubjectScore(){
        return subjectScore;
    }
}
