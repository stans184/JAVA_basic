
// generic type 을 쓸 경우, class 이름에다가 하기와 같이 표기
// <> 변수명은 달라질 수 있다
public class GenericPrinter<T> {
    
    private T material;

    public T getMaterial(){
        return material;
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}
