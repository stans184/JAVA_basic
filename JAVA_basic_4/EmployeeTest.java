package JAVA_basic_4;

public class EmployeeTest {
    public static void main(String[] args){
        // main 안에 생성된 지역변수
        // stack memory에 생성
        Employee employeeLee = new Employee();  
        employeeLee.setEmployeeName("James");

        // static 변수는 class 이름으로 참조해서 쓸 수 있다
        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Jack");
        // employeeKim.serialNum++;

        // static 변수인 serialNum의 경우, employeeKim instance에서 변경을 주었지만, employeeLee instance 에서도 영향을 받는다
        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId());
    }
}