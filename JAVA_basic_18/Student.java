package JAVA_basic_18;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int num, String name){
        this.studentNum = num;
        this.studentName = name;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public String toString(){
        return studentNum+", "+studentName;
    }

    // object class 의 equals 재정의
    @Override
    public boolean equals(Object obj){
        
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (this.studentName == std.studentName) {
                return true;
            }else return false;
        }
        return false;
    }

    // hashcode 의 재정의
    @Override
    public int hashCode(){
        return studentNum;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
