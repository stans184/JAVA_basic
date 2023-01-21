package JAVA_basic;

public class student {
    public int studentId;
    public String studentName;
    public String address;
    public int grade;

    public student(){
        
    }

    public student(int studentId, String studentName, int grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){
        return studentId+" 학번의 이름은 "+studentName+", "+grade+"학년입니다.";
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
