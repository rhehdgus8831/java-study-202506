package chap1_2.method;

public class MethodBasic {

    // 자바는 함수라는 개념이 없음
    // 메서드 : 객체가 가진 기능
    // 메서드는 정의할 수 있는 위치는 클래스 내부, 매서드 외부
    public static void main(String[] args) {

        int result1 = add(20, 30);
        System.out.println("result1 = " + result1);

        int result2 = addAll(new int[]{1, 2, 3, 4,5,6,7});
        System.out.println("result2 = " + result2);

        int result3 = addAll(10, 30, 50, 70);
        System.out.println("result3 = " + result3);


    }


    // 2개의 정수를 받아서 더해서 반환
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    int add2(byte n1, byte n2){
        return n1 + n2;
    }
    int[][] foo (){ // 배열 리턴도 [][] 표기 해야함
        return new int[3][4];
    }
    void bar(){ // 리턴이 없으면 void
        System.out.println("hello");
    }

    // n개의 정수를 전달받아 싹 다 리턴
    static int addAll(int... numbers){ // 배열로 받아서 처리해야함
        int total = 0;                  // ... 붙이면 알아서 배열로 묶어 처리해줌(배열로 받을 경우 무조건 ...)
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 배열 2개를 전달 받을 때 (2개 이상일 경우 무조건 [] 붙여서 )
    static void ticky(int[] nums1, int[] nums2) {
        ticky(new int[]{1,2,3}, new int[]{4,5,6});
    }

    // 여러개를 리턴하고 싶을 때
    int[] multiReturn(int n1, int n2){
        return new int[]{n1 +n2, n1 -n2};
    }


}
