package SpotifyLLD.DeviceConnectorPack;

import SpotifyLLD.SongPlayAdaptor.BluetoothAdaptor;
import SpotifyLLD.SongPlayAdaptor.DeviceAdaptor;
import SpotifyLLD.SongPlayAdaptor.EarPhoneAdaptor;
import SpotifyLLD.SongPlayAdaptor.HeadPhoneAdaptor;

import java.util.HashMap;
import java.util.Map;

public class ObjectStore {


    Map<DeviceType, DeviceAdaptor> getAdaptorMap(){
        Map<DeviceType, DeviceAdaptor> deviceTypeDeviceAdaptorMap = new HashMap<>();
        deviceTypeDeviceAdaptorMap.put(DeviceType.BLUETOOTH, new BluetoothAdaptor());
        deviceTypeDeviceAdaptorMap.put(DeviceType.HEADPHONE, new HeadPhoneAdaptor());
        deviceTypeDeviceAdaptorMap.put(DeviceType.EARPHONE, new EarPhoneAdaptor());

        return deviceTypeDeviceAdaptorMap;
    }
}
