package JAVA_basic_5;

public class CharArrayTest {
    public static void main(String[] args){
        char[] alpa = new char[26];
        char ch = 'A';

        for(int i=0;i<alpa.length;i++){
            alpa[i] = ch++;
        }

        for(char tet : alpa){
            System.out.print(tet);
        }
    }
}
