package Adaptor_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class ObjectStore {

    Adaptor getAdaptor(){
        return new Adaptor(getPlayerMap());
    }

    Map<MediaPlayerEnum, MediaPlayer> getPlayerMap(){
        Map<MediaPlayerEnum, MediaPlayer> mediaPlayerEnumMediaPlayerMap = new HashMap<>();

        mediaPlayerEnumMediaPlayerMap.put(MediaPlayerEnum.MP3, new Mp3MediaPlayer());
        mediaPlayerEnumMediaPlayerMap.put(MediaPlayerEnum.MP4, new Mp4MediaPlayer());
        mediaPlayerEnumMediaPlayerMap.put(MediaPlayerEnum.LEGACY, new LegacyVideoAdapter()); //actual logic of adaptor design pattern

        return mediaPlayerEnumMediaPlayerMap;
    }
}
