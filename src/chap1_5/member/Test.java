package chap1_5.member;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

      //  Member m1 = new Member(30,Gender.MALE,"말포이","abc1234@gmail.com","1234");
     //   System.out.println("m1 = " + m1);


        // 클래스 안에 있는 데이터는 반드시 객체 생성을 통해 접근함
        MemberRepository mr = new MemberRepository();

        // 멤버 추가 테스트
        mr.addMember(new Member(11,Gender.FEMALE,"메롱","aqwmkqwe617@naver.com","778977"));


        System.out.println(Arrays.toString(mr.getMembers()));
        System.out.println("mr = " + mr.size());

        System.out.println(" =================================" );
        Member foundMember1 = mr.findMemberByEmail("abc4567@naver.com");
        System.out.println(foundMember1);

        System.out.println(" =================================" );
        Member foundMember2 = mr.findMemberByEmail("aqwmkqwe617@naver.com");
        System.out.println(foundMember2);

        System.out.println(" =================================" );
        boolean flag1 = mr.isDuplicateEmail("aqwmkqwe617@naver.com");
        System.out.println("flag1 = " + flag1);
    }

}
