package Adaptor_Design_Pattern;

public enum MediaPlayerEnum {
    MP4("mp4"),
    MP3("mp3"),
    LEGACY("exe"),
    NA("NA");

    public String  codeValue;

    MediaPlayerEnum(String codeValue){
        this.codeValue = codeValue;
    }

    public static MediaPlayerEnum  fromType(String codeValue){
        for(MediaPlayerEnum player: values()){
            if(player.codeValue.equals(codeValue))
                return player;
        }
        return MediaPlayerEnum.NA;
    }
}
