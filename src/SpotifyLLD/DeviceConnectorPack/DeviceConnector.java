package SpotifyLLD.DeviceConnectorPack;

import SpotifyLLD.SongPlayAdaptor.DeviceAdaptor;

public interface DeviceConnector {
    DeviceAdaptor connect(DeviceType deviceType);
}
