package chap2_4.collection.song;

import java.util.HashSet;
import java.util.Set;

public class Artist {
    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList =  new HashSet<>();
    }

    // 노래 추가
    public boolean addSong(String songTitle) {
        return songList.add(songTitle);

    }

    // getter
    public String getArtistName() {
        return artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }


}