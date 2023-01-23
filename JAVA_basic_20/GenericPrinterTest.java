

public class GenericPrinterTest {
    
    public static void main(String[] args) {

        Powder powder = new Powder();
        
        // T 위치에다가, 어떤 자료형을 쓸 건지, 어떤 타입을 불러올건지 선언해줘야 함
        // 해당 위치를 다이아몬드 연산자라고 부름
        // 컴파일을 하게 되면 변수를 해당 타입으로 다 바꿔버림
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(Material);
        // 그래서 powder 변수 p 에다가도 형변환 없이 넣을 수 있음
        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }
}
