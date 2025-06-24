package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {


        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        String[] names = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("삭제할 이름을 입력하세요.");

        while (true) {


            System.out.print(">> ");
            String input = scanner.nextLine();

            int indexToDelete = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(input)) {
                    indexToDelete = i;
                    break;
                }
            }
            if (indexToDelete == -1) {
                System.out.println(input + "는(은) 없는 이름입니다.");

            }

            String[] temp = new String[names.length - 1];
            int idx = 0;
            for (int i = 0; i < names.length; i++) {
                if (i == indexToDelete) temp[idx++] = names[i];

            }

            // 새로운 배열로 연결
            names = temp;
            System.out.println("-삭제 후 배열" + Arrays.toString(names));

        }

    }

}
