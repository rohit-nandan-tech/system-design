package SpotifyLLD.PlaylistRepoPack;

import java.util.HashMap;
import java.util.Map;

public class PlaylistSet {
    String userId;
    Map<String, Playlist> playlists = new HashMap<>();

    public PlaylistSet(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }

    public Playlist createPlaylist(String newPlaylist){
        Playlist playlist = new Playlist(newPlaylist);
        playlists.put(newPlaylist, playlist);
        System.out.println("Playlist '" + newPlaylist + "' created for user " + userId);
        return playlist;
    }

    public Playlist getPlaylist(String playlistName){
        return playlists.get(playlistName);
    }
}
