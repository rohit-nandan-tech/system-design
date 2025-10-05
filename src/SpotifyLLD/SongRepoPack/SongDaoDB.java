package SpotifyLLD.SongRepoPack;

import java.util.ArrayList;
import java.util.List;

public class SongDaoDB implements SongsDao{
    List<Song> songs = new ArrayList<>();

    public SongDaoDB(){
        songs.add(new Song("Song1", "Artist1"));
        songs.add(new Song("Song2", "Artist2"));
        songs.add(new Song("Song3", "Artist3"));
        songs.add(new Song("Song4", "Artist4"));
    }
    @Override
    public Song getSong(String song) {
        return songs.stream().filter(music-> music.name.equals(song)).findFirst().orElse(null);
    }
}
