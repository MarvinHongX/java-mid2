package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
//        GenericBox genericBox = new GenericBox(); // 하위 호환성때문에 지원
        GenericBox<Object> genericBox = new GenericBox<>(); // 권장
    }
}
