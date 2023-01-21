package JAVA_basic_2;

public class MakeReportTest {
    public static void main(String[] args){
        MakeReport builder = new MakeReport();
        String report = builder.getReport();

        System.out.println(report);
    }
}
