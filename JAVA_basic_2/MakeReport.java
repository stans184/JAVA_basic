package JAVA_basic_2;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    private String line = "========================\n";
    private String title = "name \t address \t number \t";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul, KOREA \t");
        buffer.append("010-1234-5678\n");

        buffer.append("Thomas \t");
        buffer.append("Busan, KOREA \t");
        buffer.append("010-4587-3948\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }
    //  외부에서 쓸 수 있는 유일한 method
    // 다른거는 굳이 client 가 알 필요가 없으니까
    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();

        return buffer.toString();
    }
}
