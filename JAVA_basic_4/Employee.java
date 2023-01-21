package JAVA_basic_4;

public class Employee {

    // 여러 instance 가 공유하는 변수가 필요할 때, 사용하는 static
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 사원 instace 가 생성이 될 때마다 숫자가 증가해서 사번을 부여하고 싶다
    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum(){
        int i = 0;
        
        // static class 는 data 영역, 즉 프로그램이 실행되면서 바로 생성된다
        // employeeName 은 지역변수, heap memory, instance 가 만들어지면서 생성된다
        // 따라서 employeeName을 여기서 불러올 수 없다
        // employeeName = "Lee";

        return serialNum;
    }

    public int getEmployeeId(){
        // 반대로 static class, static variable 의 경우 프로그램이 실행되며 바로 생성된다
        // 따라서 기타 class 에서는 static을 자유롭게 참조할 수 있다
        // serialNum = 1000;

        return employeeId;
    }

    public void setEmployeeId(int Id){
        this.employeeId = Id;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String name){
        this.employeeName = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String part){
        this.department = part;
    }

}
