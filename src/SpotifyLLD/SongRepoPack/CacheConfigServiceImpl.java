package SpotifyLLD.SongRepoPack;

import java.util.ArrayList;
import java.util.List;

public class CacheConfigServiceImpl implements CacheConfigService{

    //Data
    List<Song> songs = new ArrayList<>();

    //DB's
    SongsDao songsDao;

    public CacheConfigServiceImpl(SongsDao songsDao) {
        this.songsDao = songsDao;
    }

    @Override
    public Song getSong(String song) {
        if(songs.isEmpty())
            return songsDao.getSong(song);
        return songs.stream().filter(music->music.name.equalsIgnoreCase(song)).findFirst().orElse(null);
    }

}
