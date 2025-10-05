package SpotifyLLD.DeviceConnectorPack;

public enum DeviceType {
    BLUETOOTH("bluetooth"),
    HEADPHONE("headphone"),
    EARPHONE("earphone"),
    NA("NA");

    public String codeValue;

    DeviceType(String codeValue){
        this.codeValue = codeValue;
    }

    public static DeviceType fromType(String codeValue){
        for(DeviceType deviceType: values()){
            if(deviceType.codeValue.equals(codeValue))
                return deviceType;
        }
        return DeviceType.NA;
    }

}
