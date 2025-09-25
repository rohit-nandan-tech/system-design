package Adaptor_Design_Pattern;

import java.util.Map;

public class Adaptor {

    Map<MediaPlayerEnum, MediaPlayer> mediaPlayerEnumMediaPlayerMap;

    Adaptor(Map<MediaPlayerEnum, MediaPlayer> mediaPlayerEnumMediaPlayerMap){
        this.mediaPlayerEnumMediaPlayerMap = mediaPlayerEnumMediaPlayerMap;

    }

    void play(String file){

        String fileType = file.substring(file.lastIndexOf(".") + 1);
        MediaPlayerEnum mediaPlayerEnum  = MediaPlayerEnum.fromType(fileType);

        if(mediaPlayerEnum.equals(MediaPlayerEnum.NA)){
            System.out.println("Unknown file Type");
            return;
        }

        mediaPlayerEnumMediaPlayerMap.get(mediaPlayerEnum).play(file);
    }
}
