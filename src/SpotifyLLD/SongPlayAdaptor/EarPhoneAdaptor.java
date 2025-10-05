package SpotifyLLD.SongPlayAdaptor;

public class EarPhoneAdaptor implements DeviceAdaptor{
    @Override
    public void play(String song) {
        new EarPhoneAdaptor().play(song);
    }
}
