package JAVA_basic_4;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args){

        // static 으로 불러올 거기 때문에, new 로 instance를 만드는게 아니라 (외부에서 생성 불가), Company의 static method를 직접 불러옴
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        // 위 출력값은
        // JAVA_basic_4.Company@63961c42
        // JAVA_basic_4.Company@63961c42
        // 으로 동일, 하나의 instance 만을 생성할 수 있다

        // 시간의 경우도 유일한 객체를 제공해야 한다
        Calendar calendar = Calendar.getInstance();
    }
}
