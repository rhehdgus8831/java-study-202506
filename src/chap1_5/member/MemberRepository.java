package chap1_5.member;

/**
 * MemberRepository 클래스는 Member 객체를 관리하는 저장소 역할을 합니다.
 * CRUD 작업을 수행할 수 있는 메서드를 제공하며 회원 추가,
 * 회원 목록 조회, 특정 조건으로 회원 검색 등의 기능을 수행합니다.
 *
 *
 * @author 고동현
 * @since 2025.06.27 ~
 * @version 1.0
 */

// 회원들의 crud를 담당하는 창고 db 역할
public class MemberRepository {

    // 회원들을 저장할 배열
    // String => ["",,,]
    // int => [10,20,30]
    // Member => [{id:""},{},{}]

    Member[] membersList; // 가입된 회원 배열

    MemberRepository() {
        membersList = new Member[]{
                new Member(15, Gender.MALE, "콩벌레", "abc4567@naver.com", "5678")
                , new Member(20, Gender.FEMALE, "애벌레", "abc2367@naver.com", "8888")
                , new Member(19, Gender.FEMALE, "김치", "abc3617@naver.com", "7777")
        };
    }

    // 메서드

    // 회원 배열을 리턴하는 메서드
    Member[] getMembers() {
        return this.membersList;
    }

    /**
     * 현재 회원 목록에 저장된 회원 수를 반환합니다.
     * memberList.length 필드에 직접 접근하는 대신 메서드를 통해 접근하므로써
     * 내부 구현을 캡슐화하고 향후 회원수를 계산하는 로직이 변경되더라도 사용 코드를 수정할 필요가 없어집니다.
     *
     * @return 회원 모록의 회원 수
     *
     * @author - 고동현
     * @since - 2025.06.27
     */
    int size() {
        return membersList.length;
    }

    /**
     * 새로운 회원을 저장소에 추가합니다.
     *
     * @param newMember 저장소에 추가할 새로운 회원
     */
    void addMember(Member newMember) {
        // 배열에 push를 적용
        // 1. 기존배열보다 1개 더 큰 새로운 배열 생성
        Member[] temp = new Member[membersList.length + 1];
        // 2. 기존배열의 데이터를 복사해서 신규배열에 저장
        for (int i = 0; i < membersList.length; i++) {
            temp[i] = membersList[i];
        }
        // 3. 신규데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newMember;
        // 4. 신규배열을 실제 배열로 변경
        membersList = temp;
    }

    /**
     * 회원 목록에서 주어진 이메일 주소로 회원을 검색합니다.
     * 일치하는 이메일을 가진 회원이 발견되면 해당 회원이 반환됩니다.
     * 일치하는 회원이 없으면 null이 반환됩니다.
     *
     * @param targetEmail 검색할 회원의 이메일 주소
     * @return 해당 이메일을 가진 회원 객체,
     * 해당 이메일을 가진 회원이 없는 경우 null
     */
    Member findMemberByEmail(String targetEmail) {
        for (Member member : membersList) {
            if (targetEmail.equals(member.email)) {
                return member;
            }
        }
        return null; // 탐색에 실패한 경우
    }

    /**
     * 주어진 이메일 주소가 중복되었는지 확인합니다.
     * 이메일이 중복된 경우 true를 반환하고, 그렇지 않으면 false를 반환합니다.
     *
     * @param inputEmail 확인할 이메일 주소
     * @return 이메일이 중복된 경우 true, 중복되지 않으면 false
     */
    boolean isDuplicateEmail(String inputEmail) {
        return findMemberByEmail(inputEmail) != null;
    }
}





