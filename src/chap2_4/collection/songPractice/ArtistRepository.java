package chap2_4.collection.songPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 가수 객체를 자료구조로 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료 구조
    // key : 가수명 , value : 가수 객체
    private Map<String, Artist> artistMap;

    // 생성자
    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    // 1. 새로운 노래 추가
    public void addNewSong(String artistName, String songTitle) {
        Artist artist = artistMap.get(artistName);

        // 가수가 등록되어 있지 않다면 새로 생성
        if (artist == null) {
            artist = new Artist(artistName);
            artistMap.put(artistName, artist);
        }

        // 노래 추가
        artist.addSong(songTitle);
    }

    // 2. 가수 찾기
    public Artist findArtist(String artistName) {
        return artistMap.get(artistName);
    }


    // 3. 전체 가수 목록
    public Collection<Artist> getAllArtists() {
        return artistMap.values();
    }

    // 4. 가수 수
    public int count() {
        return artistMap.size();
    }
}




