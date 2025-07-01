package chap1_7.gisa;

public class Child extends Parent {
    private String name;

    public Child() {
        this("홍길동");
        // this()가 있으면 super()가 발동 안됨 자연스럽게 아래 코드로 이동
        System.out.println("Child() call!"); // 4
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String) call!"); // 3
    }
}
