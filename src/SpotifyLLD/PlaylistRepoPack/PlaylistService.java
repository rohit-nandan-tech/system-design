package SpotifyLLD.PlaylistRepoPack;

import SpotifyLLD.SongRepoPack.Song;


public class PlaylistService {

    public void addSongToPlaylist(PlaylistSet user, String playlistName, Song song) {
        Playlist playlist = user.getPlaylist(playlistName);
        if (playlist == null) {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
        playlist = user.createPlaylist(playlistName);
        playlist.addSong(song);
        System.out.println(song + " is added in playlist " + playlistName);
    }

    public void removeSongFromPlaylist(PlaylistSet user, String playlistName, Song songName) {
        Playlist playlist = user.getPlaylist(playlistName);
        if (playlist == null) {
            System.out.println("Playlist '" + playlistName + "' not found.");
            return;
        }
        playlist.removeSong(songName);
    }

    public void showPlaylist(PlaylistSet user, String playlistName) {
        Playlist playlist = user.getPlaylist(playlistName);
        if (playlist == null) {
            System.out.println("Playlist '" + playlistName + "' not found.");
            return;
        }
        System.out.println("🎶 Playlist: " + playlistName);
        playlist.getSongs().forEach(s -> System.out.println(" - " + s.name + " by " + s.artist));
    }
}
