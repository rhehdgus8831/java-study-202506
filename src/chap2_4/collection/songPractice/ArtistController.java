package chap2_4.collection.songPractice;


import chap1_9.static_.util.InputUtils;

import java.util.Set;

// 프로그램의 입출력 처리
public class ArtistController {

    private ArtistRepository repository;

    public ArtistController() {
       this.repository = new ArtistRepository();
    }

    public void start() {


        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
           System.out.printf("# 현재 등록된 가수: %d명\n", repository.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 등록된 가수 전체조회");
            System.out.println("# 4. 프로그램 종료");
            System.out.println("==================================");

            String menuNum = InputUtils.prompt(">> ");

            switch (menuNum) {
                case "1":
                    addArtistProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    // 전체 등록되어있는 가수들의 이름과 노래의 개수를 출력
                    // ex) 동방신기 - 총 4곡
                    //     르세라핌 - 총 2곡
                    showAllArtist();
                    break;
                case "4":
                    System.out.println("# 프로그램을 종료합니까? [y/n]");
                    String exit = InputUtils.prompt(">> ");
                    if (exit.equalsIgnoreCase("y")) {
                        System.exit(0);
                    } else {
                        System.out.println("# 종료를 취소합니다.");
                    }
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }// end switch

            System.out.println("==== 계속하시려면 Enter... ====");
            InputUtils.prompt("");
        }
    } // end start()




    private void addArtistProcess() {
        System.out.println("\n# 노래 등록을 시작합니다.");

        String artistName = InputUtils.prompt("- 가수명 : ");
        String songTitle = InputUtils.prompt("- 노래명 : ");

        // 가수 객체 가져오기
        Artist artist = repository.findArtist(artistName);

        boolean isNewArtist = (artist == null);
        boolean isNewSong = true;

        if (!isNewArtist) {
            // 기존 가수라면, 해당 곡이 이미 등록되어 있는지 확인
            isNewSong = !artist.getSongList().contains(songTitle);
        }

        // 노래 추가
        repository.addNewSong(artistName, songTitle);


        // 피드백 출력
        if (isNewArtist) {
            System.out.printf("# %s님이 신규 등록되었습니다!\n", artistName);
        }

        if (!isNewSong) {
            System.out.printf("# %s곡은 이미 등록된 노래입니다.\n", songTitle);
        }  else{
            System.out.printf("# %s의 곡 %s 등록 완료!\n", artistName, songTitle);
        }

    }

    private void searchProcess() {
        String searchArtist = InputUtils.prompt("# 검색할 가수명을 입력하세요 :");

        // 저장소에서 가수 객체 찾기
        Artist artist = repository.findArtist(searchArtist);

        if (artist == null) {
            System.out.printf("# %s님은 등록된 가수가 아닙니다.\n", searchArtist);
        } else {
            System.out.printf("# %s님의 노래 목록:\n", artist.getArtistName());
            System.out.println("========================================");
            Set<String> songList = artist.getSongList();
            for (String song : songList) {
                System.out.printf("# %s \n", song);
            }

            }
        }

    private void showAllArtist() {

        System.out.println("===== 전체 가수 정보=====");
        for (Artist artist : repository.getAllArtists() ) {
            System.out.printf("# %s - 총 %d곡 \n", artist.getArtistName(),artist.getSongList().size());
        }

    }

}
