package chap1_5.member;

import java.time.LocalDateTime;
import java.util.UUID;

// 역할 : 회원 한 명의 회원 정보를 잘 가지고 있어야 함.
public class Member {

    String email; // 본질 식별자
    String password;
    String memberName;
    String id; // 인조 식별자 (랜덤값: 시스템이 자동 생성)
    Gender gender; // MALE, FEMALE
    int age;
    LocalDateTime registerDate; // 회원가입 일시


    // 생성자 : 객체가 처음 생성될 때 필드를 초기화

    public Member(int age, Gender gender, String memberName, String email, String password) {
        this.age = age;
        this.gender = gender;
        this.memberName = memberName;
        this.email = email;
        this.password = password;
        this.id = UUID.randomUUID().toString(); // 랜덤값 생성
        this.registerDate = LocalDateTime.now(); // 현재 시간 읽어서 넣음
    }

    // 디버깅용 Alt + Insert toString()
    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }

}
