package chap1_5.member;

/**
 * 프로그램 실행의 진입점 역할을 하는 클래스입니다.
 *
 * 이 클래스는 회원 관리 프로그램의 실행을 담당하며,
 * {@code main} 메서드를 통해 프로그램이 시작됩니다.
 * 내부적으로 {@code MemberController} 객체를 생성하고,
 * 해당 객체의 {@code start} 메서드를 호출하여 프로그램의 흐름을 제어합니다.
 */

// 프로그램의 실행을 담당
public class Run {

    public static void main(String[] args) {

        MemberController mc = new MemberController();
        mc.start();
    }
}