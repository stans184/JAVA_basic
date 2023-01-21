package JAVA_basic_4;

// singleton pattern
public class Company {
    // Company 로 만드는 유일한 instance
    private static Company instance = new Company();
    private Company(){

    }
    
    // 외부에서 class 이름만으로 접근할 수 있도록 static
    // 외부에서 접근할 수 있도록
    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
}
