package JAVA_basic;

public class object_person {
    public int height = 180;
    public int weight = 78;
    public String name = "Tomas";
    public int age = 37;
    public String gender = "man";

    public String showPersonInfo(){
        return "키가 "+height+"이고 몸무게가 "+weight+"인 "+gender+"이 있습니다. 이름은 "+name+"이고, 나이는 "+age+"입니다.";
    }
}
