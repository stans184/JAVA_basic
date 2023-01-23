public class ThreeDPrinter3 {
    
    // 재료가 뭐든지 받아들일 수 있는 Object 로 선언, 그런데 문제점이 있다?
    // get으로 불러들일 떄, 형변환을 해줘야한다?

    private Object material;

    public Object getMaterial(){
        return material;
    }

    public void setMaterial(Object material){
        this.material = material;
    }

}
