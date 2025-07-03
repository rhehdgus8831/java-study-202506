package chap1_9.static_;

import static chap1_9.static_.util.InputUtils.prompt;

public class Main {
    public static void main(String[] args) {

        Count.m1();

        chap1_9.static_.Count.x = 100;

        // 원주율 : 샤프계산기의 원주율,삼성계산기의 원주율
        System.out.println(Math.PI);

        chap1_9.static_.Count c1 = new chap1_9.static_.Count();
        c1.m2();


       //  c1.x++;
        chap1_9.static_.Count.x++;
        c1.y++;

        chap1_9.static_.Count c2 = new chap1_9.static_.Count();
        c2.m2();

        // c2.x++;
        chap1_9.static_.Count.x++;
        c2.y++;

        c2.y = 100;
        c2.x = 999;

        System.out.printf("c1.x = %d, c1.y = %d\n", c1.x, c1.y);
        System.out.printf("c2.x = %d, c2.y = %d\n", c2.x, c2.y);

        System.out.println(" ======================= " );

        double result = Calculator.calcCircleArea(10);

        chap1_9.static_.Calculator sharpCalc = new chap1_9.static_.Calculator();
        sharpCalc.customizeColor("노랑색");

        Math.random();

        String age = prompt("너 나이 써봐! :");
        prompt("너 나이 써봐! :");

    }
}
