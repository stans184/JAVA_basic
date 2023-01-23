public class ThreeDPrinterTest {
    
    public static void main(String[] args) {
        
        Powder powder = new Powder();

        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial();
        // 강의에서는 pinter.getMaterial 을 (Powder)로 형 변환을 해줘야 하는데?
        // Object type으로 하면 형변환이 필요하다
        // 근데 왜 실행이 되지?
        // 이클립스에서 해보니 형변환이 필요한게 맞네
        // 특이하구
    }
}
