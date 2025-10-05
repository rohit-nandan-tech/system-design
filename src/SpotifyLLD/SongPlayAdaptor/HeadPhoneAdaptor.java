package SpotifyLLD.SongPlayAdaptor;

import SpotifyLLD.DevicePlayAPIs.HeadPhoneApi;

public class HeadPhoneAdaptor implements DeviceAdaptor{
    @Override
    public void play(String song) {
        new HeadPhoneApi().play(song);
    }
}
