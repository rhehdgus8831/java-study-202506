package chap1_10.inter;

// 추상적
public interface Pet {

    // 인터페이스는 필드를 가질 수 없습니다.
    // 따라서 필드를 하위 클래스에게 상속 시키고 싶으면 추상 클래스를 써야함.

    String abc = "asdas"; // 상수처리 (상수는 만들 수 있음)

    // 애완동물의 필수 기능
    // 노는 기능
    void handle();
    // 예방접종 기능
    boolean inject();

    // 뒤늦게 이미 구현이 많은 상태에서 새 메서드를 추가할 때는 강요하지 말자
    default void eat() {} // default 걸어두고 수동으로 오버라이딩 추가 후 마지막에 default 삭제


    static void aaa() {}
}
