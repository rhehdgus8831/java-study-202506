package chap1_2;

public class DataType {

    public static void main(String[] args) {

        // 정적 타이핑 언어
        int age = 20; // Int : 정수만 가능
        double pi = 3.14; // double : 실수만 가능
        char a = 'A'; // char : 한글자 (홀따옴표)
        String greeting = "안뇽하세요"; // String : 문자열 (쌍따옴표)
        boolean flag = true; // boolean : 논리값

        // 정수 타입 (byte: 1, short: 2, int: 4, long: 8)
        // 1byte === 8bit -> 10진수 정수 8 => 0 0001000
        // -128 ~ 127
        // 2byte === 16bit -> 10진수 정수 1000 =>  1111100100
        // -32768 ~ 32767
        byte x1 = 127;
        short x2 = 32767;
        int x3 = 2147483647;
        long x4 = 9223372036854775807L; // 롱타입에서는 리터럴에 L 붙여줘야함

        // ==== 실수 타입 ==== // 
        float f1 = 3.123131234F; // 4byte  - 7자리
        double f2 = 3.142131232112; // 8byte  - 15자리
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // ==== 논리 타입 ==== //
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;

        // ==== 문자 타입 ==== //
        char c1 = 'A';  // 2byte - 0 ~ 65535
        char c2 = 44032; // 한글 '가'
        System.out.println("c2 = " + c2);

        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);

        System.out.println("str = " + str);

        String str2 = "안녕하세요"; // "" 사용하면 자동 문자열 반환됨.

        // 자바 17 지원
        String str3 = """
                안녕
                메롱
                잘가
                ㅋㅋㅋ
                """;

        // 동적 타이핑 지원 (java 9)
        // var는 쓰지마셈 (자바와 스크립트를 구별해야되기에)
        var z = 100;
        var v = "gggg";

    }

}
