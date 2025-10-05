package SpotifyLLD.MusicEnginePack;

import SpotifyLLD.SongPlayAdaptor.DeviceAdaptor;

public class MusicEngineImpl implements MusicEngine{
    DeviceAdaptor adaptor;
    String currentSong;

    public MusicEngineImpl(DeviceAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public void play(String song) {
        if(currentSong == null || !currentSong.equals(song))
            this.setCurrentSong(song);
        adaptor.play(song);
    }

    @Override
    public void pause() {
        System.out.println(getCurrentSong() + " is stopped");
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(String currentSong) {
        this.currentSong = currentSong;
    }
}
