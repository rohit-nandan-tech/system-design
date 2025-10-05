package SpotifyLLD.PlaylistRepoPack;

import SpotifyLLD.SongRepoPack.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String playlist;
    List<Song> songs = new ArrayList<>();

    public Playlist(String playlist) {
        this.playlist = playlist;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }
}
