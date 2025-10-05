package SpotifyLLD.DeviceConnectorPack;

import SpotifyLLD.MusicEnginePack.MusicEngine;
import SpotifyLLD.MusicEnginePack.MusicEngineImpl;
import SpotifyLLD.PlaylistRepoPack.PlaylistService;
import SpotifyLLD.PlaylistRepoPack.PlaylistSet;
import SpotifyLLD.SongPlayAdaptor.DeviceAdaptor;
import SpotifyLLD.SongRepoPack.CacheConfigService;
import SpotifyLLD.SongRepoPack.Song;

public class SpotifyManager {

    MusicEngine musicEngine;
    DeviceConnector deviceConnector;
    CacheConfigService cacheConfigService;
    PlaylistService playlistService = new PlaylistService();

    public SpotifyManager(DeviceConnector deviceConnector, CacheConfigService cacheConfigService) {
        this.deviceConnector = deviceConnector;
        this.cacheConfigService = cacheConfigService;
    }

    public DeviceAdaptor Connect(DeviceType deviceType){
        DeviceAdaptor deviceAdaptor = deviceConnector.connect(deviceType);
        System.out.println(deviceType.codeValue.toUpperCase() + " has connected.");
        this.musicEngine = new MusicEngineImpl(deviceAdaptor);
        return deviceAdaptor;
    }

    public void Play(String song){
        musicEngine.play(song);
    }

    public void Pause(){
        musicEngine.pause();
    }

    public Song findSong(String song){
        Song music = cacheConfigService.getSong(song);
        if(music == null) System.out.println(song + " is not available");
        return music;
    }

    // ✅ Playlist operations
    public void addSongToUserPlaylist(PlaylistSet user, String playlistName, Song song) {
        playlistService.addSongToPlaylist(user, playlistName, song);
    }

    public void removeSongFromUserPlaylist(PlaylistSet user, String playlistName, Song songName) {
        playlistService.removeSongFromPlaylist(user, playlistName, songName);
    }

    public void showUserPlaylist(PlaylistSet user, String playlistName) {
        playlistService.showPlaylist(user, playlistName);
    }
}
