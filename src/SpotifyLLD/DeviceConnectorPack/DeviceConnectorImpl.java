package SpotifyLLD.DeviceConnectorPack;

import SpotifyLLD.SongPlayAdaptor.DeviceAdaptor;

public class DeviceConnectorImpl implements DeviceConnector{

    ObjectStore objectStore;

    public DeviceConnectorImpl(ObjectStore objectStore) {
        this.objectStore = objectStore;
    }

    @Override
    public DeviceAdaptor connect(DeviceType deviceType) {
        return objectStore.getAdaptorMap().get(deviceType);

    }
}
