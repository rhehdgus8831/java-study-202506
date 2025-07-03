package chap1_5.member;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Member 클래스는 회원 정보를 관리하기 위한 객체를 표현합니다.
 *
 * 이 클래스는 한 명의 회원 데이터(이메일, 비밀번호, 이름, 식별번호, 성별, 나이, 가입일 등)를 다루기 위해 사용됩니다.
 * 또한, 회원 데이터 초기화, 출력 등의 기능을 제공합니다.
 *
 * 주요 책임:
 * - 회원 데이터의 필드 초기화 (생성 시)
 * - 회원 데이터의 문자열 표현
 * - 회원 데이터 상세 정보 출력
 */
// 역할: 회원 한 명의 회원 정보를 잘 가지고 있어야 함.
public class Member {
    String email; // 본질 식별자
    String password;
    String memberName;
    String id; // 인조 식별자 (랜덤값: 시스템이 자동생성)
    Gender gender; // MALE, FEMALE
    int age;
    LocalDateTime registerDate; // 회원가입 일시

    // 생성자 : 객체가 처음 생성될 때 필드를 초기화
    public Member(int age, String email, String password, String memberName, Gender gender) {
        this.age = age;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.id = UUID.randomUUID().toString();
        this.registerDate = LocalDateTime.now();
    }

    boolean isDeleted = false;

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

    /**
     * 회원의 상세정보를 출력하는 메서드입니다.
     *
     * 이 메서드는 회원의 이름, 이메일, 성별, 나이, 그리고 회원가입 날짜를
     * 지정된 형식에 따라 콘솔에 출력합니다. 출력 형식은 다음과 같습니다:
     * "이름: [이름], 이메일: [이메일], 성별: [성별], 나이: [나이]세, 가입일: [가입일]"
     *
     * 기능:
     * 1. 가입일을 "yyyy-MM-dd HH:mm" 형식으로 변환합니다.
     * 2. 회원의 정보를 지정된 출력 형식에 맞춰 출력합니다.
     */
    public void inform() {
        String formattedDate = registerDate.format(
                java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        );
        System.out.printf("이름: %s, 이메일: %s, 성별: %s, 나이: %d세, 가입일: %s\n",
                memberName, email, gender == Gender.MALE ? "남자" : "여자", age, formattedDate);
    }

    public void updateNewPassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean isPasswordMatch(String inputPassword) {
         return this.password.equals(inputPassword);
    }
}