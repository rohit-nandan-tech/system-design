package SpotifyLLD.SongPlayAdaptor;

import SpotifyLLD.DevicePlayAPIs.BluetoothApi;

public class BluetoothAdaptor implements DeviceAdaptor {
    @Override
    public void play(String song) {
        new BluetoothApi().play(song);
    }
}