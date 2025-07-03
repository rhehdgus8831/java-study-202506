package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수1: ");
                String str1 = sc.nextLine(); // 정수를 문자열로 입력
                int n1 = Integer.parseInt(str1); // 문자열을 정수로 변환

                System.out.print("정수2: ");
                String str2 = sc.nextLine(); // 정수를 문자열로 입력
                int n2 = Integer.parseInt(str2); // 문자열을 정수로 변환

                String str = null;
                str.toUpperCase(); // 일부로 오류 발생 시키기

                System.out.println("n1 / n2 = " + (n1 / n2));
                break;
                // catch는 여러개 입력 가능
            } catch (NumberFormatException e) { // NumberFormatException 문자 오류 시
                // System.out.println(e.getMessage()); // 디버깅용 - 간단한 오류메세지 확인
                // e.printStackTrace(); // 예외처리 안했을 때 뜨던 빨간메세지를 보여줌
                System.out.println("정수로만 입력하세요!");

            } catch (ArithmeticException e) { // ArithmeticException 계산 오류 시
                System.out.println("0으로 나눌 수 없습니다.");

            } catch (Exception e){// Exception은 에러를 다 받아줌
                // 그래서 마지막에 내가 모르는 오류가 발생할 때 막을 수 있음
                System.out.println("알 수 없는 에러 발생! 조치 후 점검하겠습니다.");
            }
        }
        System.out.println("프로그램 정상 종료!");
    }
}
