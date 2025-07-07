package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        /*
            List    1. 순서가 있는 데이터 구조
                    2. 중복 데이터 저장을 허용

            종류 : 배열리스트 - 삭제와 삽입의 문제가 있음
                               (값이 안 바뀔 경우 유리함)

                  연결리스트 - 다음 데이터의 주소를 저장함
                              (탐색 속도가 느림, 중간 삽입,삭제는 빠름)
        */

        // 추가

        List<String> hobbies = new ArrayList<>();

        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("영화감상");
        hobbies.add("낮잠");
        hobbies.addAll(List.of("밥먹기","멍때리기"));

        System.out.println(hobbies);

        // 중간 삽입
        hobbies.add(1,"코딩");
        System.out.println(hobbies);

        // 데이터 갯수 확인
        int size = hobbies.size(); // length 대신 사용
        System.out.println("hobbies = " + hobbies);

        // 인덱스 찾기
        int index1 = hobbies.indexOf("영화감상");
        System.out.println("index1 = " + index1);

        int index2 = hobbies.indexOf("뮤지컬");
        System.out.println("index2 = " + index2);
        
        // 요소 포함 여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag);

        // 요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);
        System.out.println(hobbies);

        // 요소 수정
        hobbies.set(0,"디자인");
        System.out.println(hobbies);

        // 요소 참조
        String hobby = hobbies.get(1);
        System.out.println("hobby = " + hobby);

        // 리스트 순회 (반복문 처리)
        System.out.println("=========================");

        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i));
        }

        System.out.println("=========================");

        for (String h : hobbies) {
            System.out.println(h);
        }

        System.out.println("=========================");

        hobbies.forEach((hob) -> System.out.println(hob));
        //hobbies.forEach(System.out::println); 람다

        // 전체 삭제
        hobbies.clear();
        System.out.println(hobbies);
        System.out.println(hobbies.isEmpty());


        System.out.println("=========================");
        // 리스트에 초기 값 넣고 시작하기

        // <>안에는 Double Long 등 대문자로
        List<Integer> numbers = new ArrayList<>(List.of(1,3,5,7,9));
        // List.of만 사용 시 불변하기 때문에 new ArrayList로
        // 한 번 더 묶어줘야 초기값을 넣고 나서 추가가 가능함

        numbers.add(11);

        System.out.println("numbers = " + numbers);


    }
}
